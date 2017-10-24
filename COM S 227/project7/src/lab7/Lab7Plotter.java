package lab7;

import java.util.Scanner;
import java.io.File;
import java.awt.Point;
import plotter.PolylinePlotter;
import java.io.FileNotFoundException;

public class Lab7Plotter {
	
	static PolylinePlotter plotter = new PolylinePlotter();

	public static void main(String[] args) throws FileNotFoundException {
		
	//	File file = new File("hello.txt");
	    Scanner in = new Scanner(new File("hello.txt"));
	    in.useDelimiter("#");
	    in.nextLine();
	    
	    // while there are more lines...
	    while (in.hasNextLine())
	    {
	      // get the next line
	      String line = in.nextLine();
	      
	      // process the line
	      plot(line);
	    }
	    
	    // close the file
	    in.close();
	  }
	    	
	private static void plot(String line)
	{
		
		Scanner fromStr = new Scanner(line);
		line.trim();
		int width=1;
		String color;
		int x; 
		int y;
		
		if(line.length() != 0)
		{
	
			if(fromStr.hasNextInt())
			{
				 width = fromStr.nextInt();
			}
			
			color = fromStr.next();
			x = fromStr.nextInt();
			y = fromStr.nextInt();
			plotter.startLine(color, new Point(x, y), width);
			
			while(fromStr.hasNextInt())
			{
				x = fromStr.nextInt();
				y = fromStr.nextInt();
				plotter.addPoint(new Point(x, y));
				
			}
		}
		fromStr.close();
	}
	  

}
