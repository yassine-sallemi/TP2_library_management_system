import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<Book>();
    public boolean bookExists(Book newBook) {
        for (Book book : books) {
            if (book.getTitle().equals(newBook.getTitle()) &&
                    book.getAuthor().equals(newBook.getAuthor()) &&
                    book.getYearOfPublication() == newBook.getYearOfPublication()) {
                return true;
            }
        }
        return false;
    }
    public void addBook(Book book){
        if(!bookExists(book))
            books.add(book);
        else
            System.out.println("Book already exists in the library!");
    }
    public void removeBook(int isbn){
        Book book = findBook(isbn);
        if (book != null) {
            books.remove(book);
            return;
        }
        // If loop exists then there is no book with such ISBN
        System.out.println("This book does not exist!");
    }
    public Book findBook(int isbn){
        for(Book book : books){
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }
    void displayBooks(){
        if(books.isEmpty())
            System.out.println("Library is empty!");
        else{
            System.out.println("---LIBRARY---");
            for(Book book : books){
                System.out.println("\tISBN("+book.getIsbn()+")");
                book.displayInformation();
            }
            System.out.println("-------------");
        }


    }
}
