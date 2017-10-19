package DataStructures;

import java.util.ArrayList;

public class Node {
	// String name;
	//	int data;
	Boolean visited;
	ArrayList<Node> neighbours;

	public Node() {
		visited = false;
		neighbours = new ArrayList<Node>();
	}
	
//	public Node(int data) {
//		visited = false;
//		neighbours = new ArrayList<Node>();
//	}

	public ArrayList<Node> getNeighbours() {
		return neighbours;
	}

	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }

	public Boolean getVisited() {
		return visited;
	}

	public void setVisited(Boolean visited) {
		this.visited = visited;
	}

	public void setNeighbours(ArrayList<Node> neighbours) {
		this.neighbours = neighbours;
	}

	public void addNeighbour(Node neighbour) {
		this.neighbours.add(neighbour);
	}
}
