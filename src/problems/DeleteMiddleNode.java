package problems;

import DataStructures.MyLinkedList;
import DataStructures.MyLinkedList.Node;

public class DeleteMiddleNode {

	boolean deleteMiddleNode(MyLinkedList linkedList, Node node) {
		if (linkedList.head() == null || linkedList.head().next() == null) {
			return false;
		}
		node.setData(node.next().data());
		node.setNext(node.next().next());
		return true;
	}
}
