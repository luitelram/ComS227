package mini3;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class is a strategy for the game of tic-tac-toe 
 * and  implementation of an interface Player.
 * @author Ram Luitel
 */
public class MyPlayer implements Player{
	
	private String name;
	private int row; 
	private int column; 
	private int columnPrevious; 
	private int rowPrevious ; 
	private char[][] gameBoard; 
	
	/**
	 * Constructor
	 */
	public MyPlayer()
	{
		name = " Ram ";
		row = -1; 
		column = -1;
		columnPrevious = -1; 
		rowPrevious = -1; 	
	}
	/**
	 * Constructor not used
	 * @param givenRand
	 */
	public MyPlayer(Random givenRand)
	{
	
	}

	@Override
	public Move play(TicTacToeGame g)
	{
		 gameBoard = g.getBoard();  
		 ArrayList<Move> movesList = g.getAllLegalMoves();
		 if(g.isLegal(new Move(1, 1)))
		 {
			 row = 1; 
			 column = 1;
		 }
		 //calling this three helper method will basically  prevent the
		 // opponent player to win. meaning blocking other from wining
		 checkRows(g, 1); 
		 checkColumns(g, 1); 
		 checkDiagnols(g, 1); 

		// try to make a move to win the game       
		 checkRows(g, 0); 
		 checkColumns(g, 0); 
		 checkDiagnols(g, 0); 
		 
		 //When no more move is find then return the move
		 if(row == rowPrevious && column == columnPrevious)
		 {
			 row = movesList.get(0).getRow(); 
			 column = movesList.get(0).getCol(); 
		 }  	   
		 rowPrevious = row; 
		 columnPrevious = column; 
	     Move move =  new Move(row, column); 
	     return move;
	}
	@Override
	public void gameOver(TicTacToeGame g) {
		 g.printCurrentStatus();
		
	}
	@Override
	public String getName() 
	{
		return name;
	}
	/**
	 * This is a helper check the diagonal
	 * @param g
	 * @param defend
	 */
	private void checkDiagnols(TicTacToeGame g, int defend) 
	{
		if(gameBoard[0][0] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] && 
				gameBoard[1][1] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
				&& (g.isLegal(new Move(2, 2))))
		{
				row = 2; 
				column = 2; 
		}
		else if(gameBoard[1][1] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] &&
				gameBoard[2][2] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
				&& (g.isLegal(new Move(0, 0))))
		{
				row = 0; 
				column = 0; 
				
		}
		else if(gameBoard[0][0] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] &&
				gameBoard[2][2] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
				&& 	(g.isLegal(new Move(1, 1))))
		 {
				row = 1; 
				column = 1; 
		}
		if(gameBoard[0][2] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] &&
				gameBoard[1][1] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
				&& (g.isLegal(new Move(2, 0))))
		{
				row = 2; 
				column = 0;
		}
		else if(gameBoard[1][1] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] &&
				gameBoard[2][0] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
				&& (g.isLegal(new Move(0, 2))))
		{
				row = 0;
				column = 2;
		}
		else if(gameBoard[0][2] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] &&
				gameBoard[2][0] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
				&& (g.isLegal(new Move(1, 1))))
		{
				row = 1; 
				column = 1; 
		}
	}
	
	/**
	 * This is a helper method that Checks Rows
	 * @param g  
	 * @param defend 
	 */
	private void checkRows(TicTacToeGame g, int defend)
	{
		for(int i = 0; i < gameBoard.length; i++)
		{
			int j = 0; 
			if(gameBoard[i][j] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
				&& gameBoard[i][j + 1] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
				&& (g.isLegal(new Move(i, j + 2))))
			{
					row = i; 
					column = j + 2;
	 	    }
			else if(gameBoard[i][j+1] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
					&& gameBoard[i][j + 2] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
					&& (g.isLegal(new Move(i, j))))
			{
					row = i; 
					column = j; 
	 	   }
		  else if(gameBoard[i][j] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] 
				  && gameBoard[i][j + 2] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
					&&   (g.isLegal(new Move(i, j + 2))))
		  {
				  row = i; 
				  column = j + 1; 
		  }
		}	  	
	}
	/**
	 * Helper method that Check columns
	 * @param g
	 * @param defend
	 */
	private void checkColumns(TicTacToeGame g, int defend) 
	{
		for(int i = 0; i < gameBoard.length; i++)
		{
			int j = 0; 
			if(gameBoard[j][i] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] &&
					gameBoard[j + 1][i] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
					&& (g.isLegal(new Move(i, j + 2))))
			{
					row = j + 2; 
					column = i; 	
			}
			else if(gameBoard[j + 1][i] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] &&
					gameBoard[j + 2][i] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
					&& (g.isLegal(new Move(i, j))))
			  {
					row = j; 
					column = i; 	
			}
			else if(gameBoard[j][i] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)] &&
					gameBoard[j + 2][i] == TicTacToeGame.MARKER[Math.abs(g.getTurn() - defend)]
					&& (g.isLegal(new Move(i, j + 2))))
				{
					row = j + 1; 
					column = i; 
			   }
	 	  }
	 }
	
}
