package lab11;

public class MaxValue {

	public static void main(String[] args) {
		int[] test = {3, 4, 9, 1, 2, 3, 2}; // max should be 5
	    int result = maxFinder(test);
	    System.out.println(result);

	}
	private static int maxFinder(int[] test)
	{
		return max (test, 0, test.length-1);	
	}
	
	private static int max (int[] arr, int start, int end)
	  {
		
	    if (start == end)
	    {
	      return arr[start];
	    }
	    else
	    {
	      int mid = (start + end) / 2;
	      int leftMax = max(arr, start, mid);
	      int rightMax = max(arr, mid + 1, end);
	      
	       if( leftMax < rightMax)
	       {
	    	   return rightMax;
	       }
	       else
	    	  return  leftMax;
	     
	    }
	  }

}
