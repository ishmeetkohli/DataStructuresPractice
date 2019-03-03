package groundtruth;

import java.util.HashMap;
import java.util.List;

public class FindConnections {

	public HashMap<GraphNode, Integer> getConnections(List<GraphNode> nodes) {		
		HashMap<GraphNode, Integer> result = new HashMap<GraphNode, Integer>();
		HashMap<GraphNode, Boolean> visitedMap;
		
		for(GraphNode node:nodes) {
			visitedMap = new HashMap<GraphNode, Boolean>();
			visitedMap.put(node, true);
			find(node, result, visitedMap);
		}
		
		return result;
		
	}

	private void find(GraphNode node, HashMap<GraphNode, Integer> count, HashMap<GraphNode,Boolean> visitedMap) {		
		if(!visitedMap.get(node)) {
			count.put(node, count.get(node) + 1);
			visitedMap.put(node, true);
		}
			
		for(GraphNode neighbour:node.getNeighbours()) {
			find(neighbour, count, visitedMap);
		}
		
	}
	
}
