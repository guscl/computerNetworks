 package Graph;

public class Link {

	@Override
	public String toString() {
		return "Link [nodeOne=" + nodeOne.getName() + ", nodeTwo=" + nodeTwo.getName()
				+ ", propagation=" + propagation + ", capacity=" + capacity
				+ ", busy=" + busy + "]";
	}
	private Node nodeOne,nodeTwo;
	private int propagation;
	private int capacity;
	private boolean busy;
	private int currentConnections;
	
	public int getCurrentConnections() {
		return currentConnections;
	}


	public void setCurrentConnections(int currentConnections) {
		this.currentConnections = currentConnections;
	}


	public Link(int propagation, int capacity, Node nodeOne, Node nodeTwo){
		this.propagation = propagation;
		this.capacity = capacity;
		this.nodeOne = nodeOne;
		this.nodeTwo = nodeTwo;
	}
	
	
	public Node getNodeOne() {
		return nodeOne;
	}
	public void setNodeOne(Node nodeOne) {
		this.nodeOne = nodeOne;
	}
	public Node getNodeTwo() {
		return nodeTwo;
	}
	public void setNodeTwo(Node nodeTwo) {
		this.nodeTwo = nodeTwo;
	}
	public boolean isBusy() {
		return busy;
	}
	public void setBusy(boolean busy) {
		this.busy = busy;
	}
	
	public int getPropagation() {
		return propagation;
	}
	public void setPropagation(int propagation) {
		this.propagation = propagation;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
}
