/**
 * 
 */
package lab3;
import java.util.Random;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel
{
  // TODO - add instance variables as needed
	private int CurrentPopulation;
	private int lastYearPopulation;
	private int yearBeforePopulation ;
//	private int previousPopulation;
	
	Random rand;
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel()
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
      yearBeforePopulation = lastYearPopulation;
	  lastYearPopulation = CurrentPopulation;
	  CurrentPopulation =  lastYearPopulation + yearBeforePopulation;
   }
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
	  CurrentPopulation = 1;
	  lastYearPopulation = 0;
	  yearBeforePopulation = 0;
	
	 
  }
		  
	  
  }
