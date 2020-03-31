import java.util.*;

public class BalanceTree extends Tree {

	public TreeNode root;
	public int length;

	public BalanceTree() {
		root = new TreeNode();
	}

	public void insert(int item) {

		root = recInsert(root, item); // sets the root node to the new group of
										// nodes linked

	}

	// helper: recursive method called by insert
	public TreeNode recInsert(TreeNode node, int item) {

		if (node == null || node.data == 0) { // if the node is empty, set the
												// node to the new value

			node = new TreeNode(item);
		} else {

			if (node.data == item) { // Makes sure there are no duplicates, but
										// setting the node to itself
				System.out.println(item
						+ "is Already in - duplicates are not allowed.");
				return root;
			} else if (item < node.data) {
				node.left = recInsert(node.left, item);// if the node is not
														// empty and the item is
														// less than the data,
														// go to the next left
														// node
			} else
				node.right = recInsert(node.right, item); // if the node is not
															// empty and the
															// item is greater
															// than the data ,
															// go to the next
															// right node

		}
		return node;
	}

	// //////////////// Depth First
	// /InOrder
	public void inOrderTraversal() {
		long startTime = System.currentTimeMillis();
		inOrder(root);
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the In Order Traversal was "
				+ (stopTime - startTime) + " miliseconds.");
	}

	// helper method called by inOrderTraversal
	private void inOrder(TreeNode t) { // Recursive method that prints in the
										// order left, node, right
		if (t != null) {
			inOrder(t.left);
			System.out.print(t.data + " ");
			inOrder(t.right);
		}
	}

	// ///End of InOrder
	// /// PreOrder

	public void preOrderTraversal() {
		long startTime = System.currentTimeMillis();
		preOrder(root);
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the Pre Order Traversal was "
				+ (stopTime - startTime) + " miliseconds.");

	}

	// helper method called by preOrderTraversal
	private void preOrder(TreeNode t) { // Recursive method that prints in the
										// order node,left,right
		if (t != null) {
			System.out.print(t.data + " ");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	// // End of PreOrder
	// // PostOrder

	public void postOrderTraversal() {
		long startTime = System.currentTimeMillis();
		postOrder(root);
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the Post Order Traversal was "
				+ (stopTime - startTime) + " miliseconds.");

	}

	// helper method called by postOrderTraversal
	private void postOrder(TreeNode t) { // Recursive method that prints in the
											// order left,right, node
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.data + " ");
		}
	}

	// // End of PostOrder
	// /////////////// Breadth First

	public void bread() {
		long startTime = System.currentTimeMillis();
		breadth(root);
		long stopTime = System.currentTimeMillis();
		System.out
				.println("\nElapsed time for the Breadth First Traversal was "
						+ (stopTime - startTime) + " miliseconds.");
	}

	public void breadth(TreeNode node) {
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
	}

	// /////////////// Best First

	public void best() {
		long startTime = System.currentTimeMillis();
		bestTrav(root);
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the Best First Traversal was "
				+ (stopTime - startTime) + " miliseconds.");
	}

	public void bestTrav(TreeNode node) {

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

	}

}
