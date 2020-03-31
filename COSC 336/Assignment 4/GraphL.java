//==============================================================
	// Shortest Path Program Graph, Graph Vertex, and Graph Link Classes
	//==============================================================
	// Ted SMith III
	// COSC 336-001
	// 11-29-2014
	//--------------------------------------------------------------


import java.util.*;

public class GraphL {
	int size;// This variable will hold the amount of vertices
	GraphVert firstVertex;// The starting vertex of the graph

	ArrayList<GraphVert> shortPath = new ArrayList<GraphVert>();// This holds
																// the vertices
																// with their
																// current
																// weight,

	// ready to be printed for shortest path

	public class GraphVert {// The class created to represent a Vertex in the
							// Graph
		int weight;
		ArrayList<GraphLink> linkList = new ArrayList<GraphLink>();// Holds the
																	// links of
																	// the
																	// Vertex
		int id;

		public GraphVert(int i) {
			weight = (i == 1) ? 0 : 99999;
			id = i;

		}

		public void upDate(int linkWeight, GraphVert parent) {
			weight = (linkWeight + parent.weight <= weight) ? linkWeight
					+ parent.weight : weight;
		}

		public void linkIt(int i, int linkW) {
			if (doesItExist(i)) {
				GraphLink gL = new GraphLink(find(i), linkW, firstVertex);
				linkList.add(gL);
			} else {
				GraphVert gV = new GraphVert(i);

				GraphLink gL = new GraphLink(gV, linkW, firstVertex);
				linkList.add(gL);
			}
			determineSize();
		}

	}

	public void determineSize() {// This is used to update the amount of unique
									// Vertices
		Queue<GraphVert> pQ = new LinkedList<GraphVert>();// Helps to traverse
															// through the links
															// in the Graph
		ArrayList<Integer> current = new ArrayList<Integer>();// The ArrayList
																// that holds
		// the id's of the vertices without duplicates
		current.add(1);
		for (int i = 0; i < firstVertex.linkList.size(); i++) {// This put the
																// first level
																// of nodes
			// connected to the starting node in the queue

			if (current.contains(firstVertex.linkList.get(i).gV.id)) {

			} else {
				current.add(firstVertex.linkList.get(i).gV.id);
			}
			pQ.add(firstVertex.linkList.get(i).gV);
		}

		while (!pQ.isEmpty()) {

			for (int j = 0; j < pQ.peek().linkList.size(); j++) {

				if (current.contains(pQ.peek().linkList.get(j).gV.id)) {

				} else {
					current.add(pQ.peek().linkList.get(j).gV.id);
				}
				pQ.add(pQ.peek().linkList.get(j).gV);

			}
			pQ.poll();
		}
		size = current.size();
	}

	public boolean doesItExist(int i) {// Checks to see if the Graph Vertex
										// exists in the Graph
		if (find(i) instanceof GraphVert)
			return true;
		else
			return false;
	}

	public void linkItCom(int parentId, int childId, int linkW) {// This method
																	// links the
																	// vertices
																	// to
																	// eachother
		if (doesItExist(childId)) {
			GraphVert pTemp = find(parentId);
			GraphLink gL = new GraphLink(find(childId), linkW, pTemp);
			pTemp.linkList.add(gL);
		} else {
			GraphVert pTemp = find(parentId);

			GraphVert gV = new GraphVert(childId);
			GraphLink gL = new GraphLink(gV, linkW, pTemp);

			pTemp.linkList.add(gL);
		}
		determineSize();

	}

	public class GraphLink {
		GraphVert gV;// The vertex being connected to the parent vertex
		int linkW;
		GraphVert parentVert;// The parent vertex connecting to a child vertex

		public GraphLink(GraphVert vertex, int linkWeight, GraphVert pVert) {
			gV = vertex;
			linkW = linkWeight;
			parentVert = pVert;
		}
	}

	public GraphL() {
		firstVertex = new GraphVert(1);

		size = 1;
	}

	public GraphVert find(int id) {// Finds the vertex by looking for it's id
									// number, and retruns that Vertex
		Queue<GraphVert> pQ = new LinkedList<GraphVert>();
		for (int i = 0; i < firstVertex.linkList.size(); i++) {
			if (firstVertex.linkList.get(i).gV.id == id)
				return firstVertex.linkList.get(i).gV;
			pQ.add(firstVertex.linkList.get(i).gV);
		}

		Boolean flag = true;

		while (!pQ.isEmpty()) {

			for (int j = 0; j < pQ.peek().linkList.size(); j++) {

				if (pQ.peek().linkList.get(j).gV.id == id)
					return pQ.peek().linkList.get(j).gV;

				pQ.add(pQ.peek().linkList.get(j).gV);

			}

			pQ.poll();
			flag = false;
		}
		return null;
	}

	public void dijsk() {// This will run the Dijkstra algorithm, and print the
							// shortest path
		Queue<GraphVert> pQ = new LinkedList<GraphVert>();

		for (int i = 0; i < firstVertex.linkList.size(); i++) {

			if (firstVertex.linkList.get(i).linkW + firstVertex.weight < firstVertex.linkList
					.get(i).gV.weight) {
				firstVertex.linkList.get(i).gV.weight = firstVertex.linkList
						.get(i).linkW + firstVertex.weight;
				shortPath.add(firstVertex.linkList.get(i).gV);

				/*
				 * I used this to let me monitor the updates for(int k = 0;
				 * k<shortPath.size();k++){ System.out.println(" "
				 * +shortPath.get(k).parentVert.id+" to "+shortPath.get(k).gV.id
				 * +" with a weight of "+shortPath.get(k).gV.weight); }
				 */

			}
			// System.out.print(" "+firstVertex.id+" --> "+firstVertex.linkList.get(i).gV.id+" with "+firstVertex.linkList.get(i).gV.id+" having a weight of "+
			pQ.add(firstVertex.linkList.get(i).gV);
		}

		// System.out.println();

		Boolean flag = true; // Not needed for execution of the method, it's
								// just needed for fixing bugs.
		while (!pQ.isEmpty()) {

			for (int j = 0; j < pQ.peek().linkList.size(); j++) {

				if (pQ.peek().linkList.get(j).linkW + pQ.peek().weight < pQ
						.peek().linkList.get(j).gV.weight) {// If the new weight
															// is less, replace
					pQ.peek().linkList.get(j).gV.weight = pQ.peek().linkList
							.get(j).linkW + pQ.peek().weight;
					GraphVert temp = pQ.peek().linkList.get(j).gV;
					int max = shortPath.size();
					if (!alreadyThere(temp)) {
						shortPath.add(temp);
					}

				}
				// System.out.print(" "+pQ.peek().id+" --> "+pQ.peek().linkList.get(j).gV.id+" with "+pQ.peek().linkList.get(j).gV.id+" having a weight of "+
				// pQ.peek().linkList.get(j).gV.weight+" ");
				pQ.add(pQ.peek().linkList.get(j).gV);

				flag = false;
			}
			pQ.poll();

			if (!flag)
				;// System.out.println();
			flag = true;
		}
		System.out.println("Dijkstra's Algorithm: \n");
		print();
	}

	public void print() {// The method that prints the shortest path.
		System.out.println("At vertex 1 it has a weight of 0.");

		for (int i = 0; i < shortPath.size(); i++) {
			System.out.println("At vertex " + shortPath.get(i).id
					+ " it has a weight of " + shortPath.get(i).weight + ".");
		}
		System.out.println();
	}

	public boolean alreadyThere(GraphVert gV) {// This method lets you know if a
												// Vertex is already in the
												// graph

		for (int i = 0; i < shortPath.size(); i++) {
			if (gV.id == shortPath.get(i).id)
				return true;
		}
		return false;
	}

	public void bellFord() {// This will run the Bell Man Ford algorithm, and
							// print if there is a shortest path
		boolean mainFlag = false;
		int mainCounter = 0;
		for (int main = 0; main < size; main++) {
			Queue<GraphVert> pQ = new LinkedList<GraphVert>();

			for (int i = 0; i < firstVertex.linkList.size(); i++) {

				if (firstVertex.linkList.get(i).linkW + firstVertex.weight < firstVertex.linkList
						.get(i).gV.weight) {
					firstVertex.linkList.get(i).gV.weight = firstVertex.linkList
							.get(i).linkW + firstVertex.weight;
					shortPath.add(firstVertex.linkList.get(i).gV);
					/*
					 * for(int k = 0; k<shortPath.size();k++){
					 * System.out.println
					 * (" "+shortPath.get(k).parentVert.id+" to "
					 * +shortPath.get(k).gV.id
					 * +" with a weight of "+shortPath.get(k).gV.weight); }
					 */
					mainFlag = true;
				}
				
				pQ.add(firstVertex.linkList.get(i).gV);
			}

			// System.out.println();
			// System.out.println("SHort path so far "+shortPath.size());
			Boolean flag3 = true;
			Boolean flag = true;
			while (!pQ.isEmpty()) {

				for (int j = 0; j < pQ.peek().linkList.size(); j++) {

					if (pQ.peek().linkList.get(j).linkW + pQ.peek().weight < pQ
							.peek().linkList.get(j).gV.weight) {// If the new
																// weight is
																// less, replace
						pQ.peek().linkList.get(j).gV.weight = pQ.peek().linkList
								.get(j).linkW + pQ.peek().weight;
						GraphVert temp = pQ.peek().linkList.get(j).gV;
						int max = shortPath.size();
						mainFlag = true;
						// System.out.println(temp.id+" was updated! ");
						if (!alreadyThere(temp)) {
							shortPath.add(temp);

						}

					}
					/*
					 * System.out.print(" " + pQ.peek().id + " --> " +
					 * pQ.peek().linkList.get(j).gV.id + " with " +
					 * pQ.peek().linkList.get(j).gV.id + " having a weight of "
					 * + pQ.peek().linkList.get(j).gV.weight + " ");
					 */
					pQ.add(pQ.peek().linkList.get(j).gV);

					flag = false;
				}
				pQ.poll();

				if (!flag)
				//System.out.println();
				flag = true;
			}

			if (mainFlag)
				mainCounter++;

			mainFlag = false;
		}
		if (mainCounter == size)
			System.out
					.println("A negative cycle was detected! So there is no shortest path!");
		else {
			System.out.println("Bellman Ford's Algorithm: \n");
			print();// This will print Bellman Ford
		}
	}

	public void showConnections() {//Not a needed method, it just shows the links in the Graph so Far
		Queue<GraphVert> pQ = new LinkedList<GraphVert>();

		for (int i = 0; i < firstVertex.linkList.size(); i++) {

			
			System.out.print(" "+firstVertex.id+" --> "+firstVertex.linkList.get(i).gV.id+" with "+firstVertex.linkList.get(i).gV.id+" having a weight of "+firstVertex.linkList.get(i).gV.weight);
			pQ.add(firstVertex.linkList.get(i).gV);
		}

		 System.out.println();

		
		while (!pQ.isEmpty()) {

			for (int j = 0; j < pQ.peek().linkList.size(); j++) {

				
					System.out.print(" "+pQ.peek().id+" --> "+pQ.peek().linkList.get(j).gV.id+" with "+pQ.peek().linkList.get(j).gV.id+" having a weight of "+
							 pQ.peek().linkList.get(j).gV.weight+" ");
				
				
				pQ.add(pQ.peek().linkList.get(j).gV);

				
				System.out.println();
			}
			pQ.poll();

			
		}
	}
}
