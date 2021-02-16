package practice;

public class Diamond_Star {
	public static void main(String[] args)
	{
		int rows = 6;
		for(int i = 0; i < rows; i++)
		{
			for(int j = rows-i; j > 1; j--)
			{
				System.out.print("^");
			}
			for(int k = 0; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = rows; i > 0; i--)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("^");
			}
			for(int k = rows-i; k > 1; i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
