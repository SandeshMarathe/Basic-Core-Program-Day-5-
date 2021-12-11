//Import Package for Scanner Class
import java.util.Scanner;

//Class Name
public class PowerOfTwo
{
	//Main Method
	public static void main(String args[])
	{
		//Variable
		int a,power,temp=1;

		//Displaying Message to User
		System.out.println("Enter a Number :");

		//Taking Input from User
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		System.out.println("Enter the Power :");
		power = sc.nextInt();

		//Repeat Until i equals Power
		for(int i=1;i<=power; i++)
		{
			temp = temp * a;
		}
		System.out.println("The Power of Number Is :" +temp);
	}
}
