package lab8;
import java.util.Random;

public class DeckTest
{
  public static void main(String[] args)
  {
    Deck deck = new Deck();
    Card[] hand = deck.select(5);
    System.out.println(Card.toString(hand));
    
    
    // Seeding
  //  Random rand = new Random(42);  // "seed" the random number generator with a value we choose
  //  Deck deck1 = new Deck(rand);    // construct the deck to use that generator
  //  Card[] hand1 = deck1.select(5);
   // System.out.println(Card.toString(hand1));
  }
}
