package visitorPattern;

public abstract class TreeVis {

	 public abstract int getResult();
	    public abstract void visitNode(TreeNode node);
	    public abstract void visitLeaf(TreeLeaf leaf);

}
