public class MediaLibRunnerStatic {
    public static void main(String[] args)
    {
        /*System.out.println(MediaLib.getOwner() + "'s Library");
        System.out.println(MediaLib.getNumEntries());*/

        System.out.println("new book library created");
        MediaLib bookLib = new MediaLib(); 
        Book myBook = new Book("The Lord of the Rings", "Tolkien");
        bookLib.addBook(myBook);
        System.out.println("Library:\n" + bookLib);
        // System.out.println(bookLib.getNumEntries());

        System.out.println("new movie library created");
        MediaLib movieLib = new MediaLib();
        Movie myMovie = new Movie("Christopher Robin", 120); 
        movieLib.addMovie(myMovie); 
        System.out.println("Library:\n" + movieLib);
        // System.out.println(movieLib.getNumEntries());
        
        System.out.println("new song library created");
        MediaLib songLib = new MediaLib();
        Song mySong = new Song("Cruel Summer", 3); 
        songLib.addSong(mySong); 
        System.out.println("Library:\n" + songLib);
        // System.out.println(movieLib.getNumEntries());
    }
}
