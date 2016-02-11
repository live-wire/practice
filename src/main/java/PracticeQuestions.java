
public class PracticeQuestions {

	/**
	 * @param args
	 */
	
	
/*	You have k lists of sorted integers. Find the smallest range that includes at least one number from each of the k lists. 

	For example, 
	List 1: [4, 10, 15, 24, 26] 
	List 2: [0, 9, 12, 20] 
	List 3: [5, 18, 22, 30] 

	The smallest range here would be [20, 24] as it contains 24 from list 1, 20 from list 2, and 22 from list 3.
	*/
	
	
/*There is an island which is represented by square matrix NxN. 
A person on the island is standing at any given co-ordinates (x,y). He can move in any direction one step right, left, up, down on the island. If he steps outside the island, he dies. 

Let island is represented as (0,0) to (N-1,N-1) (i.e NxN matrix) & person is standing at given co-ordinates (x,y). He is allowed to move n steps on the island (along the matrix). What is the probability that he is alive after he walks n steps on the island? 

Write a psuedocode & then full code for function 
" float probabilityofalive(int x,int y, int n) ".*/
	
	
	
	/*
	 * A k-palindrome is a string which transforms into a palindrome on removing at most k characters. 

Given a string S, and an interger K, print "YES" if S is a k-palindrome; otherwise print "NO". 
Constraints: 
S has at most 20,000 characters. 
0<=k<=30 

Sample Test Case#1: 
Input - abxa 1 
Output - YES 
Sample Test Case#2: 
Input - abdxa 1 
Output - No
	 * */
	
	
	/*Given multiple tuples in the form of (A,B) where A is the parent and B is the child in a binary tree, find if the input is valid or not. 4 error conditions were provided:
1. If a parent has more than 2 children,
2. If duplicate tuples entered,
3. If the tree has a cycle,
4. If more than one root possible.

For violation of multiple validity conditions, print the condition coming first in the above order.
If the input is valid, print the tree in a serial representation. For eg: If input is (A,B), (B,C), (A,D), (C,E) , output: (A(B(C(E)))(D))*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder x = new StringBuilder("malayalam");
		x.deleteCharAt(1);
		System.out.println(x);
		
		

	}
	
	
	
	public static void check(StringBuilder a,int b)
	{
		int len = a.length();
		if(isPalindrome(a))
			System.out.println("YES");
		else if(b>0)
		{
			
		}
			
		
	}
	public static boolean isPalindrome(StringBuilder x)
	{
		int len = x.length();
			int low=0;
			int high=len-1;
			while(low<high)
			{
				if(x.charAt(low)!=x.charAt(high))
					return false;
				low++;
				high--;
			}
		return true;
	}
	

}
