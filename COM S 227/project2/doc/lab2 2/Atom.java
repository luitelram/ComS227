/**
 * 
 */
package lab2;

/**
 * Class that calculate the mass and atomic charge of atom
 *
 */
public class Atom {
	
	/**
	 * number of protons of atom
	 */
	private int protons;
	
	/**
	 * number of neutrons of atom
	 */
	private int neutrons;
	
	/**
	 * number of electrons of atom
	 */
	private int electrons;
	
	/**
	 * Constructor for Atom class
	 * @param givenProtons number of proton of atom
	 * @param givenNeutrons number of neutrons of atom
	 * @param givenElectrons number of electrons of atom
	 */
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons){
		
		protons = givenProtons;
		neutrons = givenNeutrons;
		electrons = givenElectrons;
	}
	
	/**
	 * Determine the atomic mass
	 * @return atomic mass
	 */
	public int getAtomicMass(){
		
		return protons + neutrons;
		
	}
	
	/**
	 * Determine the atomic charge
	 * @return atomic charge
	 */
	
	public int getAtomicCharge(){
		
		return protons - electrons ;
			
	}
	
	/**
	 * Decay the atom
	 */
	public void decay(){
		
		protons -= 2;
		neutrons -= 2;
		
	}
}
