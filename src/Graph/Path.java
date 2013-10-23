package Graph;

import java.util.ArrayList;

public class Path {

	private Node node;
	private ArrayList<Link> path = new ArrayList<Link>();

	public Path(Node node, Link firstLink){
		this.node = node;
		addPath(firstLink);
	}
	
	public void addPath(Link link) {
		path.add(link);
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public ArrayList<Link> getPath() {
		return path;
	}

	public void setPath(ArrayList<Link> path) {
		this.path = path;
	}

}
