package groundtruth;

import java.util.List;

public class GraphNode {
	boolean selfVisited;
	List<GraphNode> neighbours;

	public List<GraphNode> getNeighbours() {
		return neighbours;
	}
	
	public boolean isSelfVisited() {
		return selfVisited;
	}

	public void setSelfVisited(boolean selfVisited) {
		this.selfVisited = selfVisited;
	}
}
