package Graph;

import java.util.ArrayList;

public class Path {

	private Node node;
	private ArrayList<Link> path = new ArrayList<Link>();

	public Path(Node node,ArrayList<Link> newPaths ){
		this.node = node;
		path.addAll(newPaths);
	}
	public Path(Node node){
		this.node = node;
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
