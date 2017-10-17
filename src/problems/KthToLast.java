package problems;

import DataStructures.MyLinkedList;
import DataStructures.MyLinkedList.Node;

public class KthToLast {

	public Node getKthToLast(MyLinkedList linkedList, int k) {
		Node runner1 = linkedList.head();
		Node runner2 = linkedList.head();

		for (int i = 0; i < k; i++) {
			runner2 = runner2.next();
		}
		
		while (runner2.next() != null) {
			runner1 = runner1.next();
			runner2 = runner2.next();
		}
		return runner1;
	}

}
