package problems;

import DataStructures.BinaryNode;

public class CheckBalanced {

	public boolean isBalanced(BinaryNode tree) {
		if (treeHeight(tree) < 0)
			return false;
		return true;
	}

	private int treeHeight(BinaryNode tree) {
		int leftHeight = tree.getLeft() == null ? 0 : treeHeight(tree.getLeft());
		int rightHeight = tree.getRight() == null ? 0 : treeHeight(tree.getRight());

		if (leftHeight < 0 || rightHeight < 0 || Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}

		return Math.max(leftHeight, rightHeight) + 1;
	}

}
