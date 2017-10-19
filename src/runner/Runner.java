package runner;

import java.util.ArrayList;

import DataStructures.BinaryNode;
import DataStructures.MyLinkedList;
import problems.CheckBalanced;
import problems.ListOfDepths;
import problems.MinimalTree;
import problems.ValidateBST;
import utils.Utils;

public class Runner {
	public static void main(String[] args) {
		// OneAway problem = new OneAway();
		// Boolean result = problem.isOneAway("bake", "pale");
		// System.out.println(result);

		// StringCompression compressor = new StringCompression();
		// String result = compressor.compress("aabccccccab");
		// System.out.println(result);

		// RotateMatrix rotateMatrix = new RotateMatrix();
		// int[][] A = new int[5][5];
		//
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 5 ; j++) {
		// A[i][j] = i*5 +j;
		// }
		// }
		//
		// Utils.printMatrix(A);
		// rotateMatrix.rotateMatrix(A);
		// System.out.println("\n\n");
		// Utils.printMatrix(A);

		// ZeroMatrix zeroMatrix = new ZeroMatrix();
		// int[][] A = new int[5][5];
		//
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 5 ; j++) {
		// A[i][j] = i*5 +j;
		// }
		// }
		//
		// A[2][2] = 0;
		//
		// Utils.printMatrix(A);
		// zeroMatrix.zeroMatrix(A);
		// System.out.println("\n\n");
		// Utils.printMatrix(A);

		// MyLinkedList linkedList = new MyLinkedList();
		// linkedList.insert(3);
		// linkedList.insert(5);
		// linkedList.insert(8);
		// linkedList.insert(5);
		// linkedList.insert(10);
		// linkedList.insert(2);
		// linkedList.insert(1);
		//
		// linkedList.print();
		//
		// PartitionLinkedList partition = new PartitionLinkedList();
		// Node head = partition.partition(linkedList, 5);
		// linkedList.setHead(head);
		// System.out.println("Partitioned result :");
		// linkedList.print();

		// MyLinkedList list1 = new MyLinkedList();
		// list1.insert(7);
		// list1.insert(1);
		// list1.insert(6);
		//// list1.insert();
		//
		// MyLinkedList list2 = new MyLinkedList();
		// list2.insert(5);
		// list2.insert(9);
		// list2.insert(4);
		//// list2.insert(1);
		//
		// list1.print();
		// list2.print();
		//
		// SumLists sumLists = new SumLists();
		//// MyLinkedList sumList = sumLists.sumLists(list1, list2);
		// MyLinkedList sumList = sumLists.sumListsRecusre(list1, list2);
		// System.out.println("Sum List :");
		// sumList.print();

		// Trees
		// Node node0 = new Node();
		// Node node1 = new Node();
		// Node node2 = new Node();
		// Node node3 = new Node();
		// Node node4 = new Node();
		// Node node5 = new Node();
		// node0.addNeighbour(node1);
		// node0.addNeighbour(node5);
		// node0.addNeighbour(node4);
		//
		// node1.addNeighbour(node3);
		// node1.addNeighbour(node4);
		//
		// node2.addNeighbour(node1);
		//
		// node3.addNeighbour(node2);
		// node3.addNeighbour(node4);
		//
		// RouteBetweenNodes routeBetweenNodes = new RouteBetweenNodes();
		// boolean result = routeBetweenNodes.routeExists(node0, node3);
		// System.out.println(result);

		// Minimal Tree
		int n = 15;
		int[] numberArray = new int[n];
		for (int i = 0; i < n; i++) {
			numberArray[i] = i;
		}

		MinimalTree minimalTree = new MinimalTree();
		BinaryNode tree = minimalTree.createMinimalTree(numberArray);

		// Utils.printBinaryTree(tree, "", "─");

		// Lists of depths

		// ListOfDepths listOfDepths = new ListOfDepths();
		// ArrayList<MyLinkedList> lists = listOfDepths.getListOfDepths(tree);
		//
		// for(MyLinkedList list : lists) {
		// System.out.println();
		// list.print();
		// }

		// Check Balanced
		// CheckBalanced checkBalanced = new CheckBalanced();
		//
		// BinaryNode unbalancedTree = tree;
		// while(tree.getRight() != null) {
		// tree = tree.getRight();
		// }
		//
		// tree.setRight(new BinaryNode(45));
		// tree = tree.getRight();
		// tree.setRight(new BinaryNode(55));
		//
		// Utils.printBinaryTree(unbalancedTree, "", "─");

		// boolean result = checkBalanced.isBalanced(unbalancedTree);
		// System.out.println(result);

		// Validate BST
		ValidateBST validateBST = new ValidateBST();
		BinaryNode notABinarySearchTree = tree;
		
		while (tree.getRight() != null) {
			tree = tree.getRight();
		}
		
		tree.setLeft(new BinaryNode(13));
//		tree = tree.getRight();
//		tree.setRight(new BinaryNode(55));
		
		Utils.printBinaryTree(notABinarySearchTree, "", "─");
		boolean result = validateBST.validate(notABinarySearchTree);
		System.out.println(result);

	}
}
