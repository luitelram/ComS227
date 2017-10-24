/**
 * 
 */
package lab2;

/**
 * Test the Basketball class
 * @author luitelram
 * 
 */
public class BasketballTest {

	/**
	 * main method
	 * @param args main String
	 */
	public static void main(String[] args) {
		
			Basketball b;   							 // Construct object of Basketball
			b = new Basketball(4.0);  					// instantiate object b
			
			System.out.println(b.getDiameter());
			System.out.println(b.isDribbleable());

			Basketball b2 = new Basketball(6.0);
			
	}
	
}
