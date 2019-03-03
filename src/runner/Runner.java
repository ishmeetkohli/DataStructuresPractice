package runner;

import DataStructures.Animal;
import problems.AnimalShelter;
import problems.QueueViaStacks;
import problems.SetOfStacks;
import problems.SortStack;
import sorting.MergeSort;

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
		// int n = 15;
		// int[] numberArray = new int[n];
		// for (int i = 0; i < n; i++) {
		// numberArray[i] = i;
		// }

		// MinimalTree minimalTree = new MinimalTree();
		// BinaryNode problems.tree = minimalTree.createMinimalTree(numberArray);

		// Utils.printBinaryTree(problems.tree, "", "─");

		// Lists of depths

		// ListOfDepths listOfDepths = new ListOfDepths();
		// ArrayList<MyLinkedList> lists = listOfDepths.getListOfDepths(problems.tree);
		//
		// for(MyLinkedList list : lists) {
		// System.out.println();
		// list.print();
		// }

		// Check Balanced
		// CheckBalanced checkBalanced = new CheckBalanced();
		//
		// BinaryNode unbalancedTree = problems.tree;
		// while(problems.tree.getRight() != null) {
		// problems.tree = problems.tree.getRight();
		// }
		//
		// problems.tree.setRight(new BinaryNode(45));
		// problems.tree = problems.tree.getRight();
		// problems.tree.setRight(new BinaryNode(55));
		//
		// Utils.printBinaryTree(unbalancedTree, "", "─");

		// boolean result = checkBalanced.isBalanced(unbalancedTree);
		// System.out.println(result);

		// Validate BST
		// ValidateBST validateBST = new ValidateBST();
		// BinaryNode notABinarySearchTree = problems.tree;
		//
		// while (problems.tree.getRight() != null) {
		// problems.tree = problems.tree.getRight();
		// }

		// problems.tree.setLeft(new BinaryNode(13));
		// problems.tree = problems.tree.getRight();
		// problems.tree.setRight(new BinaryNode(55));

		// MinimalTree minimalTree = new MinimalTree();
		// BinaryNodeWithParent problems.tree =
		// minimalTree.createMinimalTreeWithParent(numberArray);
		// Utils.printBinaryTreeWithParent(problems.tree, "", "─");
		//
		// Successor successor = new Successor();
		// int result = successor.getSuccessor(problems.tree, 10);
		// System.out.println(result == Integer.MIN_VALUE ? "notFound" :
		// result);

		// boolean result = validateBST.validate(notABinarySearchTree);
		// System.out.println(result);

		// Get Successor
		// BinaryNodeWithParent node 1

		// BuildOrder
		// BuildOrder buildOrder = new BuildOrder();
		// List<String> projectList = Arrays.asList("a","b","c","d","e","f");
		//
		// List<List<String>> dependencyList = Arrays.asList(
		// Arrays.asList("a","d"),
		// Arrays.asList("f","b"),
		// Arrays.asList("b","d"),
		// Arrays.asList("f","a"),
		// Arrays.asList("d","c"));
		//
		// List<String> buildOrderList = buildOrder.findBuildOrder(projectList,
		// dependencyList);
		// System.out.println(buildOrderList);

		// Stack of Plates

		// SetOfStacks setOfStacks = new SetOfStacks(5);
		//
		// setOfStacks.push(1);
		// setOfStacks.push(2);
		// setOfStacks.push(3);
		// setOfStacks.push(4);
		// setOfStacks.push(5);
		//
		// setOfStacks.push(6);
		// setOfStacks.push(7);
		// setOfStacks.push(8);
		// setOfStacks.push(9);
		// setOfStacks.push(10);
		//
		// setOfStacks.push(11);
		//
		// System.out.println(setOfStacks.popAt(1));
		// System.out.println(setOfStacks.popAt(1));
		// System.out.println(setOfStacks.popAt(1));
		// System.out.println(setOfStacks.popAt(1));
		// System.out.println(setOfStacks.popAt(1));
		// System.out.println(setOfStacks.pop());
		// System.out.println(setOfStacks.pop());

		// Queue via Stacks

		// QueueViaStacks queueViaStacks = new QueueViaStacks();
		// queueViaStacks.insert(1);
		// queueViaStacks.insert(2);
		// queueViaStacks.insert(3);
		// queueViaStacks.insert(4);
		// queueViaStacks.insert(5);
		// System.out.println(queueViaStacks.delete());
		// queueViaStacks.insert(6);
		// System.out.println(queueViaStacks.delete());
		// System.out.println(queueViaStacks.delete());
		// System.out.println(queueViaStacks.delete());
		// System.out.println(queueViaStacks.delete());
		// System.out.println(queueViaStacks.delete());

		// Sort Stack
		// SortStack sortStack = new SortStack();
		//
		// sortStack.push(4);
		// sortStack.push(1);
		// sortStack.push(5);
		// sortStack.push(2);
		// sortStack.push(3);
		//
		// System.out.println(sortStack.pop());
		// System.out.println(sortStack.pop());
		// System.out.println(sortStack.pop());
		// System.out.println(sortStack.pop());
		// System.out.println(sortStack.pop());
		// System.out.println(sortStack.pop());

		// Animal Shelter

		// AnimalShelter animalShelter = new AnimalShelter();
		// animalShelter.enqueue(new Animal("apple", Animal.CAT));
		// animalShelter.enqueue(new Animal("ball", Animal.DOG));
		// animalShelter.enqueue(new Animal("cat", Animal.CAT));
		// animalShelter.enqueue(new Animal("dog", Animal.DOG));
		// animalShelter.enqueue(new Animal("elephant", Animal.DOG));
		// animalShelter.enqueue(new Animal("fridge", Animal.CAT));
		//
		// System.out.println(animalShelter.dequeueDog().getName());
		// System.out.println(animalShelter.dequeueAny().getName());
		// System.out.println(animalShelter.dequeueAny().getName());
		// System.out.println(animalShelter.dequeueAny().getName());
		// System.out.println(animalShelter.dequeueAny().getName());

		// Merge Sort
		MergeSort mergeSort = new MergeSort();
		int[] array = { 9, 5, 1, 4, 8, 10, 2, 7, 13 };
		mergeSort.mergeSort(array);
		int i;
		for (i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println(array[i]);
	}
}
