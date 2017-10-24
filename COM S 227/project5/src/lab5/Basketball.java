package lab5;

public class Basketball
{
	
	private double diameter;
	private boolean inFlated;

  public Basketball(double givenDiameter)
  {
	  diameter = givenDiameter;
	  inFlated = false;
  }

  public boolean isDribbleable()
  {
    return inFlated;
  }

  public double getDiameter()
  {
    return diameter;
  }

  public double getCircumference()
  {
    return Math.PI * diameter;
  }

  public void inflate()
  {
	  inFlated = true;  
  }
  
}
