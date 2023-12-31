import java.time.LocalDate;

public class Student extends Person {
    private String major;

    public Student(String cin, String firstName, String lastName, LocalDate birthday, String major) {
        super(cin, firstName, lastName, birthday);
        this.major = major;
    }
}
