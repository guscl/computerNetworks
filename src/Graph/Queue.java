package Graph;

import java.util.ArrayList;

public class Queue {
	
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
	
	
	public Queue(){
		
	}
	
	public void addNode(Node node){
		nodes.add(node);
	}
	
	public Node removeNode(){
		return nodes.remove(0);
	}
	
	public boolean isEmpty(){
		return nodes.isEmpty();
	}

}
