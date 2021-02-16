package practice;

import java.util.Scanner;
 
public class Reverse_String {
	public static void main(String[] args)
	{
		//same method used for palindrome
		
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String reverse = "";
		for(int i = word.length()-1; i >= 0; i--)
		{
			reverse = reverse+word.charAt(i);
		}
			System.out.println(reverse);
		scanner.close();
		
		for(int i = 0; i < word.length(); i++)
		{
		if(reverse.charAt(i) == word.charAt(i))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not");
		}
//		if(word == reverse)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not a palindrome");
//		}
	}

}
