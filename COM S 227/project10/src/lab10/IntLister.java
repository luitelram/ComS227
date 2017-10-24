package lab10;
public class IntLister {

	   public static void main(String[] args) {
	      
		   IntListSorted list = new IntListSorted();
	     
	      list.add(0);
	      list.add(1);
	      list.add(3);
	      list.add(10);
	      System.out.println(list);
	      System.out.println("Size: " + list.size());
	      System.out.println("Min: " + list.getMinimum());
	      System.out.println("Max: " + list.getMaximum());
	      System.out.println("Med: " + list.getMedian());
	   }
	}