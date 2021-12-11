//Importing Package of Scanner Class
import java.util.Scanner;

//Class Name
public class Vowel
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		char ch;

		//Scanner Class to Take Input From User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Single Character :");
		ch = sc.next().charAt(0);

		//Condition To Check Number is Vowel or Consonant
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Alphabet is Vowel");
		}
		else
		{
			System.out.println("Alphabet is Consonant");
		}
	}
}
