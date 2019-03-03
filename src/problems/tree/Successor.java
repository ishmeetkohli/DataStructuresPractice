package problems.tree;

import DataStructures.BinaryNodeWithParent;

public class Successor {

	public int getSuccessor(BinaryNodeWithParent tree, int data) {
		if (tree == null) {
			return Integer.MIN_VALUE;
		}

		int leftResult = getSuccessor(tree.getLeft(), data);

		if (tree.getData() == data) {
			return getSuccessorHelper(tree);
		}

		int rightResult = getSuccessor(tree.getRight(), data);

		if (leftResult != Integer.MIN_VALUE) {
			return leftResult;
		}

		if (rightResult != Integer.MIN_VALUE) {
			return rightResult;
		}

		return Integer.MIN_VALUE;
	}

	private int findLeftMost(BinaryNodeWithParent tree) {
		if (tree.getLeft() == null) {
			return tree.getData();
		}
		return findLeftMost(tree.getLeft());
	}

	private int findRightSuccessor(BinaryNodeWithParent tree) {
		if (tree.getParent() == null) {
			return Integer.MIN_VALUE;
		}

		if (tree == tree.getParent().getRight()) {
			return findRightSuccessor(tree.getParent());
		} else {
			return tree.getParent().getData();
		}
	}

	private int getSuccessorHelper(BinaryNodeWithParent tree) {
		if (tree.getParent() == null && tree.getRight() == null) {
			return Integer.MIN_VALUE;
		} else if (tree.getRight() != null) {
			return findLeftMost(tree.getRight());
		} else {
			if (tree == tree.getParent().getLeft()) {
				return tree.getParent().getData();
			} else {
				return findRightSuccessor(tree);
			}
		}
	}
}
