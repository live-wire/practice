import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class DisjointSets {

	/**
	 * @param args
	 */
	
	public static ArrayList<ArrayList<Integer>> inputSets;
	public static HashMap<String,String> map;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputSets = new ArrayList<ArrayList<Integer>>();
		map = new HashMap<String,String>();
		
		ArrayList<Integer> inp1 = new ArrayList<Integer>();
		inp1.add(1);inp1.add(2);inp1.add(3);inp1.add(4);
		
		ArrayList<Integer> inp2 = new ArrayList<Integer>();
		inp2.add(2);inp2.add(3);inp2.add(5);inp2.add(6); inp2.add(7);
		
		ArrayList<Integer> inp3 = new ArrayList<Integer>();
		inp3.add(2);inp3.add(3);inp3.add(5);inp3.add(8);inp3.add(9);
		
		ArrayList<Integer> inp4 = new ArrayList<Integer>();
		inp4.add(2);inp4.add(3);inp4.add(5);inp4.add(10);inp4.add(9);
		
		inputSets.add(inp1);inputSets.add(inp2);inputSets.add(inp3);inputSets.add(inp4);
		
		ArrayList<Integer> allNumbers = new ArrayList<Integer>();
		int x=0;
		while(x < inputSets.size())
		{
			int j=0;
			while(j<inputSets.get(x).size())
			{
				if(!allNumbers.contains(inputSets.get(x).get(j)))
						allNumbers.add(inputSets.get(x).get(j));
				j++;
			}
			
			x++;
		}
		
		int levelsOfSets = inputSets.size();
		
		int i=1;
		
		
		while(i<=levelsOfSets)
		{
			
			int j=0;
			while(j<allNumbers.size())
			{
				
				
				int number = allNumbers.get(j);
				int occurences = numberOfOccurences(number);
				if(occurences==i)
					{
					printer(number,occurences);
					//System.out.print(number+" ");
					}
				
				
				
				j++;
			}
			System.out.println();
			
			i++;
		}
		
		System.out.println("OUTPUT:");
		for (Map.Entry<String, String> entry : map.entrySet())
		{
			
		    System.out.println("found in keys - "+entry.getKey() +"    -------    "+entry.getValue());
		}
		
		

	}
	
	public static int numberOfOccurences(int a)
	{
		
		int x=0;
		int count =0;
		while(x < inputSets.size())
		{
			if(inputSets.get(x).contains(a))
				count++;
			x++;
		}
		
		return count;
	}
	
	public static void printer(int number, int occurs)
	{
		int x=0;
		String a ="";
		
		while(x < inputSets.size())
		{
			if(inputSets.get(x).contains(number))
				{a+=x+" ";
				}
			x++;
		}
		
		if(map.containsKey(a))
		{map.put(a, map.get(a)+" "+number);}
		else
		{map.put(a, Integer.toString(number));}
		
		
	}
	

}
