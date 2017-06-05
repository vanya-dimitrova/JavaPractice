package testDomeChallenges;

public class BsTree {
	
	  static class Node {
	        public int value;
	        public Node left, right;

	        public Node(int value, Node left, Node right) {
	            this.value = value;
	            this.left = left;
	            this.right = right;
	        }
	    }

	
	 public static boolean contains(Node root, int value) {
	        if(root != null){
	        	if(value < root.value){
	        		return contains(root.left, value);
	        		
	        	}
	        	else if(value > root.value){
	        		return contains(root.right, value);
	        	}
	        	else{
	        		return true;
	        	}
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) {
	        Node n1 = new Node(5, null, null);
	        Node n3 = new Node(9, null, null);
	        Node n2 = new Node(6, n1, n3);
	        
	        System.out.println(contains(n2, 6));
	    }
	    
	 
}
