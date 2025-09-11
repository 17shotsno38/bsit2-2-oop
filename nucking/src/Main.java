// Main.java
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Akali Jhomen Tethi", 2001, 80000, "Nursing", 15000, 8);
        Developer developer = new Developer("Mel Medarda", 2002, 70000, "Engineering", "Kotlin", 5);
        Intern intern = new Intern("Luxanna Crownguard", 2003, 30000, "Engineering", "Tech University", true);

        System.out.println("\n--- Manager Info ---");
        manager.displayInfo();
        System.out.println("Salary: " + manager.calculateSalary());
        manager.work();

        System.out.println("\n--- Developer Info ---");
        developer.displayInfo();
        System.out.println("Salary: " + developer.calculateSalary());
        developer.work();

        System.out.println("\n--- Intern Info ---");
        intern.displayInfo();
        System.out.println("Salary: " + intern.calculateSalary());
        intern.work();
    }
}