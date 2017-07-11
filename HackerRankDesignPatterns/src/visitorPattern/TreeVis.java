package visitorPattern;

import visitorPattern.Tree.*;

public abstract class TreeVis {

	public abstract int getResult();

	public abstract void visitNode(TreeNode node);

	public abstract void visitLeaf(TreeLeaf treeLeaf);

	public static class SumInLeavesVisitor extends TreeVis {

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

	public static class ProductOfRedNodesVisitor extends TreeVis {

		private int productOfRedNodes = 1;
		private long prime = 1000000007;

		public int getResult() {
			return productOfRedNodes;
		}

		public void visitNode(TreeNode node) {
			if (node.getColor() == Color.RED) {
				if (node.getValue() == 0) {
					productOfRedNodes = 1;
				} else {
					long temp = productOfRedNodes;
					long multiplier = node.getValue() % prime;
					temp = (temp * multiplier) % prime;
					productOfRedNodes = (int) temp;
				}
			}
		}

		public void visitLeaf(TreeLeaf leaf) {
			if (leaf.getColor() == Color.RED) {
				if (leaf.getValue() == 0) {
					productOfRedNodes = 1;
				} else {
					long temp = productOfRedNodes;
					long multiplier = leaf.getValue() % prime;
					temp = (temp * multiplier) % prime;
					productOfRedNodes = (int) temp;
				}
			}
		}

	}

	public static class FancyVisitor extends TreeVis {

		private int sumOfNonLeavesEvenDepth;
		private int sumOfGreenLeaves;

		public int getResult() {
			int result = sumOfNonLeavesEvenDepth - sumOfGreenLeaves;
			if (result < 0) {
				result *= -1;
			}
			return result;
		}

		public void visitNode(TreeNode node) {
			if (node.getDepth() % 2 == 0) {
				sumOfNonLeavesEvenDepth += node.getValue();
			}
		}

		public void visitLeaf(TreeLeaf leaf) {
			if (leaf.getColor() == Color.GREEN) {
				sumOfGreenLeaves += leaf.getValue();
			}
		}

	}

}
