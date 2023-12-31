public class Novel extends Book{
    private String genre;

    public Novel(int isbn,String title, String author, int yearOfPublication, String genre) {
        super(isbn, title, author, yearOfPublication);
        this.genre = genre;
    }

    public void displayInformation(){
        System.out.print("This novel, ");
        super.displayInformation();
        System.out.println("Its genre is " + genre + ".");
    }
}
