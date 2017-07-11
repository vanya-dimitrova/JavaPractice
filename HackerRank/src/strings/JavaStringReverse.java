package strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		StringBuilder reverse = new StringBuilder(A).reverse();
		String B = reverse.toString();
		
		if(A.equals(B)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

		
		sc.close();
	}

}
