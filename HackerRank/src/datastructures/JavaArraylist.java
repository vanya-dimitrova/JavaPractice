package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			int quantity = sc.nextInt();
			ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
			for(int i = 0; i < quantity; i++){
				lists.add(new ArrayList<>());
				int listLength = sc.nextInt();
				while(listLength-- > 0){
					lists.get(i).add(sc.nextInt());
				}
			}
			quantity = sc.nextInt();
	        sc.nextLine();
			for(int i = 0; i < quantity; i++){
				String[] queries = sc.nextLine().split(" ");
				int positionOfList = Integer.parseInt(queries[0]) - 1;
				int positionOfNumber = Integer.parseInt(queries[1]) - 1;
				if(lists.size() > positionOfList && lists.get(positionOfList).size() > positionOfNumber){
					System.out.println(lists.get(positionOfList).get(positionOfNumber));
				}
				else{
					System.out.println("ERROR!");
				}
			}
			sc.close();
				
		}

	}
