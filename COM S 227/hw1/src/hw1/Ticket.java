/**
 * 
 */
package hw1;

/**
 * A Ticket models this ticket has a balance in cents,
 * an indication of whether the user is entitled to discounted fares, and what the
 * start zone is, if a trip is in progress. 
 * @author Ram Luitel
 */
public class Ticket {
	
	/**
	 * Balance in the ticket
	 */
	private int balance;
	
	/**
	 *  Boolean value that contain either true
	 *  or false depends on what type of ticket is it
	 */
	private boolean discounted;
	
	/**
	 * Actual start zone from where you star to ride
	 */
	private int startZone;
	
	/**
	 * variable to keep track of either you are in traveling or not
	 */
	private boolean riding;
	
	
	/**
	 * Constructor for Ticket class
	 * @param value  Balance in ticket
	 * @param discounted This is a boolean variable that store either true or false
	 */
	public Ticket(int value, boolean discounted)
	{
		// initializing 
		balance = value;
		startZone = 0;
		this.discounted = discounted;
		riding = false;	
	}
	
	/**
	 * Initialized the zone as the starting zone
	 * @param zone The starting zone
	 */
	public void beginTrip(int zone)
	{
			startZone = zone;	
			riding = true;
	}
	
	/**
	 *  Get the start zone
	 * @return startZone The actual zone where you start to ride
	 */
	public int getStartZone()
	{
			// temporary variable to store zone number
			int temZone;
			
			// if you are not riding meaning not began the trip
			if(isInTransit() == false )
			{
				temZone = TicketUtil.INVALID_ZONE;
			}
			// if you are riding then  update your start zone
			else
			{
				temZone = startZone;
			}
			return temZone;		
	}
	
	/**
	 * Figure out either ticket have discount fare or not
	 * @return discounted If ticket have discount fare return true otherwise false
	 */
	public boolean isDiscounted()
	{	
		return discounted;
	}
	
	/**
	 * Get the balance in ticket
	 * @return balance The balance in the ticket
	 */
	public int getBalance()
	{
		return balance;
	}
	
	/**
	 * Charge the cost of ride and update the balance in ticket if ticket have enough balance
	 * @param rideCost The cost of riding
	 * @return  result True if the cost of ride is less then balance in ticket otherwise return false.
	 */
	public boolean charge(int rideCost)
	{	
		 
		// local variable to determine either ticket will charge or not
		boolean result = false;
		
		// if balance in ticket is less then cost for ride
		if(balance < rideCost){
			result = false;
		}
		// if balance is more then  cost for ride charge the ticket and 
		// update the riding
		else
		{
			balance -= rideCost;
			result = true;
			riding = false;
		}
		return result;
	}
	
	/**
	 * Figure out either in transit or not meaning either you are traveling or not
	 * @return riding Return either true or false depend on situation
	 */
	public boolean isInTransit() 
	{
		//return either true or false
		return riding;    
	}
}
