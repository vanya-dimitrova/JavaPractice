package visitorPattern;

public class SumInLeavesVisitor extends TreeVis {
	
	 private int sumInLeaves;
	    
	    public int getResult() {
	        return sumInLeaves;
	    }

	    public void visitNode(TreeNode node) {
	    	sumInLeaves += 0;
	    }

	    public void visitLeaf(TreeLeaf leaf) {
	    	sumInLeaves += leaf.getValue();
	    }

}
