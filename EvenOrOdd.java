//Importing the Scanner Package
import java.util.Scanner;

//Class Name
public class EvenOrOdd
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		int n;

		//Scanner Class to Take Input from user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");

		n = sc.nextInt();

		//Checking Number is Even or Odd
		if (n%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
