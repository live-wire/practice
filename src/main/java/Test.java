

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
		bst.printStructure();
		System.out.println("Common Parent of 4 and 12 is "+ bst.findCommonParent(bst.top, 4, 12));*/
		/*
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
		Nqueens.fillBoard();
		Nqueens.printBoard();
		System.out.println("\n");
		Nqueens.solveBoard();*/
		
		/*SudokuSolver.setValues();
		SudokuSolver.sudoku.get(0).set(1,6);
		SudokuSolver.sudoku.get(0).set(2,5);
		SudokuSolver.sudoku.get(0).set(6,2);
		SudokuSolver.sudoku.get(1).set(3,6);
		SudokuSolver.sudoku.get(1).set(4,2);
		SudokuSolver.sudoku.get(1).set(7,7);
		SudokuSolver.sudoku.get(2).set(2,9);
		SudokuSolver.sudoku.get(2).set(5,1);
		SudokuSolver.sudoku.get(2).set(7,4);
		SudokuSolver.sudoku.get(2).set(8,6);
		SudokuSolver.sudoku.get(3).set(1,9);
		SudokuSolver.sudoku.get(3).set(3,5);
		SudokuSolver.sudoku.get(3).set(6,7);
		SudokuSolver.sudoku.get(4).set(0,6);
		SudokuSolver.sudoku.get(4).set(3,4);
		SudokuSolver.sudoku.get(4).set(4,1);
		SudokuSolver.sudoku.get(4).set(5,2);
		SudokuSolver.sudoku.get(4).set(8,9);
		SudokuSolver.sudoku.get(5).set(2,3);
		SudokuSolver.sudoku.get(5).set(5,9);
		SudokuSolver.sudoku.get(5).set(7,5);
		SudokuSolver.sudoku.get(6).set(0,9);
		SudokuSolver.sudoku.get(6).set(1,7);
		SudokuSolver.sudoku.get(6).set(3,8);
		SudokuSolver.sudoku.get(6).set(6,3);
		SudokuSolver.sudoku.get(7).set(1,1);
		SudokuSolver.sudoku.get(7).set(4,5);
		SudokuSolver.sudoku.get(7).set(5,7);
		SudokuSolver.sudoku.get(8).set(2,4);
		SudokuSolver.sudoku.get(8).set(6,6);
		SudokuSolver.sudoku.get(8).set(7,2);
		
		SudokuSolver.printSudoku();
		System.out.println("\n");
		SudokuSolver.solveSudoku();
		*/
		/*HeapSort.heap.add(10);
		HeapSort.heap.add(2);
		HeapSort.heap.add(5);
		HeapSort.heap.add(19);
		HeapSort.heap.add(6);
		HeapSort.heap.add(25);
		HeapSort.heap.add(8);
		HeapSort.heap.add(3);
		HeapSort.heap.add(3);
		HeapSort.printArray();
		System.out.println();
		HeapSort.sort();
		HeapSort.printArray();
		LargestPalindrome.string = "statsofmalayalamgoggog";
		LargestPalindrome.findOddLengthPalindromes();
		LargestPalindrome.findEvenLengthPalindromes();
		
		SimplifiedDebts.input.add(new Person(20,"Dhruv",""));SimplifiedDebts.input.add(new Person(20,"Kaju",""));SimplifiedDebts.input.add(new Person(-76,"kaka",""));
		SimplifiedDebts.input.add(new Person(-42,"Messi",""));SimplifiedDebts.input.add(new Person(78,"Ronaldo",""));SimplifiedDebts.input.add(new Person(0,"Kinjal",""));
		SimplifiedDebts.simplify();
		BestBet.predictions.add(10);BestBet.predictions.add(9);BestBet.predictions.add(8);BestBet.predictions.add(7);
		BestBet.predictions.add(6);BestBet.predictions.add(5);BestBet.predictions.add(4);BestBet.predictions.add(4);
		BestBet.solve();
		
		ArrayStrings.list.add("banaba");ArrayStrings.list.add("lichii");
		if(ArrayStrings.compare("banana"))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");*/
		
		Node a = new Node(10);
		a.next = new Node(11);
		a.next.next = new Node(12);
		a.next.next.next = new Node(123);
		int c = nthLargest(a);
		System.out.println(c);
		
		
	}
	public static int nthLargest(Node z)
	{
		if(z==null)
		{return 0;}
		int blah = nthLargest(z.next)+1;
		System.out.println(z.data);
		return blah;
				
	}

}
//TODO: MergeSort, quicksort complexity explain
//TODO: Heap, LargestPalindrome Complexity explain
