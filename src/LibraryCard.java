import java.time.LocalDate;

public class LibraryCard {
    private String cin;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private LocalDate issuedAt;
    private LocalDate expiresAt;
    private String job;

    public LibraryCard(String cin, String firstName, String lastName, LocalDate birthday, LocalDate issuedAt, LocalDate expiresAt, String job) {
        this.cin = cin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.issuedAt = issuedAt;
        this.expiresAt = expiresAt;
        this.job = job;
    }

    void displayLibraryCard(){
        System.out.println("---LIBRARY CARD---");
        System.out.println("CIN: " + cin);
        System.out.println(firstName + " " + lastName + " born in " + birthday);
        System.out.println("From " + issuedAt + " to " + expiresAt);
        System.out.println(job);
        System.out.println("------------------");
    }
}
