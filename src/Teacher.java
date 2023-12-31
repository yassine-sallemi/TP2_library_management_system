import java.time.LocalDate;

public class Teacher extends Person {
    private String fieldOfExpertise;

    public Teacher(String cin, String firstName, String lastName, LocalDate birthday, String fieldOfExpertise) {
        super(cin, firstName, lastName, birthday);
        this.fieldOfExpertise = fieldOfExpertise;
    }
}
