//Importing Package of Scanner Class
import java.util.Scanner;

//Class Name
public class HarmonicNumber
{
	//Function to get Nth Harmonic Number
	double nthHarmonic(int N)
	{
		float harmonic = 1;

		for (int i = 2; i <= N; i++)
		{
			harmonic += (float)1 / i;

   		}

		return harmonic;
	}

	//Main Method
	public static void main (String[] args)
	{
		//Variable
        	int N;

		//Scanner Class to take Input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Harmonic Number :");
		N = sc.nextInt();

		//Creating Object of Class to Call the Method
		HarmonicNumber hn = new HarmonicNumber();

		System.out.print(hn.nthHarmonic(N));
    	}

}
