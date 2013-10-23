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

	private Path shp(char node1, char node2) {
		Node currentNode = null,nextNode=null;
		
		Path path;
		ArrayList<Path> paths = new ArrayList<Path>();
		Queue queue = new Queue();

		// Finding the first node inside the array
		for (int i = 0; i < graph.size(); i++) {
			if (graph.get(i).getName() == node1)
				currentNode = graph.get(i);
		}

		// First Node inside
		queue.addNode(currentNode);
		path = new Path(currentNode);
		paths.add(path);

		while (!queue.isEmpty()) {
			currentNode = queue.removeNode();

			// Just search the non-visited
			if (!currentNode.isVisited()) {
				currentNode.setVisited(true);
				// If found return its path
				if (currentNode.getName() == node2) {
					for (int i = 0; i < paths.size(); i++) {
						if (paths.get(i).getNode().getName() == currentNode
								.getName()) {
							successfulRequests++;
							return paths.get(i);
						}
					}

				}

				for (int i = 0; i < currentNode.getLinks().size(); i++) {
					if (!currentNode.getLinks().get(i).isBusy()) {
						nextNode = currentNode.getLinks().get(i)
								.getNextNode(currentNode.getName());
						path.addPath(currentNode.getLinks().get(i));
						path = new Path(nextNode,path.getPath());
						paths.add(path);
						queue.addNode(nextNode);
					}else{
						return null;
					}
				}
			}
		}
		return null;

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
