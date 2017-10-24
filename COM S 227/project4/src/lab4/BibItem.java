/**
 * 
 */
package lab4;

/**
 * @author luitelram
 *
 */
public class BibItem
{
  private String authors;
  private String title;
  private String journal;
  private int year;
  private int volume;
  
  /**
   * Constructor
   * @param givenAuthors Author name
   * @param givenTitle	Title of journal
   * @param givenJournal	given journal
   * @param givenYear	Year that journal publish
   * @param givenVolume	Volume of journal
   */
  public BibItem(String givenAuthors, String givenTitle, String givenJournal, 
		  			int givenYear, int givenVolume)
  {
    authors = givenAuthors;
    title = givenTitle;
    journal = givenJournal;
    year = givenYear;
    volume = givenVolume;
  }
  
  /**
   * toString method
   * print out as specification
   */
  public String toString(){
	  
	  String print ="";
	  
	  print = authors.toUpperCase() + ". " + title +". " + journal + ". "+ volume + " (" +  year + ").";
	  
	  return print;
  }
}
