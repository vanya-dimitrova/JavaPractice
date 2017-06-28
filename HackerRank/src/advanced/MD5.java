package advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Scanner;

public class MD5 {

	public static void main(String[] args) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Problem");
		}
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		byte[] md5 = md.digest(s.getBytes());
		StringBuilder str = new StringBuilder();
		for (byte data : md5) {
			str.append(String.format("%02x", data & 0xff));
		}

		System.out.print(str);

	}

}
