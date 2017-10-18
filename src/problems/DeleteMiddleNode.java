package problems;

import DataStructures.MyLinkedList;
import DataStructures.LinkedListNode;

public class DeleteMiddleNode {

	boolean deleteMiddleNode(MyLinkedList linkedList, LinkedListNode linkedListNode) {
		if (linkedList.head() == null || linkedList.head().next() == null) {
			return false;
		}
		linkedListNode.setData(linkedListNode.next().data());
		linkedListNode.setNext(linkedListNode.next().next());
		return true;
	}
}
