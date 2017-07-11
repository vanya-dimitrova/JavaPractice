package datastructures;

import java.util.Scanner;

public class JavaArrayGame {

	public static boolean canWin(int leap, int[] game) {
        
		
		// iteration
//		int positionAtFront = 0;
//		int comeBackAtFront = 0;
//
//		while (true) {
//			if (game.length == 0 || leap == 0) {
//				return false;
//			} else if ((positionAtFront + leap) >= game.length) {
//				return true;
//				
//				// leap
//			} else if (game[positionAtFront + leap] == 0) {
//				if (game[(positionAtFront + leap) - 1] == 0) {
//					comeBackAtFront = positionAtFront + leap - 1;
//				}
//				game[positionAtFront] = 1;
//				positionAtFront += leap;
//				
//				// go 1 forward
//			} else if (game[positionAtFront + 1] == 0) {
//				game[positionAtFront] = 1;
//				positionAtFront += 1;
//				
//				// go 1 backwards
//			} else if (comeBackAtFront != 0) {
//				positionAtFront = comeBackAtFront;
//			} else {
//				return false;
//			}
//		}
//	}
   
		// recursion
	 return isPossible(game, leap, 0);
	 }
	
	 private static boolean isPossible(int [] array, int leap, int position) {
	
	 if (position < 0 || array[position] == 1) {
	 return false;
	 } else if (position + 1 >= array.length || position + leap >= array.length) {
	 return true;
	 }
	 array[position] = 1;
	
	 return isPossible(array, leap, position + leap) ||
	 isPossible(array, leap, position + 1) ||
	 isPossible(array, leap, position - 1);
	 }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
