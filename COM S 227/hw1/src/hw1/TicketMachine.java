/**
 * 
 */
package hw1;

/**
 * A ticket machine  that can sell ticket with different  various criteria.
 * This class also keeps track of the total number of tickets sold and the 
 * total amount of money collected
 * @author Ram Luitel
 */
public class TicketMachine {
	
	/**
	 * The total ticket sell
	 */
	private int ticketCounter;
	
	/**
	 * Total amount of ticket sold
	 */
	private int totalCost;
	
	/**
	 * Constructor
	 * variable are initialized here
	 */
	public TicketMachine(){
		
		ticketCounter = 0;
		totalCost = 0;
	}
	
	/**
	 * Returns a new ticket with exactly the balance needed for a ride between startZone and
	 * endZone, using a discounted fare if discounted is true
	 * @param startZone The start zone
	 * @param endZone	The end zone
	 * @param discounted Discount either true or false
	 * @return ticket1 	The ticket with above specification
	 */
	public Ticket purchaseTicket(int startZone, int endZone, boolean discounted)
	{
		// cost of ticket 
		int cost = TicketUtil.calculateRideCost(startZone, endZone, discounted);
		
		//create ticket 
		Ticket ticket1 = new Ticket(cost,discounted);
		
		// increased ticket sold
		ticketCounter++;
		
		// add cost to the total cost
		totalCost  += cost;
		
		return ticket1;
	}
	
	/**
	 * Returns a new ticket with exactly the balance needed for a numRides rides between
	 * startZone and endZone, using a discounted fare if discounted is true
	 *  @param numRides The total number of rides
	 * @param startZone The start zone
	 * @param endZone	The end zone
	 * @param discounted Discount either true or false
	 * @return ticket2 	The ticket with above specification
	 */
	public Ticket purchaseTicket(int numRides, int startZone, int endZone, boolean discounted)
	{
		// basically done same things as of above methods
		int costOfNumRide = TicketUtil.calculateRideCost(numRides, startZone, endZone, discounted);
		Ticket ticket2 = new Ticket(costOfNumRide,discounted);
		ticketCounter++;
		totalCost += costOfNumRide;
		return ticket2;
	}
	
	/**
	 * Return a new ticket with given balance, using a discounted fare if discounted is true
	 * @param amount 	The balance in ticket
	 * @param discounted	Discount either true or false
	 * @return ticket3		The ticket that has balance and discount information
	 */
	public Ticket purchaseTicket(int amount, boolean discounted)
	{
		// this couple line of code do same things as in previous two methods
	//	int minCost = TicketUtil.getMinimumFare(discounted);
		Ticket ticket3 = new Ticket(amount,discounted);
		ticketCounter++;
		totalCost += amount;
		return ticket3;
	}
	
	/**
	 * Returns the total number of tickets sold from this machine.
	 * @return ticketCounter The number of ticket sale
	 */
	public int totalTickets()
	{
		return ticketCounter;
	}
	
	/**
	 * Returns the total cost for all tickets sold from this machine
	 * @return totalCost The total amount of ticket sell from this machine
	 */
	public int totalCost(){
		
		return totalCost;
	}
}
