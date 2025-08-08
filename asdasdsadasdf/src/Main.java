public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Caitlyn Kiramman", 23, "CRIMINOLOGY", 85, 78, 92);
        Student s2 = new Student("Jayce Talis", 23, "CE", 80, 72, 90);
        Student s3 = new Student("Mel Medrada", 24, "POLSCI", 54, 58, 60);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {
            s.displayInfo();
            double avg = s.calculateAverage();
            System.out.printf("Average: %.2f\n", avg);
            String letter = s.getLetterGrade();
            System.out.println("Letter Grade: " + letter);
            boolean passing = s.isPassing();
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));
            System.out.println();
            if (passing) passingCount++;
        }

        System.out.println("Passing Students: " + passingCount);
    }
}