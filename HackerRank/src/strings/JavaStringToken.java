package strings;

import java.util.Scanner;

public class JavaStringToken {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		if (scan.hasNext()) {
			String s = scan.nextLine();
			String[] splitted = s.trim().split("[!+,+?+.+_+'+@+,+\\s+]+[!+,+?+.+_+'+@+,+\\s+]?");
			scan.close();
			System.out.println(splitted.length);
			for (String a : splitted) {
				System.out.println(a);
			}
		} else {
			System.out.println(0);
		}

	}
}
