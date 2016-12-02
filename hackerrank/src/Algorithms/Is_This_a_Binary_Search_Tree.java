package Algorithms;

public class Is_This_a_Binary_Search_Tree {
	class Node {
		int data;
		Node left;
		Node right;

	}

	boolean isBST(Node root, int min, int max) {
		if (root == null)
			return true;
		if (root.data <= min || root.data >= max)
			return false;
		return (isBST(root.left, min, root.data) && isBST(root.right, root.data, max));
	}

	boolean checkBST(Node root) {
		return isBST(root, -1, 10001);
	}
}
