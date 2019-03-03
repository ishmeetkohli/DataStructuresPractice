/**
 * Q 2.5 : Cracking the Coding Interview, 6th Edition 
 */

package problems;

import DataStructures.MyLinkedList;
import DataStructures.LinkedListNode;

public class SumLists {

	public MyLinkedList sumLists(MyLinkedList list1, MyLinkedList list2) {
		MyLinkedList sumLists = new MyLinkedList();
		LinkedListNode runner1 = list1.head();
		LinkedListNode runner2 = list2.head();

		int borrow = 0;
		while (runner1 != null || runner2 != null || borrow > 0) {
			int sum = 0;

			if (runner1 != null) {
				sum += runner1.data();
				runner1 = runner1.next();
			}

			if (runner2 != null) {
				sum += runner2.data();
				runner2 = runner2.next();
			}

			sum += borrow;
			borrow = 0;

			if (sum > 9) {
				borrow = sum / 10;
				sum = sum % 10;
			}

			sumLists.insert(sum);
		}

		return sumLists;
	}

	public MyLinkedList sumListsRecusre(MyLinkedList list1, MyLinkedList list2) {
		return new MyLinkedList(sumNode(list1.head(), list2.head(), 0));
	}

	public LinkedListNode sumNode(LinkedListNode node1, LinkedListNode node2, int carry) {
		if (node1 == null && node2 == null && carry == 0) {
			return null;
		}

		int sum = carry;
		if (node1 != null) {
			sum += node1.data();
		}

		if (node2 != null) {
			sum += node2.data();
		}

		carry = sum / 10;
		sum = sum % 10;

		LinkedListNode next = sumNode(node1 == null ? null : node1.next(), node2 == null ? null : node2.next(), carry);
		LinkedListNode result = new LinkedListNode(sum);
		result.setNext(next);

		return (result);
	}

	public MyLinkedList sumListsRecusreReverse(MyLinkedList list1, MyLinkedList list2) {
		return new MyLinkedList(sumNodeReverse(list1.head(), list2.head(), 0));
	}

	public LinkedListNode sumNodeReverse(LinkedListNode node1, LinkedListNode node2, int carry) {
		// if (node1 == null && node2 == null && carry == 0) {
		// return null;
		// }

		int sum = carry;
		if (node1 != null) {
			sum += node1.data();
		}

		if (node2 != null) {
			sum += node2.data();
		}

		carry = sum / 10;
		sum = sum % 10;

		LinkedListNode next = sumNode(node1.next(), node2.next(), carry);
		LinkedListNode result = new LinkedListNode(sum);
		result.setNext(next);

		return (result);
	}

}
