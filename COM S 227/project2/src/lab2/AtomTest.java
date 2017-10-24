/**
 * 
 */
package lab2;

/**
 * Test Atom class
 * @author luitelram
 */
public class AtomTest {

	/**
	 * Main method
	 * @param args main String
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Construct Atom object
		 */
		Atom uranium = new Atom(92, 146, 92);	
		
		/**
		 *  Calling and printing getAtomicMass and getAtomicCharge methods
		 */
		System.out.println("Atomic mass of uranium: " + uranium.getAtomicMass());
		System.out.println("Atomic charge of uranium: " + uranium.getAtomicCharge());
		
		/**
		 *  Decaying uranium atom
		 */
		uranium.decay();
		
		
		System.out.println("Atomic mass of uranium: " + uranium.getAtomicMass());
		System.out.println("Atomic charge of uranium: " + uranium.getAtomicCharge());
		
		
		
			}

}
