import java.util.*;

public class SkewTree extends Tree {

	private TreeNode root;

	private int length = 0;

	public void insert(int item) {
		root = recInsert(root, item); // sets the root node to the new group of
										// nodes linked
		length = upDateLength();
	}

	// helper: recursive method called by insert
	public TreeNode recInsert(TreeNode node, int item) {
		if (node == null || node.data == 0) { // if the node is empty, set the
												// node to the new value

			node = new TreeNode(item);
		} else {

			if (node.data == item) { // Makes sure there are no duplicates, but
										// setting the node to itself
				System.out.println("Already in - duplicates are not allowed.");
				return root;
			} else if (node.data > item) {
				int temp = node.data;
				node.data = item;
				insert(temp);
			} else
				node.left = recInsert(node.left, item); // if the node is not
														// empty, go to the next
														// left node

		}
		return node;
	}

	public BalanceTree toBT() {// Converts the SkewTree to a BalanceTree
		long startTime = System.currentTimeMillis();

		int mid = (length / 2) + 1;
		int i = 0;
		TreeNode current = root;
		TreeNode tempRight;
		int[] ar = new int[length];
		BalanceTree bT = new BalanceTree();
		// Stack store = new Stack();
		while (current != null) {// reverses the
			// store.push(current);
			// System.out.println(length);
			ar[i] = current.data;
			// System.out.println("Just a lil test " + ar[i]+ "at index "+i);
			current = current.left;

			i++;
		}

		bT.insert(ar[mid - 1]);
		
		for (int x = mid - 2; x >= 0; x--) {
			if (x == mid - 1)
				;
			else {
				// System.out.println(ar[x]+ " was inserted. ");
				bT.insert(ar[x]);
			}
		}
		for (int x = mid; x <= length-1; x++) {
			if (x == mid - 1)
				;
			else {
				 //System.out.println(ar[x]+ " was inserted. ");
				bT.insert(ar[x]);
			}
		}

		bT.length = length;

		// Call a balance function that will take the right now and make it
		// replace the old one but turn the old one into a left

		balanceHelperR(bT.root.right, bT.root);
		balanceHelperL(bT.root.left, bT.root);

		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the toBT method was "
				+ (stopTime - startTime) + " miliseconds.");

		return bT;
	}

	public void print() {// This method prints the nodes until the last node.
							// The method was used just to print the tree out.
		TreeNode current = root;
		System.out.println("Skew Tree Print: ");
		while (current != null) {
			System.out.print(" " + current.data);
			current = current.left;

		}
		System.out.println();
	}

	public int upDateLength() {// This method counts the amount of nodes
		TreeNode current = root;
		int i = 0;
		while (current != null) {
			i++;
			current = current.left;
		}
		return i;
	}

	public void balanceHelperR(TreeNode node, TreeNode prev) {// Balances the
																// right of the
																// root node
		if (node != null) {
			if (node.left == null && node.right == null)
				;
			else if (node.left != null && node.right != null) {

				balanceHelperR(node.right, node);
			} else if (node.left == null && node.right != null) {
				int temp = node.data;
				prev.right = node.right;

				prev.right.left = new TreeNode(temp);

				balanceHelperR(prev.right.right, prev.right);

			} else {

			}
		} else {

		}
	}

	public void balanceHelperL(TreeNode node, TreeNode prev) {// balances the
																// left of the
																// root node
		if (node != null) {
			if (node.left == null && node.right == null)
				;
			else if (node.left != null && node.right != null) {

				balanceHelperL(node.left, node);
			} else if (node.left != null && node.right == null) {
				int temp = node.data;

				prev.left = node.left;

				prev.left.right = new TreeNode(temp);

				balanceHelperL(prev.left.left, prev.left);

			} else {

			}
		} else {

		}
	}

	// ////////////////Depth First
	// /Inorder
	public void inOrderTraversal() {
		long startTime = System.currentTimeMillis();
		inOrder(root);
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the In Order Traversal was "
				+ (stopTime - startTime) + " miliseconds.");
	}

	// helper method called by inOrderTraversal
	private void inOrder(TreeNode t) {// Recursive method that prints in the
										// order left, node, right
		if (t != null) {
			inOrder(t.left);
			System.out.print(t.data + " ");
			inOrder(t.right);
		}
	}

	// /// Preorder
	public void preOrderTraversal() {
		long startTime = System.currentTimeMillis();
		preOrder(root);
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the Pre Order Traversal was "
				+ (stopTime - startTime) + " miliseconds.");
	}

	// helper method called by preOrderTraversal
	private void preOrder(TreeNode t) {// Recursive method that prints in the
										// order node, left, node
		if (t != null) {
			System.out.print(t.data + " ");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	// // Postorder
	public void postOrderTraversal() {
		long startTime = System.currentTimeMillis();
		postOrder(root);
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the Post Order Traversal was "
				+ (stopTime - startTime) + " miliseconds.");
	}

	// helper method called by postOrderTraversal
	private void postOrder(TreeNode t) {// Recursive method that prints in the
										// order left,right,node
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.data + " ");
		}
	}

	// /////////////// Breadth First

	// ///Main ones
	public void bread() {
		breadth(root);
	}

	public void breadth(TreeNode node) {
		long startTime = System.currentTimeMillis();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (node == null)
			;
		else {
			queue.add(node);
			while (!queue.isEmpty()) {
				TreeNode nodeTemp = queue.remove();// makes the temporary node
													// equal to the top most
													// node equal
				System.out.print(nodeTemp.data + " ");// Prints the top most
														// number of the queue
				if (nodeTemp.left != null)
					queue.add(nodeTemp.left);// Inserts the left node, which has
												// links to the next level
				if (nodeTemp.right != null)
					queue.add(nodeTemp.right);// Then inserts the right node,
												// which has links to the next
												// level
			}
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the Breadth Traversal was "
				+ (stopTime - startTime) + " miliseconds.");

	}

	// /////////////// Best First
	public void best() {
		bestTrav(root);
	}

	public void bestTrav(TreeNode node) {
		long startTime = System.currentTimeMillis();

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (node == null)
			;
		else {
			queue.add(node);
			while (!queue.isEmpty()) {
				TreeNode nodeTemp = queue.remove();// makes the temporary node
													// equal to the top most
													// node equal
				System.out.print(nodeTemp.data + " ");// Prints the top most
														// number of the queue
				if (nodeTemp.right != null)
					queue.add(nodeTemp.right);// Inserts the right node, which
												// has links to the next level
				if (nodeTemp.left != null)
					queue.add(nodeTemp.left);// Then, inserts the left node,
												// which has links to the next
												// level

			}
		}
		long stopTime = System.currentTimeMillis();

		System.out.println("\nElapsed time for the Best First Traversal was "
				+ (stopTime - startTime) + " miliseconds.");
	}
}
