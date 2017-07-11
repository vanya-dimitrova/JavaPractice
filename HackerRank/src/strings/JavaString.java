package strings;

import java.util.Scanner;

public class JavaString {

	 public static void main(String[] args) {
	        
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        System.out.println(A.length() + B.length());
	        if(A.compareTo(B) <= 0){
	                    System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	        }
	        String temp = A.substring(0).toUpperCase();
	        A = A.replace(A.charAt(0), temp.charAt(0));
	        temp = B.substring(0).toUpperCase();
	        B = B.replace(B.charAt(0), temp.charAt(0));
	        System.out.println(A + " " + B);
	        sc.close();
	        
	    }
	}