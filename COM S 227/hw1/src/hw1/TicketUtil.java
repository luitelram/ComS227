/**
 * 
 */
package hw1;

/**
 * Utility class for Ticket
 * @author Ram Luitel
 *
 */
public class TicketUtil {
	
	
	/**
	*	Fare	(in	cents)	for	a	trip	within	a	zone.
	*/
	public static final int RIDE_COST =	200;

	/**
	*	Discounted	fare	(in	cents)	for	a	trip	within	a	zone.
	*/
	public static final int RIDE_COST_DISCOUNTED =	150;

	/**
	*	Additional	fare	(in	cents)	for	travel	between	zones.
	*/
	public static final int ZONE_COST =	175;

	/**
	*	Additional	discounted	fare	(in	cents)	for	travel	between	zones.
	*/
	public static final int ZONE_COST_DISCOUNTED =	120;
	
	/**
	*	Constant	representing	a	nonexistent	start	zone.
	*/
	public static final int INVALID_ZONE =	-1;
	
	/**
	 * Private constructor to prevent to create instance of TicketUtil class
	 */
	private TicketUtil(){
		
	}
	
	/**
	 * Calculate the cost of  ride between start zone and end zone
	 * @param startZone The start zone where you start to ride
	 * @param endZone	The end zone where you end to ride
	 * @param discounted Either true if discount applied else false 
	 * @return rideCost The cost ride
	 */
	public static int calculateRideCost(int startZone, int endZone,boolean discounted)
	{		
			int rideCost = 0;
		
			// if ticket is discount fare calculate the cost for ride using 
			// discount cost
			if(discounted == true)
			{
				rideCost = RIDE_COST_DISCOUNTED + Math.abs(startZone - endZone ) * ZONE_COST_DISCOUNTED;
				
			// if the ticket is not a discount fare then calculate ride of cost using non discount fare
			}else
			{
				rideCost = RIDE_COST + Math.abs(startZone - endZone ) * ZONE_COST;
				
		//	System.out.println(startZone);
		//	System.out.println(endZone);
			
			}
			return rideCost;	
	}
	
	/**
	 * Calculate the cost of given number of rides between start zone and end zone
	 * @param numRides The total number of rides
	 * @param startZone The start zone where you start to ride
	 * @param endZone	The end zone where you end to ride
	 * @param discounted Either true if discount applied else false 
	 * @return cost The cost for given number of rides.
	 */
	public static int calculateRideCost(int numRides, int startZone, int endZone, boolean discounted)
	{
			// basically does same as previous methods but this time it return the cost for number of rides
			int cost = 0;
			if(discounted  == true)
			{
				cost = numRides * (RIDE_COST_DISCOUNTED + Math.abs(startZone - endZone ) * ZONE_COST_DISCOUNTED);
			}else
			{
				cost = numRides * (RIDE_COST + Math.abs(startZone - endZone ) * ZONE_COST);
			}
			return cost;
	}
	
	/**
	 * Calculate the cost of ride with in a zone
	 * @param discounted The boolean value either true or false
	 * @return zoneRideCost the cost of ride within a zone
	 */
	public static int getMinimumFare(boolean discounted)
	{
		// calculate the minimum cost of ride either using discount or without using discount
		int zoneRideCost = 0;
		if(discounted== true)
		{
			zoneRideCost =  RIDE_COST_DISCOUNTED ;
		
		}else
		{
			zoneRideCost = RIDE_COST;
		}
		return zoneRideCost;
	}
			 
}
