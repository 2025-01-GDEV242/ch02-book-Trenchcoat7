/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    public void setRefNumber(String ref){
    
        refNumber = ref;
        
        int length = ref.length();
        if(ref.length() >= 3){
            
        }
        else {
            // invalid, prints an error method.
            System.out.println("Reference Numbers need to be at least");
            System.out.println("3 characters long. Please try again.");
        }
    
    }
    
    public void borrow(int borrowed){
    
        borrowed += 1;
    
    }
    
    public String getAuthor(String author){
    
        return author;
        
    }
    
    public String getTitle(String title){
    
        return title;
        
    }
    
    public String getRefNumber(){
    
        return refNumber;
    
    }

    public int getBorrowed(){
    
        return borrowed;
    
    }
    
    private int getPages(int pages){
    
        return pages;
        
    }
    
    public void printAuthor()
    {
    
        System.out.println("The author is " + author);
    
    }
    
    public void printTitle()
    {
    
        System.out.println("The title is " + title);
    
    }
    
    public void printPages()
    {
    
        System.out.println("This book has " + pages + " pages.");
    
    }
    
    public void printAllDetails(){
    
        System.out.println("This book is called " + title + ".");
        System.out.println("It was written by " + author + ".");
        System.out.println("It is " + pages + " pages long.");
        System.out.println("This book has been borrowed " + borrowed + " times.");
        
        int length = refNumber.length();
        
        if(refNumber.length() <= 3){
            refNumber = "ZZZ";
        }
    
        System.out.println("Reference Number: " + refNumber);
    }
}
