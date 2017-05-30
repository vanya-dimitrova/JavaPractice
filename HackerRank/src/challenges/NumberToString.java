package challenges;

import java.util.*;

public class NumberToString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int length = 1;
		int temp = n;
		while (temp > 1 || temp < -1) {
			length++;
			temp /= 10;
		}
		char[] number = new char[length];
		temp = n;
		if (n < 0) {
			number = new char[length + 1];
			number[0] = '-';
			temp *= -1;
		}
		for (int i = number.length - 1; i >= 0; i--) {
			if (number[i] != '\u0000') {
				continue;
			}
			number[i] = (char) (temp % 10 + 48);
			temp = (temp -temp%10)/10;
		}
		String s = new String(number);

		if (n == Integer.parseInt(s)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer.");
		}

	}

}
