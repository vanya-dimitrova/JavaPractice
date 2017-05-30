package visitorPattern;

public class TreeLeaf extends Tree {
	
	 public TreeLeaf(int value, Tree.Color color, int depth) {
	        super(value, color, depth);
	    }

	    public void accept(TreeVis visitor) {
	        visitor.visitLeaf(this);
	    }

}
