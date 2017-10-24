package hw2;

import java.util.ArrayList;
import java.util.Arrays;

import api.Direction;
import api.Move;
import ui.ConsoleUI;

public class Mytesterclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Game g = new Game(5);
		 int[] arr = {1, 2, 3, 4, 5};
		 g.updateRowOrColumn(arr, 2, Direction.DOWN);
		 int[] result = g.copyRowOrColumn(2, Direction.UP);
		//System.out.println(Arrays.toString(result));
		// System.out.println("Expected: [5, 4, 3, 2, 1]");
		 
		g.collapse(Direction.RIGHT);
	 
	}
}
