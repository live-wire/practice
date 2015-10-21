

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bst = new BST(20);
		bst.add(bst.top,8);
		bst.add(bst.top,4);
		bst.add(bst.top,12);
		bst.add(bst.top,10);
		bst.add(bst.top,14);
		bst.add(bst.top,22);
		bst.add(bst.top,25);
		//bst.printTree(bst.top);
		System.out.println();
		bst.printStructure();
		System.out.println();
		System.out.println("Width Left="+bst.treeWidthLeft()+ " Width Right="+bst.treeWidthRight());
		bst.printBoundry();
		
		System.out.println();
		BST rev = bst.reverse(bst.top);
		rev.printStructure();
		rev.printBoundry();
	}

}
