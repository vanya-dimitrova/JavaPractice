package crackingthecoding;

import java.util.*;

public class Contacts {

    public static void main(String[] args) {
    	
    	 Scanner in = new Scanner(System.in);
         int n = in.nextInt();
        HashMap<String, LinkedHashSet<String>> data = new HashMap<>();
        for(int a0 = 0; a0 < n; a0++){
            String operation = in.next(); 
            System.out.println(operation);
            String contact = in.next();
            System.out.println(contact);
            if(!data.containsKey(operation)){
            	data.put(operation, new LinkedHashSet<>());
            }
            data.get(operation).add(contact);
        }
        in.close();
        if(data.containsKey("find") && data.containsKey("add")){
        	for(String operation: data.get("find")){
                int counter = 0;
            	for(String name: data.get("add")){
            		if(name.startsWith(operation)){
            			counter++;
            		}
            	}
            	System.out.println(counter);
            }
        }
  
        
    }
}