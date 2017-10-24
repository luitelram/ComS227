package lab5;



import org.junit.Before;

import balloon.Balloon;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonTests {
	
	// margin of error for floating-point comparisons
    private static final double EPSILON = 10e-07;
    private Balloon bb;

    @Before    
    public void setup()  // runs before every test case
    {
      bb = new Balloon(5);
    }

    @Test
    public void testInitialDiameter(){
    	
    	String message = " A newly constructed Balloon should have radius ";
    	
    	assertEquals(message, 0, bb.getRadius(), EPSILON);
    }
    
    @Test
    public void testInitialIsPopped(){
    
    	String msg = "A newly constructed Balloon should not be popped";
    	boolean result = bb.isPopped();
    	assertEquals(msg, false, result);
    }
    
    @Test
    public void testBlow(){
    	
    	String msg = "after calling blow(5) on a Balloon with maximum radius 10, the radius should be 5";
    	Balloon bb1 = new Balloon(10);
    	 bb1.blow(5);
    	 
    	 assertEquals(msg, 5, bb1.getRadius(), EPSILON);
    }
    
    @Test
    public void testPopedAferIsPop(){
    	
    	String msg = " balloon should popped after calling pop()";
    	Balloon bb2 = new Balloon(15);
    	bb2.blow(10);
    	bb2.pop();
    	boolean result = bb2.isPopped();
    	assertEquals(msg, true, result);
    }
    
    @Test 
    public void testDeflate(){
    	
    	String mess = "Defalate balloon has readius 0";
    	Balloon bb3 = new Balloon(8);
    	bb3.deflate();
    	 assertEquals(mess, 0, bb3.getRadius(), EPSILON);
    	
    	
    }
    
    // 1 and 3 fail
    @Test 
    public void testBlow2(){
    	
    	String mess = "Maximum radius of ballon is 8 if radius if more then 8 is go back ot 0";
    	Balloon bb3 = new Balloon(8);
    	bb3.blow(4);
    	bb3.blow(6);
    	 assertEquals(mess, 0, bb3.getRadius(), EPSILON);
    }
    
    
    // fail 4
    @Test
    public void testPopAfterDeflated(){
    	String mss = "newly created ballon is deflated";
    	Balloon bb3 = new Balloon(10);
    	bb3.deflate();
    	boolean resuslt = bb3.isPopped();
    	assertEquals(mss, false, resuslt);
    	
    }
    
    //fail 2
    @Test
    public void testGetRadius2(){
    	
    	String mess = "balloon blow with radius 0 is not popped";
    	Balloon bb2 = new Balloon(10);
    	
    	bb2.blow(4);
    	bb2.pop();
    	bb2.blow(5);
    	bb2.pop();
    	bb2.blow(4);
    	bb2.pop();
    	bb2.blow(8);
    	bb2.blow(1);
    	
    //	bb2.isPopped();
    	boolean resuslt = bb2.isPopped();
    	assertEquals(mess, true, resuslt);
    	assertEquals(mess, 0, bb2.getRadius(), EPSILON);
    	
    	
    }
}  
