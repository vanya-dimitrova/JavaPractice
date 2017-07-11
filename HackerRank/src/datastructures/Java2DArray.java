package datastructures;

import java.util.Scanner;

public class Java2DArray {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int squareMatrixLength = 6;
	        int arr[][] = new int[squareMatrixLength][squareMatrixLength];
	        for(int i=0; i < squareMatrixLength; i++){
	            for(int j=0; j < squareMatrixLength; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        int row = 0;
	        int col = 0;
	        int sum = 0;
	        int maxSum = 0;
	        int endOfLoop = squareMatrixLength - 2;
	        for(int i = 0; i < endOfLoop*endOfLoop; i++){
	            if(i == endOfLoop || i == endOfLoop*2 || i == endOfLoop*3){
	                row++;
	                col = 0;
	            }
	            sum = arr[row][col] +arr[row][col+1] + arr[row][col+2] 
	                + arr[row+1][col+1] 
	                + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
	            if(maxSum < sum || (row == 0 && col == 0)){
	                maxSum = sum;
	            }
	            col++;
	        }
	        System.out.print(maxSum);
	        in.close();


	}

}
