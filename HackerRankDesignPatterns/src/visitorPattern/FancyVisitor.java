package visitorPattern;

import visitorPattern.Tree.Color;

public class FancyVisitor extends TreeVis {
	
	 private int sumOfNonLeavesEvenDepth;
	 private int sumOfGreenLeaves;
	    
	    public int getResult() {
	      	int result = sumOfNonLeavesEvenDepth - sumOfGreenLeaves;
	      	if(result < 0){
	      		result *= -1;
	      	}
	        return result;
	    }

	    public void visitNode(TreeNode node) {
	    	if(node.getDepth()%2 == 0){
	    		sumOfNonLeavesEvenDepth += node.getValue();
	    	}
	    }

	    public void visitLeaf(TreeLeaf leaf) {
	    	if(leaf.getColor() == Color.GREEN){
	    		sumOfGreenLeaves += leaf.getValue();
	    	}
	    }

}
