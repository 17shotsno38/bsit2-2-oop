import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) { items.add(item); }

    public void displayAllItems() {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                System.out.println(((LibraryItem) item).getItemInfo());
            }
            System.out.println(item.getBorrowingStatus());
        }
    }

    public void borrowItem(String itemId, String borrowerName) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem && ((LibraryItem) item).itemId.equals(itemId)) {
                if (item.isAvailable()) {
                    item.borrowItem(borrowerName);
                    System.out.println("Item borrowed: " + itemId);
                } else {
                    System.out.println("Item not available: " + itemId);
                }
                return;
            }
        }
        System.out.println("Item not found: " + itemId);
    }

    public void returnItem(String itemId) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem && ((LibraryItem) item).itemId.equals(itemId)) {
                item.returnItem();
                System.out.println("Item returned: " + itemId);
                return;
            }
        }
        System.out.println("Item not found: " + itemId);
    }

    public void displayAvailableItems() {
        for (Borrowable item : items) {
            if (item.isAvailable() && item instanceof LibraryItem) {
                System.out.println(((LibraryItem) item).getItemInfo());
            }
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0;
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                total += ((LibraryItem) item).calculateLateFee(daysLate);
            }
        }
        return total;
    }
}