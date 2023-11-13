/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  public static String owner = "PLTW";
  private static int numEntries = 0;
  private Movie movie; 
  private Song song; 

  public void addBook(Book b)
  {
    if (book == null) {
      book = b; 
      numEntries++; 
    } else {
      System.out.println("Sorry! You already have a book in the library! "); 
    }
  }
  public void addMovie(Movie m) {
    if (movie == null) {
      movie = m; 
      numEntries++; 
    } else {
      System.out.println("Sorry! You already have a movie in the library! "); 
    }
  }
  
  public void addSong(Song s) {
    if (song == null) {
      song = s; 
      numEntries++; 
    } else {
      System.out.println("Sorry! You already have a song in the library! "); 
    }
  }

  public void changeBook(Book b) {
    book = b; 
  }
  
  public void changeMovie(Movie m) {
    movie = m; 
  }

  public void changeSong(Song s) {
    song = s; 
  }


  public String toString() 
  {
    String info = ""; 
    if (book == null) {
      info = "";
    } else {
      info = book.toString();
    }
    if (movie == null) {
      info += ""; 
    } else {
      info = movie.toString();
    }
    if (song == null) {
      info += ""; 
    } else {
      info = song.toString();
    }
    
    return info;
  }

  public void testBook(Book tester) {
    tester.setTitle("new title");
    System.out.println("the title has been changed to: " + tester.getTitle());
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