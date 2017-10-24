/**
 * 
 */
package mini2;

/**
 * @author luitelram
 *
 */
public class CodeWord {
	
	private String source;
	private MatchingRule mr;
	
	/**
	 * Constructs a new CodeWord with the given source string that uses a default matching rule.
	 * @param givenData he string encapsulated by this CodeWord
	 */ 
	
	public CodeWord(java.lang.String givenData)
	{
		source = givenData;
		  mr = new MatchingRule();
		  
	}
	/**
	 * Constructs a new CodeWord with the given source string that
	 * will use the given matching rule when checking for matches.
	 * @param givenData the string encapsulated by this CodeWord
	 * @param givenRule the MatchingRule to be used by this CodeWord
	 */
	public CodeWord(java.lang.String givenData, MatchingRule givenRule)
	{
		source = givenData;
		mr = givenRule;
		
	}
	
	/**
	 * Returns the number of occurrences of the given character in this CodeWord
	 * @param ch the character to count
	 * @return number of occurrences of the given character
	 */
	public int letterCount(char ch)
	{
		int count = 0;
		int i = 0;
		while(i < source.length())
		{
			if(ch == source.charAt(i))
			{
				count++;
			}
			i++;
		}
	     return count;
	}
	
	/**
	 * Return the maximum number of matches between this string 
	 * and the target string for all possible alignments.
	 * @param target string to match this source string against
	 * @return maximum number of matching positions
	 */
	public int maxMatches(java.lang.String target)
	{
		int max = countMatchesUnshifted(target);
		for (int i = 0; i < target.length(); i++)
		{
			if( max < countMatchesInRightShift(target,i))
			{
				max = countMatchesInRightShift(target,i);
			}
			if( max < countMatchesInLeftShift(target,i))
			{
				max = countMatchesInLeftShift(target,i);
			}
			
		}
		return max;
	}
	
	/**
	 * Determines the number of matches between this string and the 
	 * target string when the two strings are aligned at position zero
	 * @param target the string to be matched to this one
	 * @return count number of source characters that match the corresponding
	 * 		 target character according to this object's matching rule
	 */
	public int countMatchesUnshifted(java.lang.String target)
	{
		int count = 0;
		
		for(int i = 0; i < source.length() && i < target.length(); i++)
		{
			if(mr.matches(source.charAt(i), target.charAt(i)))
			{
					count++;
			}	
		}
	
		return count;
	}
	
	/**
	 * Determines the number of matches between this string and the target 
	 * string when the source string index shiftAmount is aligned with target
	 * string index 0. Result is undefined if shiftAmount is negative.
	 * @param target  the string to be matched to this one
	 * @param shiftAmount starting index in the source string
	 * @return countRight number of source characters that match the 
	 * 			corresponding target character
	 */
	public int countMatchesInRightShift(java.lang.String target,
            int shiftAmount)
	{
		int countRight = 0;
		if(shiftAmount > 0)
		{
			for(int i = 0;  i< target.length() && i+ shiftAmount < source.length(); i++)
			{
				if(mr.matches(source.charAt(i+shiftAmount), target.charAt(i)))
					countRight++;
			}	
		}
		
		return countRight;
	}
	
	/**
	 * Determines the number of matches between this string and the 
	 * target string when the source string index 0 is aligned with 
	 * target string index shiftAmount. Result is undefined if 
	 * shiftAmount is negative.
	 * @param target the string to be matched to this one
	 * @param shiftAmount starting index in the target string
	 * @return countLeft number of source characters that match 
	 * 			the corresponding target character
	 */
	public int countMatchesInLeftShift(java.lang.String target,
            int shiftAmount)
	{
		int countLeft = 0;
		if(shiftAmount > 0)
		{
			for(int i = 0; i+shiftAmount < target.length() && i < source.length(); i++)
			{
				if(mr.matches(source.charAt(i), target.charAt(i+ shiftAmount)))
					countLeft++;
			}	
		}
		
		return countLeft;
	}
}
