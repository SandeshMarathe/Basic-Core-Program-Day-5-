class FlipCoin//Class
{
	//Main Method
	public static void main(String args[])
	{

		//Variables
		int headCount = 0;
		int tailCount = 0;

		for(int i=1; i<=10; i++)
		{
			//Computation
			double checkCoin =  (Math.random()*10) % 1;

			System.out.println("Random Value ="+checkCoin);
			if(checkCoin < 0.5)
			{
				tailCount++;
			}
			else
			{
				headCount++;
			}
		}

		//Print Head & Tail Counts
		System.out.println("TailCount:"+tailCount);
		System.out.println("HeadCount:"+headCount);

		//Calculating Percentage of Head vs Tail
		int PercentTail = (tailCount * 100) / 10;
		int PercentHead = (headCount * 100) / 10;

		//Printing Percentage of Head vs Tail
		System.out.println("The Percentage of Tails is : " + PercentTail);
		System.out.println("The Percentage of Heads is : " + PercentHead);
	}
}
