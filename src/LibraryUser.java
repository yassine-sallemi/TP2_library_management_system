public interface LibraryUser {
    void borrowBook(int isbn, Library library);
    void returnBook(int isbn, Library library);
}
