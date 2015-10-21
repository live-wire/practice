
public class Sorts {
	
	public static void selectionSort(int[] array)
	{
		int i =0;
		int j=0;
		int temp =0;
		int minLocation = 0;
			while(i<array.length)
			{
				j=i;
				minLocation = j;
				while(j<array.length)
				{
					if(array[j]<array[i])
						{
						minLocation = j;
						}
					j++;
				}
				temp = array[i];
				array[i] = array[minLocation];
				array[minLocation] = temp;
				i++;
			}
			
			i=0;
			while(i<array.length)
				System.out.print(array[i++]+" ");
	}
	
	public static void bubbleSort(int[] a)
	{
		int i=0;
		int j=0;
		while(i<a.length)
		{
			j=0;
			while(j<(a.length-i))
			{
				if((j+1) < (a.length-i))
				{
					if(a[j]>a[j+1])
					{
						a[j] = a[j] + a[j+1];
						a[j+1] = a[j] - a[j+1];
						a[j] = a[j] - a[j+1];
					}
				}
				j++;
			}
			
			i++;
		}
		
		i=0;
		while(i<a.length)
			System.out.print(a[i++]+" ");
		
	}
	
	public static void insertionSort(int[] a)
	{
		int i=1;
		int j=0;
		int key = 0;
		while(i<a.length)
		{key = a[i];
		j=0;
		while(j<i)
		{
			if(key<a[j])
				break;
			j++;
		}
		if(j==i)
		{}
		else{
			int x = j;
			int y = i-1;
		while(y>x)
		{
			a[y+1] = a[y];
			y--;
		}
		a[j] = key;
		}
			i++;
		}
		
		i=0;
		while(i<a.length)
			System.out.print(a[i++]+" ");
		
	}

}
