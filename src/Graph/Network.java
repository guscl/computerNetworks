package Graph;

import java.util.ArrayList;

public class Network {

	private ArrayList<Node> graph = null;
	private String workloadPath = null;

	private int circuitRequests = 0;
	private int successfulRequests = 0;
	private int blockedRequests = 0;
	private int numberOfHops = 0;
	private int totalDelay = 0;

	public Network(ArrayList<Node> graph, String workloadPath) {
		this.graph = graph;
		this.workloadPath = workloadPath;
	}

	private void shp(char node1, char node2) {
		Node nodeOne = null;
		// Finding the node inside the array
		for (int i = 0; i < graph.size(); i++) {
			if (graph.get(i).getName() == node1)
				nodeOne = graph.get(i);
		}
		

	}

	public int getCircuitRequests() {
		return circuitRequests;
	}

	public int getSuccessfulRequests() {
		return successfulRequests;
	}

	public int getBlockedRequests() {
		return blockedRequests;
	}

	public int getNumberOfHops() {
		return numberOfHops;
	}

	public int getTotalDelay() {
		return totalDelay;
	}

}
