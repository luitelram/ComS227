/**
 * 
 */
package mini1;
import java.awt.Rectangle;


/**
 * @author luitelram
 *
 */
public class ProjectileTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Projectile p;
		
		p = new Projectile(1.0, 2.0, 3.0, 4.0, 10);
		 Rectangle box = p.getBoundingBox();
		 System.out.println(box);
		 System.out.println("Expected Rectangle at (1, 2), width 10, height 10");
		 
		
	}

}
