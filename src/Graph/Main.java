package Graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Creation of the possible nodes, they are 26(Alphabet)
		ArrayList<Node> nodes = nodeCreation();
		try {
			// Creation of the topology
			createTopology(nodes);
			System.out.println(nodes.toString());
			// System.out.println(nodes.get(0).getLinks().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void createTopology(ArrayList<Node> nodes) throws IOException {
		// Creating the graph topology
		BufferedReader br = new BufferedReader(new FileReader(
				"simpleTopology.txt"));

		String line = br.readLine();
		// Creating buffer variables
		char node1, node2;
		int propagation, capacity;
		Link link = null;
		Node nodeOne = null, nodeTwo = null;
		String[] splitedSegments;

		while (line != null) {
			splitedSegments = line.split(" ");
			node1 = splitedSegments[0].charAt(0);
			node2 = splitedSegments[1].charAt(0);
			propagation = Integer.valueOf(splitedSegments[2]);
			capacity = Integer.valueOf(splitedSegments[3]);

			// Finding the nodes inside the array
			for (int i = 0; i < nodes.size(); i++) {
				if (nodes.get(i).getName() == node1)
					nodeOne = nodes.get(i);
			}
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).getName() == node2)
					nodeTwo = nodes.get(j);
			}

			// Creating the link between the nodes
			link = new Link(propagation, capacity, nodeOne, nodeTwo);

			// Adding the link to the nodes
			nodeOne.addLink(link);
			nodeTwo.addLink(link);
			line = br.readLine();
		}

		br.close();

	}

	public static ArrayList<Node> nodeCreation() {
		ArrayList<Node> nodes = new ArrayList<Node>();

		Node nodeA = new Node('A');
		nodes.add(nodeA);
		Node nodeB = new Node('B');
		nodes.add(nodeB);
		Node nodeC = new Node('C');
		nodes.add(nodeC);
		Node nodeD = new Node('D');
		nodes.add(nodeD);
		Node nodeE = new Node('E');
		nodes.add(nodeE);
		Node nodeF = new Node('F');
		nodes.add(nodeF);
		Node nodeG = new Node('G');
		nodes.add(nodeG);
		Node nodeH = new Node('H');
		nodes.add(nodeH);
		Node nodeI = new Node('I');
		nodes.add(nodeI);
		Node nodeJ = new Node('J');
		nodes.add(nodeJ);
		Node nodeK = new Node('K');
		nodes.add(nodeK);
		Node nodeL = new Node('L');
		nodes.add(nodeL);
		Node nodeM = new Node('M');
		nodes.add(nodeM);
		Node nodeN = new Node('N');
		nodes.add(nodeN);
		Node nodeO = new Node('O');
		nodes.add(nodeO);
		Node nodeP = new Node('P');
		nodes.add(nodeP);
		Node nodeQ = new Node('Q');
		nodes.add(nodeQ);
		Node nodeR = new Node('R');
		nodes.add(nodeR);
		Node nodeS = new Node('S');
		nodes.add(nodeS);
		Node nodeT = new Node('T');
		nodes.add(nodeT);
		Node nodeU = new Node('U');
		nodes.add(nodeU);
		Node nodeV = new Node('V');
		nodes.add(nodeV);
		Node nodeX = new Node('X');
		nodes.add(nodeX);
		Node nodeY = new Node('Y');
		nodes.add(nodeY);
		Node nodeW = new Node('W');
		nodes.add(nodeW);
		Node nodeZ = new Node('Z');
		nodes.add(nodeZ);

		return nodes;

	}

}
