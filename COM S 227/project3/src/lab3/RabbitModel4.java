/**
 * 
 */
package lab3;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel4
{
  // TODO - add instance variables as needed
	private int CurrentPopulation;
	private int lastYear;
	//private int yearBefore ;
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel4()
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
	  
	  
	  CurrentPopulation = CurrentPopulation / 2 ;
	 
	  }
	  
  
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
	  CurrentPopulation = 500;
	  lastYear = 0; 
	 // yearBefore = 5;
	 
  }
		  
	  
  }
