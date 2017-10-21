package problems;
import DataStructures.BinaryNode;

public class DistanceBetweenNodes {

	public int getDistance(BinaryNode tree, int node1, int node2) {
		return -1;
	}

	public BinaryNode commonAncestor(BinaryNode tree, int node1, int node2) {
		if (!findNode(tree, node1) || !findNode(tree, node2)) {
			return null;
		}
		
		return ancestorHelper(tree, node1, node2);
	}

	public BinaryNode ancestorHelper(BinaryNode tree, int node1, int node2) {
		if (tree.getData() == node1 || tree.getData() == node2) {
			return tree;
		}

		boolean node1OnLeft = findNode(tree.getLeft(), node1);
		boolean node2OnLeft = findNode(tree.getLeft(), node2);

		if (node1OnLeft != node2OnLeft) {
			return tree;
		}

		BinaryNode next = node1OnLeft ? tree.getLeft() : tree.getRight();

		return ancestorHelper(next, node1, node2);
	}

	public boolean findNode(BinaryNode tree, int node) {
		if (tree == null) {
			return false;
		}

		if (tree.getData() == node) {
			return true;
		}

		boolean left = findNode(tree.getLeft(), node);
		boolean right = findNode(tree.getRight(), node);

		return left || right;
	}

}
