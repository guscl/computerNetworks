package Graph;

import java.util.ArrayList;

public class Node {
	
	private char name;	
	private ArrayList<Link> links;
	
	
	public Node(char name){
		links = new ArrayList<Link>();
		this.setName(name);
	}
	
	public void addLink(Link link){
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
