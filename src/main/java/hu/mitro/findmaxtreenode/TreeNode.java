package main.java.hu.mitro.findmaxtreenode;

public class TreeNode {

	TreeNode left;
	TreeNode right;
	int value;

	public TreeNode(TreeNode left, TreeNode right, int value) {
		this.left = left;
		this.right = right;
		this.value = value;
	}

	public static TreeNode leaf(int i) {
		return new TreeNode(null, null, i);
	}

	public TreeNode withLeftLeaf(int i) {
		return new TreeNode(new TreeNode(null, null, i), null, value);
	}

	public TreeNode withLeaves(int i, int j) {
		return null;
	}

	public static TreeNode join(int i, TreeNode left2, TreeNode right2) {
		return new TreeNode(left2, right2, i);
	}

}
