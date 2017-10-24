/**
 * 
 */
package lab3;
import java.util.Random;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel5
{
  // TODO - add instance variables as needed
	private int CurrentPopulation;
	private int lastYear;
	//private int yearBefore ;
	
	Random rand;
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel5()
  {
	  reset();
	  
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
   
    return CurrentPopulation;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
    // TODO
	  
	  
	  CurrentPopulation = CurrentPopulation + rand.nextInt(11) ;
	 
	  }
	  
  
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
	  rand = new Random();
	  CurrentPopulation = 0;
	  lastYear = 0; 
	 // yearBefore = 5;
	 
  }
		  
	  
  }
