package testDomeChallenges;

public class Palindrome {
	
	 public static boolean isPalindrome(String word) {
	        if(word != null && !word.isEmpty()){
	            StringBuilder wordToCheck = new StringBuilder(word);
	        String reversedWord = (wordToCheck.reverse()).toString();
	        if(word.equalsIgnoreCase(reversedWord)){
	            return true;
	        }
	        return false; 
	        }
	        return false;
	       
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(Palindrome.isPalindrome("Deleveled"));
	    }
	}

