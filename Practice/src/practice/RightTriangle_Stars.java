package practice;

//import java.util.Scanner;

public class RightTriangle_Stars {
	public static void main(String[] args)
	{
//		Scanner scanner = new Scanner(System.in);
//		int l = scanner.nextInt();
	int rows = 4;	
		for(int i = 0; i < rows; i++)
		{
			for(int j = rows-1; j>1; j--)
			{
			System.out.print(" ");
			}
			for(int j = 0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
