import java.util.ArrayList;
import java.time.LocalDate;

public class Person implements LibraryUser {
    private String cin;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    protected ArrayList<Book> borrowedBooks = new ArrayList<Book>();
    public LibraryCard libraryCard;

    public Person(String cin, String firstName, String lastName, LocalDate birthday) {
        this.cin = cin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    void createLibraryCard(LocalDate issuedAt, LocalDate expiresAt){
        libraryCard = new LibraryCard(cin, firstName, lastName, birthday, issuedAt, expiresAt, this.getClass().getName());
    }
    @Override
    public void borrowBook(int isbn, Library library) {
        Book book = library.findBook(isbn);
        if(book == null) {
            System.out.println("This book is unavailable.");
            return;
        }
        library.removeBook(isbn);
        borrowedBooks.add(book);
    }
    @Override
    public void returnBook(int isbn, Library library) {
        for(Book book : borrowedBooks){
            if (book.getIsbn() == isbn) {
                library.addBook(book);
                borrowedBooks.remove(book);
                return;
            }
        }
    }
}
