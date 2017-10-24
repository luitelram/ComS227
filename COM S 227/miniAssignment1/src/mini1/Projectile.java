/**
 * 
 */
package mini1;
import java.awt.Rectangle;

/**
 * This class encapsulates information about the position and velocity 
 * of a projectile in two dimensions.
 * @author luitelram
 *
 */
public class Projectile {
	
	private  double initialPositionX;
	private  double initialPositionY;
	private  double initialVelocityX;
	private   double initialVelocityY;
	private   int size;
	private boolean alive;
	private int age;
	
	
	/**
	 * Constructs a projectile with the given information
	 * @param initialPositionX given initial x-axis
	 * @param initialPositionY given initial y-axis
	 * @param initialVelocityX given initial X component velocity
	 * @param initialVelocityY given initial Y component  velocity
	 * @param givenSize
	 */
	public Projectile(double initialPositionX, double initialPositionY, double initialVelocityX, 
				double initialVelocityY, int givenSize)
	{
		this.initialPositionX = initialPositionX;
		this.initialPositionY = initialPositionY;
		this.initialVelocityX = initialVelocityX;
		this.initialVelocityY = initialVelocityY;
		size = givenSize;
		alive = true;
		age = 0;
		
		
		
	}
		/**
		 * Determines whether this projectile's bounding box intersects 
		 * with the given projectile's bounding box
		 * @param other
		 * @return true or false  depends on situation
		 */
		public boolean collides(Projectile other)
		{
			if(getBoundingBox().intersects(other.getBoundingBox()))
			{	
				return true;	
			}
			else 
			{
				return false;
				
			}
			
		}
		
		/**
		 * Returns the number of times that timeStep has been called on this 
		 * projectile (regardless of whether it is marked or unmarked).
		 * @return
		 */
		public int getAge()
		{
			
			return age;    // return age
		}
		
		/**
		 * Returns the bounding box for this projectile as a new instance of java.awt.Rectangle.
		 * @return
		 */
		public java.awt.Rectangle getBoundingBox()
		{
			int x = (int) Math.round(getX());		// cast double to int
			int y = (int) Math.round(getY());
			Rectangle  rectangel = new Rectangle(x,y,size,size);		// create a rectangle 
			return rectangel;
		}
		
		/**
		 * Returns the horizontal component of this projectile's velocity
		 * @return
		 */
		public double getVelocityX()
		{
			return initialVelocityX;		// return current X component of velocity 
		}
		
		/**
		 * Returns the vertical component of this projectile's velocity
		 * @return
		 */
		public double getVelocityY()
		{
			return initialVelocityY;       // return current Y component of velocity 
		}
		
		/**
		 * Returns this projectile's horizontal position
		 * @return inintialX
		 */
		public double getX()
		{
			return initialPositionX;    // return current x position
		}
		
		/**
		 * Returns this projectile's vertical position
		 * @return inintialY
		 */
		public double getY()
		{
			return initialPositionY;    // return current y position
		}
		
		/**
		 * Determines whether this projectile's status is "alive".
		 * @return true or false depends on situation
		 */
		public boolean isAlive()
		{
			
			
			return alive;    // check the status of bounding box.
			
		}
		
		/**
		 * Marks this projectile as "dead".
		 */
		public void kill()
		{
			
			alive = false;		// kill the bounding box.
		}
		
		/**
		 * Simulates motion over one time step.
		 */
		public void timeStep()
		{
			timeStep(0);			// Call timeStep() with zero gravity
			
		}
		
		/**
		 * Simulates motion over one time step.
		 * @param gravity
		 */
		public void timeStep(double gravity)
		{
			initialPositionX +=  initialVelocityX; 	// update the x position
			initialPositionY +=  initialVelocityY;	// update the y-position
			initialVelocityY +=   gravity;	// update the y component of velocity.
			age++;
	}				
}

