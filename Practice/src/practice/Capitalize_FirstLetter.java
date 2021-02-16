package practice;

import java.util.Scanner;

public class Capitalize_FirstLetter {
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String s = word.substring(0, 1).toUpperCase() + word.substring(1);
		System.out.println(s);
		
		scanner.close();
	}

}
