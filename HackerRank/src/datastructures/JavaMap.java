package datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> phonebook = new HashMap<>();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			int phone = sc.nextInt();
			sc.nextLine();
			phonebook.put(name, phone);
		}
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if(phonebook.containsKey(s)){
				System.out.println(s + "=" + phonebook.get(s));
			}
			else{
				System.out.println("Not found");
			}
		}
		sc.close();
	}
}
