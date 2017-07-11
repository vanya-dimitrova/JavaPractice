package datastructures;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			int[] arr = new int[length];
			for(int i = 0; i < length; i++){
				arr[i] = sc.nextInt();
			}
			int counter = 0;
			int sum = 0;
			for(int i = 0; i < length; i++){
	            sum = arr[i];
				if(arr[i] < 0){
					counter++;
				}
				for(int j = i + 1; j < length; j++){
					if((sum += arr[j]) < 0){
						counter++;
					}
				}
			}
			System.out.println(counter);
			sc.close();
			
			

		}

	}