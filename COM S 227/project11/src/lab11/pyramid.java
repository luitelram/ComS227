package lab11;

public class pyramid {

	public static void main(String[] args) {
		System.out.println(getPyramidCount(2));

	}
	public static int  getPyramidCount( int n)
	{
		int total = 0;
		// base case
		if( n == 1)
			return 1;
		// Recursive case
		else
		{
		   total =  (int) (Math.pow(n, 2) + getPyramidCount( n - 1));
			
		}
		return total;
	}

}
