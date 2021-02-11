package quickSort;

// https://www.programiz.com/java-programming/examples/quick-sort

public class QuickSort {// Quick sort in Java

  // divide the array on the basis of pivot
  int partition(int array[], int low, int high) {

    // select last element as pivot
    int pivot = array[high];

    // initialize the second pointer
    int i = (low - 1);

    // Put the elements smaller than pivot on the left and
    // greater than pivot on the right of pivot
    for (int j = low; j < high; j++) {

      // compare all elements with pivot
      // swap the element greater than pivot
      // with element smaller than pivot
      // to sort in descending order
      // if (array[j] >= pivot)
      if (array[j] <= pivot) {

        // increase the second pointer if
        // smaller element is swapped with greater
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    // put pivot in position
    // so that element on left are smaller
    // element on right are greater than pivot
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return (i + 1);
  }

  void quickSort(int array[], int low, int high) {
    if (low < high) {

      // Select pivot position and put all the elements smaller
      // than pivot on the left and greater than pivot on right
      int pi = partition(array, low, high);

      // sort the elements on the left of the pivot
      quickSort(array, low, pi - 1);

      // sort the elements on the right of pivot
      quickSort(array, pi + 1, high);
    }
  }

  // Driver code
  public static void main(String args[]) {

    // create an unsorted array
    int[] data = {  81, 71, 22, 11, 10, 19, 36 };        
    //8,7,2,1,0,9
  //low         i
    //8,7,9,1,0,2
//	int low = array.length;
//	int high = array.length;
//	System.out.println(high); - 6
//	System.out.println(low-1); - 9
    
    // start - 8, end - 9, pivot - 6
    int size = data.length;

    // create an object of the Main class
    QuickSort qs = new QuickSort();

    // pass the array with the first and last index
    qs.quickSort(data, 0, size - 1);
    System.out.println("Sorted Array: ");
    for(int i = 0; i < data.length; i++)
    {
    System.out.println(data[i]);
    }
  }
}


