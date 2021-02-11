package insertionSort;

public class InsertionSort {
	public static void main(String[] args)
	{
		// https://youtu.be/lCDZ0IprFw4
		// https://github.com/joeyajames/Java/blob/master/insertionSort.java
		
		int i, j ,key, temp;
		int[] array = {6,5,4,7,77,2,4};
		
		for(i = 1; i < array.length; i++)
		{
			key = array[i];
			j = i - 1;
			
			while(j >= 0 && array[j] > key)
			{
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				j--;
			}
		}
		for(int k = 0; k < array.length; k++)
		{
			System.out.println(array[k]);
		}
	}

}
