/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  public static String owner = "PLTW";
  private static int numEntries = 0;
  public void addBook(Book b)
  {
	book = b;
  numEntries++;
  }
  public void addMovie(Movie m)
  {
	movie = m;
  numEntries++;
  }
   
  // new step 18-22
  /* test scenario
  public void testBook(Book tester)
  {
	tester.setTitle("Animal Farm");
	// show state chagne with one of the following
	System.out.println(" in test: " + tester);
	System.out.println(" in test: " + tester.getTitle());
  }
  */

  public String toString()  
  {
	String info = "";
 
	// Step 5, avoid crashing by testing that book is not null before using its toString method
	if (book != null)
  	info += "Book: " + book + "\n";
 
	return info;
  }
  public static String getOwner()
  {
    return owner;
  }
  public static void changeOwner(String o) {
    owner= o;
  }
  public static int getNumEntries() {
    return numEntries;
  }
}

