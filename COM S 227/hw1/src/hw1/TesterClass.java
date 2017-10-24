package hw1;

public class TesterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Ticket t  = new Ticket(300, false);
		 
		 
		 Turnstile zone2 = new Turnstile(2);
		 Turnstile zone5 = new Turnstile(5);
		
		 zone2.swipeIn(t);
		// zone5.swipeOut(t);
		  
		 System.out.println(zone5.swipeOut(t));
		 
		 
	
	}

}
