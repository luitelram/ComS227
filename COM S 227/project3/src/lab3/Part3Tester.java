package lab3;

public class Part3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Part1
		System.out.println("Part 1");
		System.out.println("______");
		
		int num = 1000000;
		int millionth = num % 7;
		System.out.println(millionth);
		System.out.println();
	
		
		
		// Part 2 is Parson class.
		
		// part 3
		System.out.println("Part 3");
		System.out.println("______");
		
		String s = "42";
	    int x = Integer.parseInt(s);
	    System.out.println("x = " + x);
	    System.out.println();

	    // Part 4
	    System.out.println("Part 4");
		System.out.println("______");
		
	    System.out.println("MAX_VALUE = " +Integer.MAX_VALUE);
	    System.out.println("MIN_VALUE = "+ Integer.MIN_VALUE);
	    
	    int maxValue = Integer.MAX_VALUE;
	    maxValue +=1;
	    System.out.println("MAX_VALUE + 1 = " + maxValue);
	    
	    maxValue += 2;
	    System.out.println("MAX_VALUE + 2 = " + maxValue);
	    
	    System.out.println("MAX_VALUE + MAX_VALUE = " + Integer.MAX_VALUE+ Integer.MAX_VALUE);
	    
	//    System.out.println(Integer.MAX_VALUE+1);
	  
	   
	}

}
