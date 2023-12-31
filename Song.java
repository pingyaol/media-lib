/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Song
{
  private int rating;
  private String title;
  private String author;
  private String date;

  /*** Constructor ****/
  public Song(String t)
  {
	title = t;
    date = DateTime.getTime ();
  }
 
   /*** Accessor methods ***/
  public String getTitle() {
	return title;
  }
 
  public String getAuthor() {
	return author;
  }
 
  public int getRating() {
	return rating;
  }
 
  public String toString()  
  {
	String info = "\"" + title + "\", written by " + author;
	if (rating != 0)  
 	info += ", rating is " + rating;
	 
	return info;
  }
 
  // Step 23 - 29
  public boolean equals(Song s)
  {
	// variations of the if statement:
	// if(b.title.equals(getTitle()) && b.author.equals(getAuthor()))
	// if(title.equals(b.title) && author.equals(b.author))
	// if(b.title.equals(title) && b.author.equals(author))
	if(this.title.equals(s.title) && this.author.equals(s.author))
  	return true;  
	return false;
 
  }
 
  /*** Mutator methods ***/
  public void setAuthor(String a) {
	author = a;
  }
	 
  public void setTitle(String t) {
	title = t;
  }
 
  // Step 7: create the method
  public void adjustRating(int r)
  {
	// Step 10-11 improve the method
	if ((rating + r >= 0) && (rating + r <= 10))
  	rating += r;
 
	r = 10;// Step 9: changing the param here has no effect in the runner
 
  }
 
}
