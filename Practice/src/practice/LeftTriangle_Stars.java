package practice;

public class LeftTriangle_Stars {
	public static void main(String[] args)
	{
		//javatpoint method
		
		int rows = 6;
		for(int i = 0; i < rows; i++)
		{
			for(int j = (rows-i); j > 0; j--)
			{
				System.out.print("^");
			}
			for(int k = 0; k <= i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//Youtube method
		
//		int l = 5;
//		for(int i = l; i >=1; i--)
//		{
//			for(int j = 1; j<i; j++)
//			{
//				System.out.print("^");
//			}
//			for(int k = l; k >= i; k--)
//			{
//				System.out.print("*"); // If we put space near * o/p will become pyramid star pattern
//			}
//			System.out.println();
//		}
		
	}

}