

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*BST bst = new BST(20);
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
		rev.printBoundry();*/
		int[] a = {2,3,7,9,10,4,6,1,8,5};
		Sorts.selectionSort(a);
		System.out.println();
		int[] b = {2,3,7,9,10,4,6,1,8,5};
		Sorts.bubbleSort(b);
		System.out.println();
		int[] c = {2,3,7,9,10,4,6,1,8,5};
		Sorts.insertionSort(c);
		System.out.println();
		int[] d = {2,3,1,9,10,4,7,6,8,5};
		Sorts.quickSort(d);
		System.out.println();
		int[] e = {2,3,1,9,10,4,7,6,8,5};
		Sorts.mergeSort(e);
	}

}
