package visitorPattern;

import visitorPattern.Tree.Color;

public class ProductOfRedNodesVisitor extends TreeVis {
	
	 private int productOfRedNodes = 1;
	 private long prime = 1000000007;
	    
	    public int getResult() {
	        return productOfRedNodes;
	    }

	    public void visitNode(TreeNode node) {
	    	if(node.getColor() == Color.RED){
	      		if(node.getValue() == 0){
	      			productOfRedNodes *= 1;
	      		}
	      		else{
	      			long temp = productOfRedNodes;
	      			long multiplier = node.getValue()% prime;
	      			temp = temp*multiplier;
                    temp = temp%prime;
                    productOfRedNodes = (int)temp;
	      		}
	      	}
	    }

	    public void visitLeaf(TreeLeaf leaf) {
	    	if(leaf.getColor() == Color.RED){
	      		if(leaf.getValue() == 0){
	      			productOfRedNodes *= 1;
	      		}
	      		else{
	      			long temp = productOfRedNodes;
	      			long multiplier = leaf.getValue()% prime;
	      			temp = temp*multiplier;
                    temp = temp%prime;
                    productOfRedNodes = (int)temp;
	      		}
	      	}
	    }

}
