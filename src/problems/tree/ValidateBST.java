package problems.tree;

import DataStructures.BinaryNode;

public class ValidateBST {

	public boolean validate(BinaryNode tree) {
		if (tree == null)
			return true;

		int leftMax = getMax(tree.getLeft());
		int rightMin = getMin(tree.getRight());

		if (leftMax < tree.getData() && rightMin >= tree.getData()) {
			return true;
		}

		return false;
	}

	private int getMax(BinaryNode tree) {
		if (tree == null) {
			return Integer.MIN_VALUE;
		}

		int leftMax = getMax(tree.getLeft());
		int rightMin = getMin(tree.getRight());

		if (leftMax >= tree.getData() || rightMin < tree.getData()) {
			return Integer.MAX_VALUE;
		}

		return Math.max(rightMin == Integer.MAX_VALUE ? Integer.MIN_VALUE : rightMin, Math.max(leftMax, tree.getData()));
	}

	private int getMin(BinaryNode tree) {
		if (tree == null) {
			return Integer.MAX_VALUE;
		}

		int leftMax = getMax(tree.getLeft());
		int rightMin = getMin(tree.getRight());

		if (leftMax >= tree.getData() || rightMin < tree.getData()) {
			return Integer.MIN_VALUE;
		}

		return Math.min(leftMax == Integer.MIN_VALUE ? Integer.MAX_VALUE : leftMax, Math.min(rightMin, tree.getData()));
	}
}
