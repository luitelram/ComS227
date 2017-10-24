package hw2;
import java.util.ArrayList;
import java.util.Random;
import api.Direction;
import api.Move;
import api.Result;
import api.TilePosition;

/**
 * The Game class contains the state and logic for an implementation of the
 * game 2048.  The basic underlying state is an n by n grid of tiles, 
 * represented by integer values.  A zero in a cell is considered to be
 * "empty", and all other cells contain some power of two.  The game is played
 * by calling the method <code>collapse()</code>, selecting one of the four
 * directions (LEFT, RIGHT, UP, DOWN). Each row or column is then collapsed
 * according to the algorithm described in the methods of <code>GameUtil</code>.
 * <p>
 * Whenever two cells are <em>merged</em>, the score is increased by the 
 * combined value of the two cells.
 * @author Ram Luitel
 */
public class Game
{
	/**
	 *  n x n dimensional array as game board
	 */ 
	private int[][] gameBoard;
	
	/**
	 * Score that keep track of total score
	 */
	 private int  score;

	/**
	 *  The random number generator.
	 */
	private Random givenRandom ; 

  /**
   * Constructs a game with a grid of the given size, using a default
   * random number generator.  Initially there should be two
   * nonempty cells in the grid selected by the method <code>generate()</code>.
   * @param givenSize
   *   size of the grid for this game
   */
  public Game(int givenSize)
  {
	 // call a constructor with in constructor
	 this(givenSize,new Random()); 
  }
  
  /**
   * Constructs a game with a grid of the given size, using the given
   * instance of <code>Random</code> for the random number generator.
   * Initially there should be two nonempty cells in the grid selected 
   * by the method <code>generate()</code>.
   * @param givenSize
   *   size of the grid for this game
   * @param givenRandom
   *   given instance of Random
   */
  
  public Game(int givenSize, Random givenRandom)
  {
	 // initialization 
	gameBoard = new int[givenSize][givenSize];
    this.givenRandom =  givenRandom;
    score = 0;
    
    // Create two random tile at first
   gameBoard[givenRandom.nextInt(givenSize)][givenRandom.nextInt(givenSize)] =   generate().getValue();
   gameBoard[givenRandom.nextInt(givenSize)][givenRandom.nextInt(givenSize)] =   generate().getValue();
   
  }
  
   /**
   * Returns the value in the cell at the given row and column.
   * @param row
   *   given row
   * @param col
   *   given column
   * @return
   *   value in the cell at the given row and column
   */
  public int getCell(int row, int col)
  {
      return  gameBoard[row][col];
  }
  
  /**
   * Sets the value of the cell at the given row and column
   * @param row given row
   * @param col given column
   * @param value value to be set
   */
  public void setCell(int row, int col, int value)
  {
	  gameBoard[row][col] = value;
  }
  
  /**
   * Returns the size of this game's grid.
   * @return
   *   size of the grid
   */
  public int getSize()
  {
    return gameBoard.length;
  }
  
  /**
   * Returns the current score.
   * @return
   *   score for this game
   */
  public int getScore()
  {
    return score;
  }

  /**
   * Copy a row or column from the grid into a new one-dimensional array.  
   * There are four possible actions depending on the given direction:
   * <ul>
   *   <li>LEFT - the row indicated by the index <code>rowOrColumn</code> is
   *   copied into the new array from left to right
   *   <li>RIGHT - the row indicated by the index <code>rowOrColumn</code> is
   *   copied into the new array in reverse (from right to left)
   *   <li>UP - the column indicated by the index <code>rowOrColumn</code> is
   *   copied into the new array from top to bottom
   *   <li>DOWN - the column indicated by the index <code>rowOrColumn</code> is
   *   copied into the new array in reverse (from bottom to top)
   * </ul>
   * @param rowOrColumn
   *   index of the row or column
   * @param dir
   *   direction from which to begin copying
   * @return
   *   array containing the row or column
   */
  public int[] copyRowOrColumn(int rowOrColumn, Direction dir)
  {  
	  // Iterate thought the array and perform the operation
	  // since it is n x n array the number of row = number of columns.
	  // So no separate loop is necessary for direction up and down
	
	  // One dimensional array used to do operation in different direction 
	  	int[] oneDArray = new int [getSize()];
	  	
	  for(int i = 0; i<gameBoard.length; i++)
	  {
	  	if( dir == Direction.LEFT)
		 {
			 oneDArray[i] = gameBoard[rowOrColumn][i];
		 }   
		 if( dir == Direction.RIGHT)
		 { 
			 oneDArray[i] = gameBoard[rowOrColumn][gameBoard.length-1-i];  
		  }
		  if( dir == Direction.UP)
		  {
			 oneDArray[i] = gameBoard[i][rowOrColumn];  
		  }
		  if( dir == Direction.DOWN)
		  {
			 oneDArray[i] = gameBoard[gameBoard.length-1-i][rowOrColumn];  
		  }
	   }	  
	  
    return oneDArray;
  }
  
  /**
   * Updates the grid by copying the given one-dimensional array into
   * a row or column of the grid.
   * There are four possible actions depending on the given direction:
   * <ul>
   *   <li>LEFT - the given array is copied into the the row indicated by the 
   *   index <code>rowOrColumn</code> from left to right
   *   <li>RIGHT - the given array is copied into the the row indicated by the 
   *   index <code>rowOrColumn</code> in reverse (from right to left)
   *   <li>UP - the given array is copied into the column indicated by the 
   *   index <code>rowOrColumn</code> from top to bottom
   *   <li>DOWN - the given array is copied into the column indicated by the 
   *   index <code>rowOrColumn</code> in reverse (from bottom to top)
   * </ul>
   * @param arr
   *   the array from which to copy
   * @param rowOrColumn
   *   index of the row or column
   * @param dir
   *   direction from which to begin copying
   */
  public void updateRowOrColumn(int[] arr, int rowOrColumn, Direction dir)
  {
	  // iterate thought the array and perform the arrange the array in given direction
	 for( int i = 0; i < arr.length; i++)
	 {
		 if(dir == Direction.LEFT)
		 {
			  gameBoard [rowOrColumn][i] = arr[i];
		 }
		 if(dir == Direction.RIGHT)
		 {
			 gameBoard [rowOrColumn][i] = arr[arr.length-1-i];
		 }
		 if( dir == Direction.UP)
		 {
			 gameBoard[i][rowOrColumn] = arr[i];
		 }
		 if(dir == Direction.DOWN)
		 {
			 gameBoard[i][rowOrColumn] = arr[arr.length-1-i];
		 }	  
	 }
  }

  /**
   * Plays one step of the game by collapsing the grid in the given direction.
   * Returns a <code>Result</code> object containing a list of Move objects describing
   * all moves performed, and a <code>TilePosition</code> object describing
   * the position and value of a newly added tile, if any.  All Move objects must
   * include a valid value for <code>getRowOrColumn()</code> and <code>getDirection()</code>.
   * If no move actually occurs, the returned <code>Result</code> object contains an 
   * empty list and has a null value for the new <code>TilePosition</code>.
   * <p>
   * If any tiles are moved or merged, a new tile is selected according to the 
   * <code>generate()</code> method and is added to the grid.
   * <p>
   * The collapse of an individual row or column must be performed by the 
   * method <code>collapseArray</code> of <code>GameUtil</code>.  
   * 
   * @param dir
   *   direction in which to collapse the grid
   * @return
   *   Result object containing moves and new tile position
   */
  public Result collapse(Direction dir)
  {
	  //Create Result object
	  Result result = new Result();
	  
	 // One dimensional array that need to collapse in given direction	
	  int [] oneDArray;
	  
	// Create the array list of move object
	  ArrayList<Move> moveList;
	  
	  for( int i = 0 ; i < gameBoard.length; i++)
	  {
		  oneDArray = copyRowOrColumn(i,  dir);
		   moveList = GameUtil.collapseArray(oneDArray);
		  
		  // Update the grid
		  updateRowOrColumn(oneDArray, i, dir);  
		  
		// Set the  direction of array in grid
		  for(Move move:moveList)
		  {
			  move.setDirection(i, dir);
		  }
		  result.addMoves(moveList);
		
		  // Iterate through the move list  and add score when ever merge
		  for(int j = 0; j < moveList.size(); j++)
		  {
			  if(moveList.get(j).isMerged())		 
			  {
				  score += 2*moveList.get(j).getValue();
			  }
		  }
	  }
	  // create tile and add to the grid 
	  TilePosition tileP;
	  if( result.getMoves().size() > 0)
	  {
		  tileP  = generate();
		  if(tileP != null)
		  { 
			 setCell(tileP.getRow(), tileP.getCol(), tileP.getValue());
			 result.setNewTile(tileP);
		  } 
	  }  
     return result;
  }

  /**
   * Use this game's instance of <code>Random</code> to generate
   * a new tile.  The tile's row and column must be an empty cell
   * of the grid, and the tile's value is either 2 or 4. 
   * The tile is selected in such a way that
   * <ul>
   *   <li>All empty cells of the grid are equally likely
   *   <li>The tile's value is a 2 with 90% probability and a 4 with 10% probability
   * </ul>
   * This method does not modify the grid.  If the grid has no
   * empty cells, returns null.
   * @return
   *   a new TilePosition containing the row, column, and value of the
   *   selected new tile, or null if the grid has no empty cells
   */
  public TilePosition generate()
  {
	  // Create TilePosiiton object and initially assigned it as null  
	  TilePosition tilePosition = null;
	  // Array List of rows
	  
	  ArrayList<Integer> rowList = new ArrayList<Integer>();
	 
	  // ArrayList of columns
	  ArrayList<Integer> colList = new ArrayList<Integer>();
	  
	  //iterate through row
	 for( int i = 0; i < gameBoard.length; i++ )
	 {		 
		 // iterate through column
		 for ( int j = 0; j< gameBoard[i].length; j++)
		 { 
			 // if this cell is empty add to the list
			 if( gameBoard[i][j] == 0)
			 {
				 rowList.add(i);
				 colList.add(j);
			 }
		 }
	 }
	 // if there are empty cell(s) then get the random index of a cell
	 if( rowList.size() > 0)
	 {
		int  tempIndex = givenRandom.nextInt(rowList.size());
		
		// generate random number 0 to 9 and  if number is less then 9 
		// value at tile will be 2 if the number is 9 then value at tile will be 4	
		int randomNumber = givenRandom.nextInt(9)+1;
	
			if(randomNumber < 9)
			{
				tilePosition = new TilePosition (rowList.get(tempIndex),colList.get(tempIndex),2);		
			}
			else
			{
				tilePosition = new TilePosition (rowList.get(tempIndex),colList.get(tempIndex),4);
			}	
	 }
    return tilePosition;
  }

}
  










