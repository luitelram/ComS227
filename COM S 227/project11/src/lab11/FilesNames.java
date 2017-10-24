package lab11;

import java.io.File;
import java.util.ArrayList;

public class FilesNames {

	public static void main(String[] args) {
		
		 String rootDirectory = "/Users/luitelram/Documents/workspace/project11/src/lab11"; 

		System.out.println(findFiles(new File(rootDirectory)));

	}
	 public static ArrayList findFiles(File file)
	  {
	    // create an empty array list...
	    ArrayList arr = new ArrayList();
	    
	    // pass it into the recursive method
	    findFiles(file, arr);
	    
	    // and return the filled-up ArrayList
	    return arr;
	  }

	  // recursive helper method
	  private static void findFiles(File file, ArrayList list) 
	  {
		  String fileName;
		  if (!file.isDirectory())
		    {
		     fileName =  file.getName();
		     if(fileName.contains(".java"))
		     {
		    	 list.add(fileName);
		     }
		    }
		    else
		    {
		      // Recursive case: f is a directory, so go through the 
		      // files and sub directories it contains, and recursively call
		      // this method on each one
		      File[] files = file.listFiles();
		      for (int i = 0; i < files.length; ++i)
		      {
		    	    findFiles(files[i],list);
		    	  		  
		      }
		    }
		  
	  }


}
