package main.java.hu.mitro.findmaxtreenode;

public class FindMaxValueInTree {

//	static int findMax(TreeNode root) {
//		int max = root.value;
//		if (root.left == null && root.right == null) {
//			return max;
//		} else {
//			if(root.left != null){
//				max = findMax(root.left);
//				if (root.left.value > max) {
//					return root.left.value;
//				} else if (root.right.value > max){
//					return root.right.value;
//				}
//			}
//			if(root.right != null){
//				max = findMax(root.right);
//				if (root.left.value > max) {
//					return root.left.value;
//				} else if (root.right.value > max){
//					return root.right.value;
//				}
//			}
//		}
//		return max;
//	}

	static int max;

	static int findMax(TreeNode root) {
		if (root.left == null && root.right == null) {
			return root.value;
		} else {
			if(root.left != null){
				if(root.left.value > root.value){
					max = root.left.value;
				}
				findMax(root.left);
			}
			if(root.right != null){
				if(root.right.value > root.value){
					max = root.right.value;
				}
				findMax(root.right);
			}
		}
		return max;
	}

}
