/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;

  public void addBook(Book b)
  {
    book = b;
  }

  public String toString() 
  {
    if (book == null) {return "";}
    String info = book.toString();
    
    return info;
  }

  public void testBook(Book tester) {
    tester.setTitle("new title");
    System.out.println("the title has been changed to: " + tester.getTitle());
  }
}