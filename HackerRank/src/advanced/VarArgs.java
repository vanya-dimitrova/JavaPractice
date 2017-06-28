package advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VarArgs {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		int n6=Integer.parseInt(br.readLine());

		add(n1,n2);
		add(n1,n2,n3);
		add(n1,n2,n3,n4,n5);	
		add(n1,n2,n3,n4,n5,n6);

	}
	
	public static void add(int...integers){
		ArrayList<Integer> integersArgs = new ArrayList<>();
		 for(int integer : integers){
		        integersArgs.add(integer);
		    }
		     int sum = 0;
		    StringBuilder printLine = new StringBuilder();
		    for(int i = 0; i < integersArgs.size(); i ++){
		        if(i > 0){
		            printLine.append(" + " + integersArgs.get(i));
		            sum += integersArgs.get(i);
		        }
		        else{
		             sum += integersArgs.get(i);
		            printLine.append(integersArgs.get(i));  
		        }   
		    }
		     System.out.println(printLine + " = " + sum);
		}
	  

}
