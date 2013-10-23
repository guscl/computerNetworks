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
		Node currentNode = null;
		//Path tempPath = new Path();
		ArrayList<Path> paths = new ArrayList<Path>();
		Queue queue = new Queue();

		// Finding the first node inside the array
		for (int i = 0; i < graph.size(); i++) {
			if (graph.get(i).getName() == node1)
				currentNode = graph.get(i);
		}

		// First Node inside
		queue.addNode(currentNode);
		
		while (!queue.isEmpty()) {
			currentNode = queue.removeNode();
			// Just search the non-visited
			if (!currentNode.isVisited()) {
				currentNode.setVisited(true);
				
				for (int i = 0; i < currentNode.getLinks().size(); i++) {
					queue.addNode(currentNode.getLinks().get(i)
							.getNextNode(currentNode.getName()));
				}
			}
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
