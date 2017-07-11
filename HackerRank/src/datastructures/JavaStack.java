package datastructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			boolean balanced = true;
			char[] chars = input.toCharArray();
			Stack<Character> parentheses = new Stack<>();
			for (int i = chars.length - 1; i >= 0; i--) {
				switch (chars[i]) {
				case 41:
				case 93:
				case 125:
					if(i == 0){
						balanced = false;
					}
					parentheses.push(chars[i]);
					break;
				case 40:
					if (parentheses.size() == 0 || parentheses.pop() != 41) {
						balanced = false;
					}
					break;
				case 91:
					if (parentheses.size() == 0 || parentheses.pop() != 93) {
						balanced = false;
					}
					break;
				case 123:
					if (parentheses.size() == 0 || parentheses.pop() != 125) {
						balanced = false;
					}
					break;
				}
				if (!balanced) {
					break;
				}
			}
			if(parentheses.size() != 0){
				balanced = false;
			}
			System.out.println(balanced);
		}

		sc.close();

	}
}
