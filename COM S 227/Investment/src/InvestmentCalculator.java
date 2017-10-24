import java.util.Scanner;
/**
 * 
 */

/**
 * @author luitelram
 *
 */
public class InvestmentCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter you initial investment:$ ");
		 double initialBalance = scan.nextDouble();
		 
		System.out.print("Enter the rate: ");
		double rate = scan.nextDouble();
		System.out.print("Enter the number of years: ");
		int years = scan.nextInt();
		
		Investment invest = new Investment(initialBalance, rate);
		invest.waitYears(years);
		
	//	double balance = invest.getBalance();
		
		System.out.printf("The balance after " + years + " years is $ %.2f\n ", invest.getBalance());
		
		/**	int n = 1729;
			int sum =0;
			while (n>0){
				int digit = n %10;
				sum = sum + digit;
				n =n/10;
				
			}System.out.print(sum);  **/
	}

}
