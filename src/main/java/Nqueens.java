import java.util.ArrayList;


public class Nqueens {
	
	public static ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();
	public static int n = 8;
	
	public static void fillBoard()
	{
		int row=0;
		int column=0;
		
		while(row<n)
		{
			
			column = 0;
			ArrayList<Integer> rowFill = new ArrayList<Integer>();
			while(column<n)
			{
				rowFill.add(0);
				column++;
			}
			board.add(rowFill);
			row++;
			
		}
	}
	public static void solveBoard()
	{
		
		if(solve(board,0)==false)
			System.out.println("NO SOLUTION!!");
		else
			printBoard();
			
	}
	
	public static Boolean isSafe(ArrayList<ArrayList<Integer>> boardTillNow,int row,int column)
	{
		int mRow = row;
		int mColumn = column-1;
		while(mColumn>=0)
		{
			if(boardTillNow.get(mRow).get(mColumn)>0)
				return false;
		mColumn--;
		}
		mColumn = column-1;
		mRow = row-1;
		while(mColumn>=0 && mRow>=0)
		{
			if(boardTillNow.get(mRow).get(mColumn)>0)
				return false;
			
		mColumn--;
		mRow--;
		}
		
		mColumn = column-1;
		mRow = row+1;
		while(mColumn>=0 && mRow<boardTillNow.size())
		{
			if(boardTillNow.get(mRow).get(mColumn)>0)
				return false;
			
		mColumn--;
		mRow++;
		}
		return true;
	}
	
	private static Boolean solve(ArrayList<ArrayList<Integer>> boardTillNow,int column)
	{
		if(column >= boardTillNow.size())
			return true;
		
		int row =0;
		while(row<boardTillNow.size())
		{
			if(isSafe(boardTillNow, row, column))
			{
				boardTillNow.get(row).set(column,1);
				
				if(solve(boardTillNow,column+1)==true)
					return true;
				
				boardTillNow.get(row).set(column, 0);
				
			}
			row++;
		}
		
		
		
		return false;
	}
	
	
	public static void printBoard()
	{
		int row=0;
		int column=0;
		
		while(row<board.size())
		{
			column = 0;
			while(column<board.size())
			{
				
				System.out.print(board.get(row).get(column)+" ");
				column++;
			}
			System.out.println();
			row++;
		}
			
	}
	
	
	
	}