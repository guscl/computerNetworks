package Graph;

import java.util.ArrayList;

public class Node {

	private char name;
	private ArrayList<Link> links;
	private boolean visited;

	public Link getLink(char nextNode) {
		for (int i = 0; i < this.links.size(); i++) {
			if (this.links.get(i).getNextNode(this.name).getName() == nextNode)
				return this.links.get(i);
		}
		return null;
	}

	public void setLinks(ArrayList<Link> links) {
		this.links = links;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Node(char name) {
		visited = false;
		links = new ArrayList<Link>();
		this.setName(name);
	}

	public void addLink(Link link) {
		links.add(link);
	}

	@Override
	public String toString() {
		return "Node [name=" + name + ", links=" + links + "]" + "\n";
	}

	public ArrayList<Link> getLinks() {
		return links;
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

}
