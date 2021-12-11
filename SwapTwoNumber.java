//Importing Package for Scanner Class
import java.util.Scanner;

//Class Name
public class SwapTwoNumber
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		int a,b,c=0;

		//Taking Input from User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value of A :");
		a=sc.nextInt();

		System.out.println("Enter the Value of B :");
		b=sc.nextInt();

		//Swapping The Numbers
		c=a;
		a=b;
		b=c;

		//Displaying the Value of A & B after Swapping
		System.out.println("After Swapping the Value of A is ="+a);
		System.out.println("After Swapping the Value of B is ="+b);


	}
}
