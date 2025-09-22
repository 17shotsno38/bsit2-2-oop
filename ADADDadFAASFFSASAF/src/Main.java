// Main.java
public class Main {
    public static void main(String[] args) {

        Libro book1 = new Libro("1984", "George Orwell", "1234567890", true, 1949);
        Libro book2 = new Libro("To Kill a Mockingbird", "Harper Lee", "1234567890123", true, 1960);
        Libro book3 = new Libro("The Great Gatsby", "F. Scott Fitzgerald", "0987654321", true, 1925);


        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        library.displayAllBooks();


        System.out.println("Borrowing 1984: " + (library.borrowBook("1234567890") ? "Success" : "Failed"));


        System.out.println("Borrowing 1984 again: " + (library.borrowBook("1234567890") ? "Success" : "Failed"));


        System.out.println("Returning 1984: " + (library.returnBook("1234567890") ? "Success" : "Failed"));


        library.displayAvailableBooks();


        try {
            Libro invalidBook = new Libro("", "", "123", true, 1400);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation test: " + e.getMessage());
        }
    }
}