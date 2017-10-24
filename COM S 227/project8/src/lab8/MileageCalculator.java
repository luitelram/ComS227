/**
 * 
 */
package lab8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author luitelram
 *
 */
public class MileageCalculator {

 
	static ArrayList<FillUp> list = new ArrayList<FillUp>();
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		list =  ConstructArrayList();
		//System.out.println(list.toArray(a));
		
		double  miles = 0.0;
		double gallons = 0;
		
		int i = 0;
		int previousOdometer = list.get(i).getOdometer();
		
		
		for(  i = 1; i<list.size(); i++)
		{
				
				int currentOdometer =  list.get(i).getOdometer();
				gallons = list.get(i).getGallons();
				miles = ( currentOdometer - previousOdometer ) / gallons;
				System.out.printf("Mileage %d :  %.2f\n",i, miles);
				
				previousOdometer = currentOdometer;
			
		}
			
	}
	
	public static ArrayList<FillUp> ConstructArrayList() throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("mileage.txt"));
	//	scan.nextInt();
		
		
		while(scan.hasNext())
		{
			list.add(new FillUp( scan.nextInt(), scan.nextDouble()));
		}	
		return list;
	}

}
