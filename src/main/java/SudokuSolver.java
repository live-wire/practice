import java.util.ArrayList;


public class SudokuSolver {
	
	public static ArrayList<ArrayList<Integer>> sudoku = new ArrayList<ArrayList<Integer>>();
	
	public static int n =9;
	
	public static void setValues()
	{
		int i=0;
		int j=0;
		while(i<n){
			j=0;
		ArrayList<Integer> row = new ArrayList<Integer>();
		while(j<n)
		{
			row.add(0);
			j++;
		}
		sudoku.add(row);
		i++;}
		
	}
	
	public static void solveSudoku()
	{
		if(solve(sudoku, 0, 0)==false)
			System.out.println("NO SOLUTION");
		else
		{
			printSudoku();
		}
		
	}
	
	private static boolean isSafe(ArrayList<ArrayList<Integer>> sudokuTillNow,int row,int column,int number)
	{
		//check in the same row behind
		int rowPresent = row-1;
		while(rowPresent>=0)
		{
			if(sudokuTillNow.get(rowPresent).get(column) == number)
				return false;
			rowPresent--;
		}
		rowPresent = row+1;
		while(rowPresent<n)
		{
			if(sudokuTillNow.get(rowPresent).get(column) == number)
				return false;
			rowPresent++;
		}
		int colPresent = column-1;
		while(colPresent>=0)
		{
			if(sudokuTillNow.get(row).get(colPresent) == number)
				return false;
			colPresent--;
		}
		colPresent = column+1;
		while(colPresent<n)
		{
			if(sudokuTillNow.get(row).get(colPresent) == number)
				return false;
			colPresent++;
		}
		
		if(row<=2&&column<=2)
		{
			int i=0;
			int j=0;
			while(i<=2)
			{
				j=0;
				while(j<=2)
				{
					if(i==row && j==column)
					{}
					else if(sudokuTillNow.get(i).get(j) == number)
						return false;

					j++;
				}
				i++;
			}
			
		}
//		
		else if(row<=2&&column>2&&column<=5)
		{
			int i=0;
			int j=3;
			while(i<=2)
			{
				j=3;
				while(j<=5)
				{
					if(i==row && j==column)
					{}
					else if(sudokuTillNow.get(i).get(j) == number)
						return false;

					j++;
				}
				i++;
			}
			
		}
		else if(row>2&&row<=5&&column<=2)
		{
			int i=3;
			int j=0;
			while(i<=5)
			{
				j=0;
				while(j<=2)
				{
					if(i==row && j==column)
					{}
					else if(sudokuTillNow.get(i).get(j) == number)
						return false;

					j++;
				}
				i++;
			}
			
		}
		else if(row>2&&row<=5&&column>2&&column<=5)
		{
			int i=3;
			int j=3;
			while(i<=5)
			{
				j=3;
				while(j<=5)
				{
					if(i==row && j==column)
					{}
					else if(sudokuTillNow.get(i).get(j) == number)
						return false;

					j++;
				}
				i++;
			}
			
		}
		
		return true;
	}
	

	
	private static boolean solve(ArrayList<ArrayList<Integer>> sudokuTillNow,int row,int column)
	{
		
		if(row>=n)
			return true;
		if(column>=n)
			return solve(sudokuTillNow, row+1, 0);
		
		int k=row;
		
			
				if(sudokuTillNow.get(k).get(column)==0)
				{
					int j = 1;
					while(j<=9)
					{
						if(isSafe(sudokuTillNow, k, column,j))
						{
							sudokuTillNow.get(k).set(column,j);
							if(solve(sudokuTillNow, k, column+1))
							{
								return true;
							}
							
							sudokuTillNow.get(k).set(column,0);
						}
					j++;
					}
					
				
				}
				else if(sudokuTillNow.get(k).get(column)>0)
				{
					return solve(sudokuTillNow, k, column+1);
				}
				
			
			
			return false;
		
	}
	
	
	
	
	public static void printSudoku()
	{
		int row=0;
		int column=0;
		
		while(row<sudoku.size())
		{
			column = 0;
			while(column<sudoku.size())
			{
				
				System.out.print(sudoku.get(row).get(column)+" ");
				column++;
			}
			System.out.println();
			row++;
		}
			
	}

}
