class funBooks {
    String title;
    String naghimo;
    int page;
    boolean ifnaa = true;


    public funBooks(String btitle, String author, int bpage, boolean availability) {
        this.title = btitle;
        this.naghimo = author;
        this.page = bpage;
        this.ifnaa = availability;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + naghimo);
        System.out.println("Page: " + page);
        System.out.println("Available?: " + (ifnaa ? "Ja" : "Nein"));
    }

    public void borrowBook() {
        if (ifnaa) {
            ifnaa = false;
            System.out.println("You have borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    public void returnBook() {
        if (!ifnaa) {
            ifnaa = true;
            System.out.println("You have returned \"" + title + "\". Thank you!");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

    // main method to test your class
    public static void main(String[] args) {

        funBooks myBook = new funBooks("Ruination", "Anthony Reynolds", 350, true);

        myBook.displayInfo();
        myBook.borrowBook();
        myBook.borrowBook();
        myBook.returnBook();
        myBook.returnBook();
    }
}
