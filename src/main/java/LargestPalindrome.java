
public class LargestPalindrome {
	
	public static String string = "";
	
	public static void findOddLengthPalindromes()
	{
		int length = string.length();
		int mid = length/2;
		
		
		
		while(mid>0)
		{
			int i = mid+1;
			int j = mid-1;
			int lengthOf = 1;
			while(i<length && j>=0 && string.charAt(i)==string.charAt(j))
			{
				lengthOf+=2;
				j--;
				i++;
			}
			if(lengthOf>1)
			{
				i--;
				j++;
				System.out.println();
				System.out.print("Palindrome length="+lengthOf+" found:");
				while(j<=i)
					System.out.print(string.charAt(j++));
			}
			mid--;
		}
		
		mid = (length/2)+1;
		
		while(mid<length)
		{
			int i = mid+1;
			int j = mid-1;
			int lengthOf = 1;
			while(i<length && j>=0 && string.charAt(i)==string.charAt(j))
			{
				lengthOf+=2;
				j--;
				i++;
			}
			if(lengthOf>1)
			{
				i--;
				j++;
				System.out.println();
				System.out.print("Palindrome length="+lengthOf+" found:");
				while(j<=i)
					System.out.print(string.charAt(j++));
			}
			mid++;
		}
		
		
		
	}
	
	public static void findEvenLengthPalindromes()
	{
		int length = string.length();
		int mid = length/2;
		
		
		
		while(mid>0)
		{
			int i = mid+1;
			int j = mid;
			int lengthOf = 0;
			while(i<length && j>=0 && string.charAt(i)==string.charAt(j))
			{
				lengthOf+=2;
				j--;
				i++;
			}
			if(lengthOf>0)
			{
				i--;
				j++;
				System.out.println();
				System.out.print("Palindrome length="+lengthOf+" found:");
				while(j<=i)
					System.out.print(string.charAt(j++));
			}
			mid--;
		}
		
		mid = length/2+1;
		
		while(mid<length)
		{
			int i = mid+1;
			int j = mid;
			int lengthOf = 0;
			while(i<length && j>=0 && string.charAt(i)==string.charAt(j))
			{
				lengthOf+=2;
				j--;
				i++;
			}
			if(lengthOf>0)
			{
				i--;
				j++;
				System.out.println();
				System.out.print("Palindrome length="+lengthOf+" found:");
				while(j<=i)
					System.out.print(string.charAt(j++));
			}
			mid++;
		}
		
		
		
	}

}
