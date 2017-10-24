
public class Investment 
{
	private double balance;
	private double rate;
	private int year;
	
	public Investment(double aBalance, double aRate)
	{
		balance = aBalance;
		rate = aRate;
		year = 0;
	}
		public void waitBalance(double targetBalance)
		{
			while(balance <= targetBalance)
			{
				year++;
				double interest = balance * rate/100 ;
				balance = balance + interest ;	
				System.out.printf("Your balance at the end of " + year +" years: $ %.2f \n", balance);
			}
		}	
		
		public void waitYears(int numberOfYears)
		{
			int i;
			for( i = 1; i <= numberOfYears; i++ )
			{
				double interest = balance * rate/100 ;
				balance = balance + interest ;
			}
			 year = year + i;
		}
		public double getBalance()
		{
			return balance;
		}
		public int getYears()
		{
			return year;
		}
}
