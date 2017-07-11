package visitorPattern;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import visitorPattern.Tree.*;
import visitorPattern.TreeVis.*;

public class Solution {

	public static Tree solve() {
		Scanner sc = new Scanner(System.in);
		int numberOfNodes = sc.nextInt();
		sc.nextLine();
		String[] values = sc.nextLine().split(" ");
		String[] colors = sc.nextLine().split(" ");

		TreeMap<Integer, ArrayList<Integer>> edges = new TreeMap<>();
		for (int i = 0; i < numberOfNodes - 1; i++) {
			String[] nextEdge = sc.nextLine().split(" ");
			int key = Integer.parseInt(nextEdge[0]);
			int value = Integer.parseInt(nextEdge[1]);
			if (!edges.containsKey(key)) {
				edges.put(key, new ArrayList<Integer>());
			}
			edges.get(key).add(value);
		}
		Tree root = new TreeNode(Integer.parseInt(values[0]),Integer.parseInt(colors[0]) == 0 ? Color.RED : Color.GREEN, 0);
		ArrayList<Tree> trees = new ArrayList<>();
		trees.add(root);
		for (int i = 1; i < numberOfNodes; i++) {
			int value = Integer.parseInt(values[i]);
			Color color = Integer.parseInt(colors[i]) == 0 ? Color.RED : Color.GREEN;
			int depth = 0;;
			for(int j = i; j > 0; j--){
				if(edges.containsKey(j)){
					depth = trees.get(j - 1).getDepth() + 1;
					break;
				}
			}
			if (edges.containsKey(i + 1)) {
				trees.add(new TreeNode(value, color, depth));
			} else {
				trees.add(new TreeLeaf(value, color, depth));
			}
		}

		for (Integer parent : edges.keySet()) {
			for (int i = 0; i < edges.get(parent).size(); i++) {
				TreeNode node = (TreeNode) trees.get(parent - 1);
				int treePosition = edges.get(parent).get(i) - 1;
				node.addChild(trees.get(treePosition));
			}
		}

		sc.close();
		return root;

	}

	public static void main(String[] args) {
		Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
		ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
		FancyVisitor vis3 = new FancyVisitor();

		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);

		int res1 = vis1.getResult();
		int res2 = vis2.getResult();
		int res3 = vis3.getResult();

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);

	}

}
