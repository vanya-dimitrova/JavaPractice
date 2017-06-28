package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryAndCatch {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	      
         try{
           int leftOperand = sc.nextInt();
           int rightOperand = sc.nextInt();
            System.out.print(leftOperand/rightOperand);
        }
        catch(RuntimeException e){
        	if(e instanceof InputMismatchException){
        		System.out.println("java.util.InputMismatchException");
        	}
        	else{
        		System.out.println("java.lang.ArithmeticException: / by zero");
        	}  
        } 
       sc.close();
       
    }


}
