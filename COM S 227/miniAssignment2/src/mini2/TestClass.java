package mini2;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MatchingRule mr = new MatchingRule();
		CodeWord cw = new CodeWord ("abda", mr);
		
		//System.out.println("source: abda");
		System.out.println("Leftshift by 2:  "+cw.countMatchesInLeftShift("ababcad",2) +"  Match ");
		System.out.println(cw.maxMatches("ababcad"));
		

	}

}
