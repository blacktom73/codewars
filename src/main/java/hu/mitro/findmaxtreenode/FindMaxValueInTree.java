package main.java.hu.mitro.findmaxtreenode;

public class FindMaxValueInTree {

	static int max = Integer.MIN_VALUE;

	static int findMax(TreeNode root) {
		if (root.left == null && root.right == null) {
			return root.value > max ? root.value : max;
		} else {
			if (root.left != null && root.right == null) {
				max = findMax(root.left);
			}
			if (root.left == null && root.right != null) {
				max = findMax(root.right);
			}
			if (root.left != null && root.right != null) {
				max = Integer.max(findMax(root.left), findMax(root.right));
			}
		}
		return max;
	}

}
