package problems;

import DataStructures.BinaryNode;
import DataStructures.BinaryNodeWithParent;

public class MinimalTree {

	public BinaryNode createMinimalTree(int[] array) {
		BinaryNode rootNode = createTree(array, 0, array.length - 1);
		return rootNode;
	}

	private BinaryNode createTree(int[] array, int startIndex, int endIndex) {
		if (startIndex > endIndex)
			return null;

		int mid = (startIndex + endIndex) / 2;
		BinaryNode node = new BinaryNode(array[mid]);

		BinaryNode leftNode = createTree(array, startIndex, mid - 1);
		BinaryNode rightNode = createTree(array, mid + 1, endIndex);

		node.setLeft(leftNode);
		node.setRight(rightNode);
		return node;
	}

	public BinaryNodeWithParent createMinimalTreeWithParent(int[] array) {
		BinaryNodeWithParent rootNode = createTreeWithParent(array, 0, array.length - 1);
		return rootNode;
	}

	private BinaryNodeWithParent createTreeWithParent(int[] array, int startIndex, int endIndex) {
		if (startIndex > endIndex)
			return null;

		int mid = (startIndex + endIndex) / 2;
		BinaryNodeWithParent node = new BinaryNodeWithParent(array[mid]);

		BinaryNodeWithParent leftNode = createTreeWithParent(array, startIndex, mid - 1);
		BinaryNodeWithParent rightNode = createTreeWithParent(array, mid + 1, endIndex);

		node.setLeft(leftNode);
		node.setRight(rightNode);

		if (leftNode != null) {
			leftNode.setParent(node);
		}

		if (rightNode != null) {
			rightNode.setParent(node);
		}

		return node;
	}

}
