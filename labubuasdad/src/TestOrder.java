public class TestOrder {
    public static void main(String[] args) {
        Order o1 = new Order("Alice");
        Order o2 = new Order("Bob");
        Order o3 = new Order("Charlie");


        try {
            o1.addItem("Pizza", 12.99);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            o2.addMultipleItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            o3.addItem("Salad", -5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            o3.addItem("", 4.50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            o3.addMultipleItems(new String[]{"Soda"}, 1.99, 2.99);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println(o1.displayOrder());
        System.out.println(o2.displayOrder());
        System.out.println(o3.displayOrder());

        System.out.println("\nTotal Orders: " + Order.getTotalOrders());


        Order highest = o1;
        if (o2.getTotalAmount() > highest.getTotalAmount()) highest = o2;
        if (o3.getTotalAmount() > highest.getTotalAmount()) highest = o3;

        System.out.println("Highest total order: " + highest.displayOrder());
    }
}