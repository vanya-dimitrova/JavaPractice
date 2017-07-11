package visitorPattern;

import java.util.ArrayList;

public abstract class Tree {
	
	enum Color {
	    RED, GREEN
	}

	    private int value;
	    private Color color;
	    private int depth;

	    public Tree(int value, Color color, int depth) {
	        this.value = value;
	        this.color = color;
	        this.depth = depth;
	    }

	    public int getValue() {
	        return value;
	    }

	    public Color getColor() {
	        return color;
	    }

	    public int getDepth() {
	        return depth;
	    }

	    public abstract void accept(TreeVis visitor);

	
	    public static class TreeLeaf extends Tree {
			
			 public TreeLeaf(int value, Tree.Color color, int depth) {
			        super(value, color, depth);
			    }

			    public void accept(TreeVis visitor) {
			        visitor.visitLeaf(this);
			    }

		}
	    
	    
	    public static class TreeNode extends Tree {
	    	
	   	 private ArrayList<Tree> children = new ArrayList<>();

	   	    public TreeNode(int value, Tree.Color color, int depth) {
	   	        super(value, color, depth);
	   	    }

	   	    public void accept(TreeVis visitor) {
	   	        visitor.visitNode(this);

	   	        for (Tree child : children) {
	   	            child.accept(visitor);
	   	        }
	   	    }

	   	    public void addChild(Tree child) {
	   	        children.add(child);
	   	    }

	   }


}
