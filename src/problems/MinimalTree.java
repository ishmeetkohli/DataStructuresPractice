package problems;

import DataStructures.BinaryNode;

public class MinimalTree {

	public BinaryNode createMinimalTree(int[] array) {
		BinaryNode rootNode = createTree(array, 0, array.length - 1);
		return rootNode;
	}

	private BinaryNode createTree(int[] array, int startIndex, int endIndex) {
		if (startIndex > endIndex)
			return null;
		
		int mid = (startIndex + endIndex)  / 2;
		BinaryNode node = new BinaryNode(array[mid]);

		BinaryNode leftNode = createTree(array, startIndex, mid - 1);
		BinaryNode rightNode = createTree(array, mid + 1, endIndex);

		node.setLeft(leftNode);
		node.setRight(rightNode);
		return node;
	}
	
	

}
