//import Pacakge of Scanner Class
import java.util.Scanner;

//Class Name
public class LeapYear
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
      		int year;

		//Display Message
		System.out.println("Enter an Year : ");

		// Scanner Class to take Input from User
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		//Checking Condition to get Leap Year
	        if(year % 4 == 0)
		{
			System.out.println("Year is a Leap Year");
		}
        	else
		{
			System.out.println("Year is Not a Leap Year");
		}
   	}
}
