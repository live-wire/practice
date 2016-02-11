import java.util.ArrayList;


public class HeapSort {
	public static ArrayList<Integer> heap = new ArrayList<Integer>();
	
	
	public static void sort()
	{
		int max = heap.size()-1;
		int midElement = (max)/2;
		if((midElement*2)+1 >= heap.size())
			midElement--;
		
		
		
		while(midElement>=0)
		{
			midElement = (max)/2;
			if((midElement*2)+1 >= max)
				midElement--;
			heapify(heap,midElement,max);
			
			max--;
			midElement--;
		}
	
	}
	private static void heapify(ArrayList<Integer> heapTillNow,int midElement,int max)
	{
		
		int childLeft,childRight,temp;
		
		while(midElement>=0)
		{
			childLeft = 2*midElement +1;
			childRight = 2*midElement +2;
			
			if(heapTillNow.get(childLeft)>heapTillNow.get(childRight) && heapTillNow.get(childLeft)>heapTillNow.get(midElement))
			{
				temp = heapTillNow.get(midElement);
				heapTillNow.set(midElement,heapTillNow.get(childLeft));
				heapTillNow.set(childLeft,temp);
			}
			else if(heapTillNow.get(childRight)>heapTillNow.get(childLeft) && heapTillNow.get(childRight)>heapTillNow.get(midElement))
			{
				temp = heapTillNow.get(midElement);
				heapTillNow.set(midElement,heapTillNow.get(childRight));
				heapTillNow.set(childRight,temp);
				
			}
			midElement--;
		}
		
		temp = heapTillNow.get(0);
		heapTillNow.set(0,heapTillNow.get(max));
		heapTillNow.set(max,temp);
		
		
	}
	
	public static void printArray()
	{
		int i=0;
		while(i<heap.size())
			System.out.print(heap.get(i++)+" ");
			
		
	}

}
