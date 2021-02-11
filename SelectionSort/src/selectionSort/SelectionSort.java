package selectionSort;

public class SelectionSort {
	public static void main(String[] args)
	{
		int[] array = {4,88,6,1,63,9};
		
		// i = lastUnsortedIndex
		
		for(int i = 0; i < array.length; i++)
		{
			int minvalue = array[i];
			int minindex = i;
			
			for(int j = i; j < array.length; j++)
			{
				if(array[j] < minvalue)
				{
					minvalue = array[j];
					minindex = j;
				}
			}
				if(minvalue < array[i])
				{
					int temp = array[i];
					array[i] = array[minindex];
					array[minindex] = temp;
				}
			}
		
		for(int k = 0; k < array.length; k++)
		{
			System.out.println(array[k]);
		}
	}

}
