package countingSort;

public class CountingSort {
	// https://www.programiz.com/dsa/counting-sort
	// This program doesn't work with negtive values, if we start with positive values
	
	public void countSort(int array[], int size) {
	    int[] output = new int[size];

	    // Find the largest element of the array
	    int max = array[0];
	    for (int i = 1; i < size; i++) {
	      if (array[i] > max) // comparing - array[1] > array[0]
	        max = array[i];
	    }
	    int[] count = new int[max + 1];

	    // Initialize count array with all zeros.
	    for (int i = 0; i < max; ++i) {
	      count[i] = 0;
	    }

	    // Store the count of each element
	    for (int i = 0; i < size; i++) {
	      count[array[i]]++;
	    }

	    // Store the cummulative count of each array
	    for (int i = 1; i <= max; i++) {
	      count[i] += count[i - 1];
	    }

	    // Find the index of each element of the original array in count array, and
	    // place the elements in output array
	    for (int i = size - 1; i >= 0; i--) {
	      output[count[array[i]] - 1] = array[i];
	      count[array[i]]--;
	    }

	    // Copy the sorted elements into original array
	    for (int i = 0; i < size; i++) {
	      array[i] = output[i];
	    }
	  }
   
	  // Driver code
	  public static void main(String args[]) {
	    int[] data = { 4, 2, 2, 8, 3, 3, 10 };
	    int size = data.length;
	    
	    CountingSort cs = new CountingSort();
	    cs.countSort(data, size);
	    System.out.println("Sorted Array in Ascending Order: ");
	    
	    for(int i = 0; i < data.length; i++)
	    {
	    	System.out.println(data[i]);
	    }
	  }

}
