package problems;

import DataStructures.MyLinkedList;
import DataStructures.LinkedListNode;

public class KthToLast {

	public LinkedListNode getKthToLast(MyLinkedList linkedList, int k) {
		LinkedListNode runner1 = linkedList.head();
		LinkedListNode runner2 = linkedList.head();

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
