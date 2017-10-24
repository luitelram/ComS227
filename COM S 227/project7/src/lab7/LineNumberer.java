package lab7;
import java.io.File;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumberer
{
  public static void main(String[] args) throws FileNotFoundException
  {
	//  File file = new File("/Users/luitelram/Documents/workspace/project7/src/lab7/LineNumberer.java");
	  
	    Scanner scanner = new Scanner(new File("/Users/luitelram/Documents/workspace/project7/src/lab7/LineNumberer.java"));  
    
    Scanner in = new Scanner(System.in);
    File outFile = new File("LineNumberer.txt");
    if (outFile.exists())
    {
      System.out.print("File already exists, ok to overwrite (y/n)? ");
      if (!in.nextLine().startsWith("y"))
      {
        return;
      }
    }
    
    PrintWriter out = new PrintWriter(outFile);
    
    
    int lineCount = 1;

    while (scanner.hasNextLine())
    {
      String line = scanner.nextLine();
      out.print(lineCount + " ");
      out.println(line);
      lineCount += 1;
    }
    System.out.println("Done");
    out.close();
  }
}