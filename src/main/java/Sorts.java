
public class Sorts {
	
	public static void selectionSort(int[] array)
	{
		int i =0;
		int j=0;
		int temp =0;
		int minLocation = 0;
			while(i<array.length)
			{
				j=i+1;
				minLocation = i;
				while(j<array.length)
				{
					if(array[j]<=array[minLocation])
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
		int i;
		int temp;
		int k=0;
		for(i=0; i<a.length; ++i){
			temp=a[i];
			for(int j=0; j<=i; ++j){
				if(a[j]>a[i])
				{
					k=i;
					while(k>j)
					{
						a[k]=a[k-1];
						k--;
					}
					a[j] = temp;
					break;
				}
			}
		}
		
		i=0;
		while(i<a.length)
			System.out.print(a[i++]+" ");
		
	}
	
	public static void quickSort(int[] a)
	{
	quick(0,a.length-1,a);
	
	int i=0;
	while(i<a.length)
		System.out.print(a[i++]+" ");
	
	}
	private static void quick(int i,int j,int[] a)
	{
		int abc = i;
		int xyz = j;
		int pivot = (i+j)/2;
		int temp = a[pivot];
		if(abc>xyz)
			return;
			
		while(i<j)
		{
			while(a[i]<temp) i++;
			while(a[j]>temp) j--;
			
			
			if(a[i]==temp && a[j]==temp)
				j--;
			
			if(i<j)
			{
				if(pivot == i)
					pivot=j;
				else if(pivot == j)
					pivot = i;
				
				a[i] = a[i]+a[j];
				a[j] = a[i] - a[j];
				a[i] = a[i] - a[j];
			}
		}
			quick(abc,pivot-1,a);
			quick(pivot+1,xyz,a);
	 }
	
	public static void mergeSort(int[] a)
	{
		int[] b = new int[a.length];
		split(0,a.length-1,a,b);
		
		int i=0;
		while(i<b.length)
			System.out.print(b[i++]+" ");
	}
	
	private static void split(int left, int right, int[] a,int[] b)
	{
		if((right-left)<=1)
			return;
		int mid = (right+left)/2;
		split(left,mid,a,b);
		split(mid+1,right,a,b);
		merge(left,mid,mid+1,right,a,b);
		
	}
	private static void merge (int left,int leftEnd, int right,int rightEnd, int[] a,int[] b)
	{
		if(((leftEnd-left)==1) && (a[left]>a[leftEnd]))
		{
			a[leftEnd] = a[left]+a[leftEnd];
			a[left] = a[leftEnd] - a[left];
			a[leftEnd] = a[leftEnd] - a[left];
		}
		else if(((rightEnd-right)==1) && (a[right]>a[rightEnd]))
		{
			a[rightEnd] = a[right]+a[rightEnd];
			a[right] = a[rightEnd] - a[right];
			a[rightEnd] = a[rightEnd] - a[right];
		}
		
		int initialLeft = left;
		int k=0;
		k=left;
		while(k<=rightEnd)
		{
			
				if((left<=leftEnd)&&(right>rightEnd))
				{
					b[k]=a[left];
					left++;
				}
				else if((right<=rightEnd)&&(left>leftEnd))
				{
					b[k] = a[right];
					right++;
				}
				else if((left>leftEnd)&&(right>rightEnd))
				{
					
				}
				else if(a[left]<a[right])
				{
					b[k]=a[left];
					left++;
				}
				else if(a[right]<a[left])
				{
					b[k]= a[right];
					right++;
				}
				else if(a[left]==a[right])
				{
					b[k] = a[left];
					left++;
				}
			
			k++;
		}
		k=initialLeft;
		while(k<=rightEnd)
		{
			a[k]=b[k];
			k++;
		}
		
	}
	

}
