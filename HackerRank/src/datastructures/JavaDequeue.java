package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class JavaDequeue {

	public static void main(String[] args) {

		// find the maximum number of unique integers
		// among all the possible contiguous subarrays of size m

		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int length = 0;
		int maxLength = 0;
		HashMap<Integer, Integer> tempCollection = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			
			if(deque.size() == m){
				int temp = deque.removeFirst();
				if(tempCollection.get(temp)== 1){
					tempCollection.remove(temp);
					length--;
				}
				else{
					tempCollection.put(temp, tempCollection.get(temp) - 1);
				}
			}
			if(!tempCollection.containsKey(num)){
				tempCollection.put(num, 1);
				length++;
			}
			else{
				tempCollection.put(num, tempCollection.get(num) + 1);
			}
			deque.addLast(num);
			maxLength = maxLength < length ? length: maxLength;
		}
		System.out.print(maxLength);
		in.close();
	}
}
