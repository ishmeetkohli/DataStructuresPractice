package problems.tree;

import java.util.ArrayList;

import DataStructures.BinaryNode;
import DataStructures.MyLinkedList;

public class ListOfDepths {

	public ArrayList<MyLinkedList> getListOfDepths(BinaryNode tree) {
		ArrayList<MyLinkedList> depthList = new ArrayList<MyLinkedList>();
		assignListAtDepth(tree, 0, depthList);
		return depthList;
	}

	public void assignListAtDepth(BinaryNode tree, int depth, ArrayList<MyLinkedList> depthList) {
		if (tree == null) {
			return;
		}

		MyLinkedList listAtDepth;

		if (depthList.size() <= depth) {
			listAtDepth = new MyLinkedList();
			depthList.add(listAtDepth);
		} else {
			listAtDepth = depthList.get(depth);
		}

		listAtDepth.insert(tree.getData());

		assignListAtDepth(tree.getLeft(), depth + 1, depthList);
		assignListAtDepth(tree.getRight(), depth + 1, depthList);
	}
}
