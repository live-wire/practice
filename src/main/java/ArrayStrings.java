import java.util.ArrayList;


public class ArrayStrings {
	
	public static ArrayList<String> list = new ArrayList<String>();
	
	public static boolean compare(String input)
	{
		int i =0;
		while(i<list.size())
		{
			if(compareStrings(list.get(i), input))
				return true;
			i++;
		}
		
		return false;
		
	}

	
	private static boolean compareStrings(String a,String b)
	{
		int i =0;
		int diff = 0;
		while(i<a.length() && i<b.length())
		{
			if(a.charAt(i)==b.charAt(i))
			{
				i++;
			}
			else
			{
				if(diff>1)
					return false;
				else
					diff++;
				
				i++;
			}
		}
		if(i<a.length())
		{
			if((a.length()-i)+diff > 1)
				return false;
		}
		if(i<b.length())
		{
			if((b.length()-i)+diff > 1)
				return false;
		}
		
		return true;
	}
}

