package Algorithms;

import java.util.ArrayList;

public class Tree_Algorithms {
	class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	// Height_of_a_Binary_Tree
	public static int height(Node root) {
		if (root == null) {
			return -1;
		} else {
			return 1 + Math.max(height(root.left), height(root.right));

		}
	}

	// Level Order Traversal
	void LevelOrder(Node root) {
		ArrayList<Node> arr = new ArrayList<Node>();
		if (root != null) {
			arr.add(root);
			while (arr.size() != 0) {
				Node n = arr.remove(0);
				System.out.print(n.data + " ");
				if (n.left != null) {
					arr.add(n.left);
				}
				if (n.right != null) {
					arr.add(n.right);
				}
			}
		}
	}
}
