import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Novel novel = new Novel(132,"Lkteb", "El keteb", 1939,"Ro3b");
        Textbook textbook = new Textbook(147,"Ltextbook", "El keteb", 1999,"Maths",4);

        Library lib = new Library();
        lib.displayBooks();
        lib.addBook(novel);
        lib.addBook(novel);
        lib.addBook(textbook);
        lib.displayBooks();

        Teacher t1 = new Teacher("11123453",
                "Foulen",
                "Ben Foulen",
                LocalDate.of(2002,3,4),
                "Maths");
        Teacher t2 = new Teacher("87654321",
                "Another Foulen",
                "Ben Another Foulen",
                LocalDate.of(2002,3,4),
                "Physics");

        Student s1 = new Student("42653623",
                "Falten",
                "Ben Falten",
                LocalDate.of(2012,3,4),
                "GL");
        Student s2 = new Student("23453456",
                "Another Falten",
                "Ben Another Falten",
                LocalDate.of(2010,1,24),
                "RT");

        t1.borrowBook(132,lib);
        s2.borrowBook(132,lib);
        s2.borrowBook(147,lib);
        lib.displayBooks();

        t1.returnBook(132,lib);
        lib.displayBooks();

        s1.createLibraryCard(
                LocalDate.of(2023,1,1),
                LocalDate.of(2025,12,31));
        s1.libraryCard.displayLibraryCard();
    }
}