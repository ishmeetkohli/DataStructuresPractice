package runner;

import DataStructures.MyLinkedList;
import DataStructures.MyLinkedList.Node;
import problems.PartitionLinkedList;

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

		MyLinkedList linkedList = new MyLinkedList();
		linkedList.insert(3);
		linkedList.insert(5);
		linkedList.insert(8);
		linkedList.insert(5);
		linkedList.insert(10);
		linkedList.insert(2);
		linkedList.insert(1);

		linkedList.print();

		PartitionLinkedList partition = new PartitionLinkedList();
		Node head = partition.partition(linkedList, 5);
		linkedList.setHead(head);
		System.out.println("Partitioned result :");
		linkedList.print();
	}
}
