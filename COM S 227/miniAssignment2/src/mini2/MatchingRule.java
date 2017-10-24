/**
 * 
 */
package mini2;

/**
 * A matching rule encapsulates a strategy for determining whether
 * a given pair of characters should be counted as "matching"
 * @author luitelram
 *
 */
public class MatchingRule {
	
	private String sourceChars;
	private String targetChars;
	
	/**
	 * Default constructor
	 */
	public MatchingRule() {
	
		this("abcdefghijklmnopqrstuvwxyz","abcdefghijklmnopqrstuvwxyz");
	}
		
	
	/**
	 * Constructs a matching rule in which the valid source characters are given by the string givenSourceChars, 
	 * and the matching character for the ith character of givenSourceChars is the corresponding ith character of 
	 * givenTargetChars. The characters are not restricted to be alphabetic. 
	 * @param givenSourceChars
	 * @param givenTargetChars
	 */
	public MatchingRule(java.lang.String givenSourceChars,
            java.lang.String givenTargetChars)
	{
		sourceChars = givenSourceChars;
		targetChars = givenTargetChars;
			
	}
	
	/**
	 * Returns true if sourceChar is valid and matches targetChar 
	 * according to this rule. A character is defined to be valid if
	 * it appears at least once in this rule's source character string.
	 * @param sourceChar source character to be checked for match
	 * @param targetChar target character to be checked for match
	 * @return true if the given source character matches the given
	 * 		 target character according to this rule, false otherwise.
	 */
	public boolean matches(char sourceChar, char targetChar)
	{
		boolean matches = false;
		String ch = ""+sourceChar;
		if( isValidSource(ch))   
		{
			for( int i = 0; i < sourceChars.length(); i++ )
			{
				if(i >= targetChars.length() && sourceChar == sourceChars.charAt(i))
				{
					matches = true;
				}
				// this compression should be done if target has next character.
				if( i < targetChars.length() && sourceChars.charAt(i) == sourceChar && targetChars.charAt(i) == targetChar)
				{
					matches = true;	
				}
				
			}	
		}
		return matches;
	}
	/**
	 * Returns true if all the characters in the given string are valid.
	 * According to this rule a character is defined to be valid if it
	 * appears at least once in this rule's source character string.
	 * @param s string to check for validity
	 * @return true if all characters are valid, false otherwise
	 */
	public boolean isValidSource(java.lang.String s)
	{
		
		for( int i = 0; i < s.length(); i++){
			
			 if(!sourceChars.contains(""+s.charAt(i)))
			 {
				 return false;
			 }
		}
		return true;
	}

}
