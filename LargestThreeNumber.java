import java.util.Scanner;

public class LargestThreeNumber
{
	public static void main(String[] args)
	{
		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Value of A :");
		a = sc.nextInt();

		System.out.println("Enter The Value of B :");
		b = sc.nextInt();

		System.out.println("Enter The Value of C :");
		c = sc.nextInt();

		if (a>b)
		{
			if (a>c)
			{
				System.out.println("A is Big :"+a);
			}
			else
			{
				System.out.println("C is Big :"+c);
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println("B is Big :"+b);
			}
			else
			{
				System.out.println("C is Big :"+c);
			}
		}
	}
}
