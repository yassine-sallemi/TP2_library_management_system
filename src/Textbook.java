public class Textbook extends Book{
    private String subject;
    private int edition;

    public Textbook(int isbn, String title, String author, int yearOfPublication, String subject, int edition) {
        super(isbn, title, author, yearOfPublication);
        this.subject = subject;
        this.edition = edition;
    }

    public void displayInformation(){
        System.out.print("This textbook, ");
        super.displayInformation();
        System.out.println("It is about " + subject + ". (Edition " + edition + ")");

    }
}
