//Importing Package of Scanner Class
import java.util.Scanner;

//Class Name
public class PrimeFactor
{
	//Main Method
	public static void main(String[] args)
	{
		//Vairable
		int number;

		//Scanner Class Take Input From User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");
		number = sc.nextInt();

		//For to get Prime Factor
		for(int i=2; i*i<number; i++)
		{
			while(number%i == 0)
			{
				System.out.println(i+" ");
				number = number/i;
			}
		}
		if(number >2)
		{
			System.out.println(number);
		}
	}
}
