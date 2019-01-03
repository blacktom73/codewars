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

	public static TreeNode join(int i, TreeNode left2, TreeNode right2) {
		return new TreeNode(left2, right2, i);
	}

	public TreeNode withLeftLeaf(int i) {
		TreeNode left = new TreeNode(null, null, i);
		return join(this.value, left, null);
	}

	public TreeNode withLeaves(int i, int j) {
		TreeNode left = new TreeNode(null, null, i);
		TreeNode right = new TreeNode(null, null, j);
		return join(this.value, left, right);
	}

	@Override
	public String toString() {
		return "TreeNode { value=" + value + " | left=" + left + ", right=" + right + "	}";
	}
}
