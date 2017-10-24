package lab11;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String rootDirectory = "/Users/luitelram/Documents/workspace"; 
		 System.out.println(countBytes(new File(rootDirectory)) + " byte");
	}
	  /**
	   * retrn the size of all file 
	   */
	public static long countBytes(File f)
	  {
		  if (!f.isDirectory())
	     {
	       return f.length();
	     }
	    else
	    {
	     long size = 0;
	      File[] files = f.listFiles();
	      for (int i = 0; i < files.length; ++i)
	      {
	       // countBytes(files[i]);
	        size += countBytes(files[i]);
	      }
	      return size;
	    }
	  }

}
