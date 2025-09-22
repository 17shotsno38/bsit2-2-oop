public class Libro {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;

    public Libro(String title, String author, String isbn, boolean isAvailable, int yearPublished) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        if (yearPublished < 1450 || yearPublished > 2025) {
            throw new IllegalArgumentException("Year must be between 1450 and 2025.");
        }
        this.yearPublished = yearPublished;
    }

    public void angTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

    public void angAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty.");
        }
        this.author = author;
    }

    public void angIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty.");
        }
        this.isbn = isbn;
    }

    public boolean borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!this.isAvailable) {
            this.isAvailable = true;
            return true;
        }
        return false;

    }
    public void displayBookInfo() {
        System.out.printf("Title: %s\nAuthor: %s\nISBN: %s\nYear: %d\nAvailable: %s\n",
                title, author, isbn, yearPublished, isAvailable ? "Yes" : "No");
    }
}