package problems.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DataStructures.Node;

public class BuildOrder {

	
//	Not handled the cycles yet
	public List<String> findBuildOrder(List<String> projectList, List<List<String>> dependencyList) {
		HashMap<String, Node> graphNodeMap = new HashMap<String, Node>();

		for (List<String> dependency : dependencyList) {
			Node parent = graphNodeMap.get(dependency.get(1));
			Node child = graphNodeMap.get(dependency.get(0));

			if (parent == null) {
				parent = new Node(dependency.get(1));
				graphNodeMap.put(parent.getName(), parent);
			}

			if (child == null) {
				child = new Node(dependency.get(0));
				graphNodeMap.put(child.getName(), child);
			}

			parent.addNeighbour(child);
		}

		List<String> buildOrder = new ArrayList<String>();

		for (String project : projectList) {
			Node projectNode = graphNodeMap.get(project);

			if (projectNode == null) {
				buildOrder.add(project);
				continue;
			}

			addChildren(projectNode, buildOrder);

		}

		return buildOrder;
	}

	private void addChildren(Node projectNode, List<String> buildOrder) {
		if (projectNode.getNeighbours().size() > 0) {
			for (Node neighbour : projectNode.getNeighbours()) {
				addChildren(neighbour, buildOrder);
			}
		}

		if (projectNode.getVisited() == false) {
			projectNode.setVisited(true);
			buildOrder.add(projectNode.getName());
		}
	}
}
