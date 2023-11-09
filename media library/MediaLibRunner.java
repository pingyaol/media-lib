/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    // step 1-6 
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);
    System.out.println("Library:\n" + myLib);
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);

    // steps 8 - 9
    int myRating = 5;
    System.out.println("my rating (before): " + myRating);
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    System.out.println("my rating (after): " + myRating); 

    // step 10 
    myBook.adjustRating(-2);
    System.out.println(myBook);
    System.out.println("my rating (too low): " + myRating); 
    myBook.adjustRating(15);
    System.out.println(myBook);
    System.out.println("my rating (too high): " + myRating); 

    // steps 12 - 14
    System.out.println("changed title");
    myBook.setTitle("Harry Potter");
    myBook.setAuthor("JK Rowling");
    System.out.println("Book: " + myBook);
    System.out.println("Library: " + myLib);

    // step 15 
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

    // steps 18 - 22 
    /*
    System.out.println("before change: " + newBook);
    myLib.testBook(newBook);
    System.out.println("after change: " + newBook);
     */

    // step 25 
    Book newBook2 = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook2);
    System.out.println(newBook2 + " equal " + newBook + "? "  + newBook2.equals(newBook));

    // step 27 
    // error: System.out.println(newBook2.title);   



  }
}