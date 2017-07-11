package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < length; i++){
			list.add(sc.nextInt());
		}
		int queries = sc.nextInt();
		for(int i = 0; i < queries; i++){
			sc.nextLine();
			if(sc.nextLine().equalsIgnoreCase("insert")){
				list.add(sc.nextInt(), sc.nextInt());
			}
			else{
				list.remove(sc.nextInt());
			}
		}
		for(Integer num:list){
			System.out.print(num+" ");
		}
		sc.close();
		

	}

}
