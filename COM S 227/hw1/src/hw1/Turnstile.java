/**
 * 
 */
package hw1;

/**
 * The Turnstile type models a turnstile. Each turnstile has a zone in which it
 * is located and has methods swipeIn() for entering the station and swipeOut() for exiting.
 * @author Ram Luitel
 */
public class Turnstile 
{
	/**
	 * Zone to keep track of which zone you are riding in
	 */
	private int zone;

	/**
	 * Variable to keep track of how many time ticket swipe in
	 */
	private int entranceCount;
	
	/**
	 * Variable to keep track of how many time ticket swipe out
	 */
	private int outCount;
	
	/**
	 * Constructor
	 * @param zone The actual zone where you start your ride
	 */
	public Turnstile(int zone)
	{
		// initializing 
		this.zone = zone;
		entranceCount = 0;
		outCount = 0;	
	}
	
	/**
	 *  This methods is for entering the station. After entering the station
	 *  it records this turnstile on the given ticket as the start zone.
	 * @param ticket The object of ticket class
	 * @return isResult The boolean value that will be either true or false
	 */
	public boolean swipeIn(Ticket ticket)
	{
		
	// temp variable
		boolean inResult;
		if(!ticket.isInTransit() && ticket.getBalance() < TicketUtil.getMinimumFare(ticket.isDiscounted()))
		{
			inResult = false;
		}
		else if(ticket.isInTransit() && ( ticket.getBalance() >= TicketUtil.getMinimumFare(ticket.isDiscounted())))
		{
			ticket.charge(TicketUtil.calculateRideCost(ticket.getStartZone(), zone , ticket.isDiscounted()));
			ticket.beginTrip(zone);
			entranceCount++;
			inResult = true;
		}
		else 	
		{		ticket.beginTrip(zone);
				entranceCount++;
				inResult = true;
			} 
			
		return inResult;    
	}
	
	/**
	 * Charge the ticket for a ride from the ticket’s start zone to this turnstile’s location.
	 * @param ticket The object of ticket class
	 * @return outResult the boolean value
	 */
	public boolean swipeOut(Ticket ticket)
	{	
		// temp variable
		boolean outResult = false;
		
		if(ticket.getBalance() < TicketUtil.getMinimumFare(ticket.isDiscounted()) && (ticket.isInTransit()))
		{
			outResult = false;
		}

		//if the balance in ticket is greater then equal to ride cost then charge 
		// the ticket for the ride and increase the outCount also return true
		else if(ticket.isInTransit() && ticket.getBalance() >= 
				  TicketUtil.calculateRideCost(ticket.getStartZone(), zone, ticket.isDiscounted()))
		{
				ticket.charge(TicketUtil.calculateRideCost(ticket.getStartZone(), zone , ticket.isDiscounted()));  
				outResult = true;
				outCount++;
		}
		
		return outResult;
	}
	
	/**
	 * Get the swipIn count
	 * @return entranceCount The number of time the ticket being swipe in
	 */
	public int getEntranceCount()
	{	
		return entranceCount;
	}
	
	/**
	 * Get the swipeOut count
	 * @return outCount	The number of times ticket swipe out
	 */
	public int getExitCount()
	{	
		return outCount;
	}
}
