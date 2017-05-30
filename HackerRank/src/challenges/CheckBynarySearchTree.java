package challenges;


public class CheckBynarySearchTree {
	public static void main(String[] args) {
		// root
		Node root = new Node();
		root.data = 8;

		//2  root left
		root.left = new Node();
		root.left.data = 4;
		//3
		root.left.left = new Node();
		root.left.left.data = 2;
		root.left.left.left = new Node();
		root.left.left.left.data = 1;
		root.left.left.right = new Node();
		root.left.left.right.data = 3;
		
		root.left.right = new Node();
		root.left.right.data = 6;
		root.left.right.left = new Node();
		root.left.right.left.data = 5;
		root.left.right.right = new Node();
		root.left.right.right.data = 7;
		//2 root right
		root.right = new Node();
		root.right.data = 12;
		//3
		root.right.left = new Node();
		root.right.left.data = 10;
		root.right.left.left = new Node();
		root.right.left.left.data = 9;
		root.right.left.right = new Node();
		root.right.left.right.data = 11;
		
		root.right.right = new Node();
		root.right.right.data = 14;
		root.right.right.left = new Node();
		root.right.right.left.data = 13;
		root.right.right.right = new Node();
		root.right.right.right.data = 15;

		System.out.println(checkBST(root));

	}

	 static boolean checkBST(Node root) {
			Node rootLeft = root.left;
			if (rootLeft == null) {
				return checkRootRight(root);
			} else if (rootLeft.data < root.data) {
				if (rootLeft.right == null || checkRootLeftRight(rootLeft.right, root.data)) {
					if (!checkBST(rootLeft)) {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
			return checkRootRight(root);
		}
	
	public static boolean checkRootRight(Node root){
		Node rootRight = root.right;
		if (rootRight == null) {
			return true;
		} else if (rootRight.data > root.data) {
			if (rootRight.left == null || checkRootRightLeft(rootRight.left, root.data)) {
				return checkBST(rootRight);
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	public static boolean checkRootRightLeft(Node rootToCheck, int rootDataToCompare){
		if(rootToCheck.data <= rootDataToCompare){
			return false;
		}
		if(rootToCheck.left == null){
			return true;
		}
		else{
			return checkRootRightLeft(rootToCheck.left, rootDataToCompare);
		}			
	}
	
	
	 public static boolean checkRootLeftRight(Node rootToCheck, int rootDataToCompare){
		 if(rootToCheck.data >= rootDataToCompare){
				return false;
			}
			if(rootToCheck.right == null){
				return true;
			}
			else{
				return checkRootLeftRight(rootToCheck.right, rootDataToCompare);
			}			
		}
	 
	 
	 
		public static class Node {
			int data;
			Node left;
			Node right;
		}
		

}
