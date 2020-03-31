//==============================================================
//    Program 2 – Tree Implementations
// Ted Smith III
// COSC 336-001
// 10/25/2014

public class TreeMain {
	public static void main(String[] args) {
		SkewTree skew = new SkewTree();
		int i = 1;
		long startTime = System.currentTimeMillis();
		 while(i<=26){ 
			 skew.insert(i); 
			 i++; 
			 }
		 
		

	
		long stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the Inserts was "
				+ (stopTime - startTime) + " miliseconds.");

		startTime = System.currentTimeMillis();
		skew.print();
		stopTime = System.currentTimeMillis();
		System.out.println("\nElapsed time for the UnBalanced Print was "
				+ (stopTime - startTime) + " miliseconds.\n");

		// ////////////////Depth First Test for Unbalanced Tree
		System.out.println("Test for Depth First in Unbalanced Tree");
		System.out.println("Preorder Print:");
		skew.preOrderTraversal();// Preorder Print
		System.out.println("\nInorder print:");
		skew.inOrderTraversal(); // Inorder print
		System.out.println("\nPostorder Print:");
		skew.postOrderTraversal();

		// ////////////////Breadth First Test
		System.out.println("\nTest for Breadth First in Unbaance Tree\n");
		// balance.breadthFirst();
		skew.bread();
		System.out.println();
		// ////////////////Best Case Test
		System.out.println("Test for Best Case in Unbalanced Tree");
		skew.best();
		// balance.bestCaseTraversal();
		System.out.println();

		System.out.println("Test for toBT() Method");
		BalanceTree balance = skew.toBT();
		// balance.print();

		// ////////////////Depth First Test for Balanced Tree
		System.out
				.println("\n///////////Test for Depth First for Balance Tree\n");
		System.out.println("Preorder Print:");
		balance.preOrderTraversal();// Preorder Print
		System.out.println("\nInorder print:");
		balance.inOrderTraversal(); // Inorder print
		System.out.println("\nPostorder Print:");
		balance.postOrderTraversal(); // Postorder Print

		// ////////////////Breadth First Test
		System.out
				.println("\n///////////Test for Breadth First for Balance Tree");
		System.out.println("\nTest for Breadth First");
		// balance.breadthFirst();
		balance.bread();
		System.out.println();
		// ////////////////Best Case Test
		System.out
				.println("\n///////////Test for Best Case for Balance Tree\n");
		System.out.println("Test for Best Case");
		balance.best();
		// balance.bestCaseTraversal();
		System.out.println();
	}
}
