package strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = s.substring(0, k);
	        String largest = "";
	        
	        for(int i = 0; i <= s.length() - k; i++){
	            String subString = s.substring(i, i+k);
	            if(smallest.compareTo(subString) >= 0){
	                 smallest = subString; 
	            }
	            if(largest.compareTo(subString) <= 0){
	                 largest = subString;
	            }
	         }
	    
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}
