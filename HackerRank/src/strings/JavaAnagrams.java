package strings;

import java.util.Scanner;

public class JavaAnagrams {

	  static boolean isAnagram(String a, String b) {
		  a = a.toLowerCase();
		  b = b.toLowerCase();
		  char check = a.charAt(0); 
		  if(a.length() != b.length() || b.indexOf(check) < 0){
			  return false;
		  }
		  else if(a.length() == 1 && b.indexOf(check) == 0){
			  return true;
		  }
		  b = b.substring(0, b.indexOf(check)) + b.substring(b.indexOf(check) + 1, b.length());
		  return isAnagram(a.substring(1, a.length()), b);
	    }
	  
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
