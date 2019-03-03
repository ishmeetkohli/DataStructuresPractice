package problems.tree;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import DataStructures.Node;

public class RouteBetweenNodes {
	public boolean routeExists(Node node1, Node node2) {
		if (node1 == node2)
			return true;

		Queue<Node> queue = new ConcurrentLinkedQueue<Node>();
		node1.setVisited(true);
		appendToQueue(node1, queue);

		while (!queue.isEmpty()) {
			Node node = queue.remove();
			if (node == node2)
				return true;
			appendToQueue(node, queue);
		}
		return false;
	}

	private void appendToQueue(Node node, Queue<Node> queue) {
		for (Node neighbour : node.getNeighbours()) {
			if (neighbour.getVisited() == false) {
				neighbour.setVisited(true);
				queue.add(neighbour);
			}
		}
	}

}
