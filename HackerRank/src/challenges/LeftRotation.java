package challenges;

import java.util.*;

public class LeftRotation {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
			int[] arrTemp = new int[k];
			int counter = 0;
			for (int i = 0; i < a.length; i++) {
				if (i < arrTemp.length) {
					arrTemp[i] = a[i];
				}
				if ((i + k) >= a.length) {
					a[i] = arrTemp[counter++];
				}
				else{
					a[i] = a[i + k];
				}
				System.out.print(a[i] + " ");
			}
			in.close();
			
			
		
	    }
	    
	    

		
	    
	}

