//Importing Package of Scanner Class
import java.util.Scanner;

//Class Name
public class QuotientOrRemainder
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		int dividend,divisor,quotient,remainder;

		//Scanner Class To Take Input from User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value of Dividend :");
		dividend = sc.nextInt();

		System.out.println("Enter the Value of Divisor :");
		divisor = sc.nextInt();

		//Formula to get Quotient Or Remainder
		quotient = dividend / divisor;
		remainder = dividend % divisor;

		//Displaying the value of Quotient Or Remainder
		System.out.println("Quotient ="+quotient);
		System.out.println("Remainder ="+remainder);
	}
}
