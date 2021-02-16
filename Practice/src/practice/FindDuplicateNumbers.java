package practice;

public class FindDuplicateNumbers {
	public static void main(String[] args)
	{
		int[] arr = new int[] {2,4,5,8,3,6,4,9,1,6};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
	}

}
