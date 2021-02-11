package bubbleSort;

public class BubbleSort {
	public static void main(String[] args)
	{		
	// Here we using 2 loops, so n*n - Big O Notation is O(n*n) 
		int array[] = {8,4,23,100,1,5,88,5}; 
		
		for(int i = 0; i < array.length-1; i++) { 
	// If we Comment the upper loop, the array will sort only once 
			for(int j = 1; j < array.length; j++) {
				
				if(array[j] < array[j-1]) {
					
					//swap(array, j, j-1);
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	for(int k = 0; k < array.length; k++)
	{
		System.out.println(array[k]);
	}
	}
//		public static void swap(int[] arrays, int index1, int index2) {
//			
////			if(index1 == index2) {
////				return;
////			}
//			
//			int temp = arrays[index1];
//			arrays[index1] = arrays[index2];
//			arrays[index2] = temp;
//		}
	}
