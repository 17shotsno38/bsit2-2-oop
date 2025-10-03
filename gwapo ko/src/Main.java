public class Main {
    public static void main(String[] args) {
        // Create library items
        Book book1 = new Book("B001", "Java Programming", "John Doe", "1234567890", 350, "Programming");
        Book book2 = new Book("B002", "Mystery Novel", "Jane Smith", "0987654321", 220, "Mystery");
        Magazine mag1 = new Magazine("M001", "Tech Monthly", "Alice Brown", 45, "June", true);
        Magazine mag2 = new Magazine("M002", "History Today", "Bob White", 12, "May", false);
        DVD dvd1 = new DVD("D001", "Inception", "Christopher Nolan", 148, "PG-13", "Sci-Fi");
        DVD dvd2 = new DVD("D002", "Toy Story", "John Lasseter", 81, "G", "Animation");

        // Create users
        Student student = new Student("S001", "Tom Student", "tom@student.edu", "ST123", "Computer Science");
        Faculty faculty = new Faculty("F001", "Dr. Smith", "smith@faculty.edu", "Engineering", "Professor");

        // LibraryManager
        LibraryManager manager = new LibraryManager();
        manager.addItem(book1);
        manager.addItem(book2);
        manager.addItem(mag1);
        manager.addItem(mag2);
        manager.addItem(dvd1);
        manager.addItem(dvd2);

        // Display all items
        System.out.println("All Library Items:");
        manager.displayAllItems();

        // Borrow items
        manager.borrowItem("B001", student.getName());
        manager.borrowItem("M001", faculty.getName());
        manager.borrowItem("D001", student.getName());

        // Add borrowed items to users
        student.addBorrowedItem(book1);
        student.addBorrowedItem(dvd1);
        faculty.addBorrowedItem(mag1);

        // Display borrowed items
        System.out.println("\nStudent Borrowed Items:");
        student.displayBorrowedItems();
        System.out.println("\nFaculty Borrowed Items:");
        faculty.displayBorrowedItems();

        // Return items
        manager.returnItem("B001");
        manager.returnItem("M001");

        // Display available items
        System.out.println("\nAvailable Items:");
        manager.displayAvailableItems();

        // Calculate late fees
        System.out.println("\nTotal Late Fees for 3 days:");
        System.out.println(manager.calculateTotalLateFees(3));

        // Display borrowing status
        System.out.println("\nBorrowing Status:");
        for (Borrowable item : new Borrowable[]{book1, mag1, dvd1}) {
            System.out.println(item.getBorrowingStatus());
        }

        // Test setter validation
        try {
            book2.setGenre("");
        } catch (Exception e) {
            System.out.println("Genre validation: " + e.getMessage());
        }
        try {
            dvd2.setRating("X");
        } catch (Exception e) {
            System.out.println("Rating validation: " + e.getMessage());
        }
    }
}