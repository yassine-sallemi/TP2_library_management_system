public class Book {
    private int isbn;
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(int isbn, String title,String author, int yearOfPublication){
        this.isbn = isbn;
        this.title= title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public int getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void displayInformation(){
        System.out.println("\""+title + "\" is written by \"" + author + "\" in " + yearOfPublication + ".");
    }
}
