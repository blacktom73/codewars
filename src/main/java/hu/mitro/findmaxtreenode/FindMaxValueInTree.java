package main.java.hu.mitro.findmaxtreenode;

import java.util.List;


public class FindMaxValueInTree {

	static List<Integer> nodeValues;

	static int findMax(TreeNode root) {
		collectNodeValues(root);
		nodeValues.sort(null);
		return nodeValues.get(nodeValues.size() - 1);
	}

	private static void collectNodeValues(TreeNode root) {
		nodeValues.add(root.value);
		if (root.left != null && root.right == null) {
			collectNodeValues(root.left);
		}
		if (root.left == null && root.right != null) {
			collectNodeValues(root.right);
		}
		if (root.left != null && root.right != null) {
			collectNodeValues(root.left);
			collectNodeValues(root.right);
		}
	}

}
