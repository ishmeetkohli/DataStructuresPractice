package utils;

import DataStructures.BinaryNode;
import DataStructures.BinaryNodeWithParent;

public class Utils {
	public static void printMatrix(int[][] matrix) {
		int M = matrix.length;
		int N = matrix[0].length;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	public static final String SPACE = "    ";

	public static void printBinaryTree(BinaryNode node, String prefix, String childPrefix) {
		System.out.println(prefix + "└─" + childPrefix + " " + node.getData());

		if (node.getLeft() != null) {
			printBinaryTree(node.getLeft(), prefix + SPACE, "L");
		}

		if (node.getRight() != null) {
			printBinaryTree(node.getRight(), prefix + SPACE, "R");
		}
	}
	
	public static void printBinaryTreeWithParent(BinaryNodeWithParent node, String prefix, String childPrefix) {
		System.out.println(prefix + "└─" + childPrefix + " " + node.getData());

		if (node.getLeft() != null) {
			printBinaryTreeWithParent(node.getLeft(), prefix + SPACE, "L");
		}

		if (node.getRight() != null) {
			printBinaryTreeWithParent(node.getRight(), prefix + SPACE, "R");
		}
	}
	
}
