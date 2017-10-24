/**
 * 
 */
package lab3;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel2
{
  // TODO - add instance variables as needed
	private int CurrentPopulation;
	
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel2()
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
    // TODO - returns a dummy value so code will compile
    return CurrentPopulation;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
    // TODO
	//  lastYear++;
	  CurrentPopulation +=1;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
	  CurrentPopulation = 0;
	 
	  
	  
  }
}