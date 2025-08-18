public class CalculatorofGrades {

    public static void main(String[] args) {
        CalculatorofGrades calculator = new CalculatorofGrades();

        String studentName = "John Smith";
        double[] grades = {85.5, 92.0, 78.5, 90.0};

        double average = calculator.CalculatetheAvg(grades);
        String letterGrade = calculator.theLettergrade(average);


        calculator.display(studentName, average);


        calculator.displayResult(studentName, average, letterGrade);
    }

    public double CalculatetheAvg(double... grades) {
        if (grades.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public String theLettergrade(double average) {
        if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void display(String studentName, double average) {
        System.out.printf("Student: %s, Average: %.2f%n", studentName, average);
    }

    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.printf("Student: %s, Average: %.2f, Grade: %s%n", studentName, average, letterGrade);
    }
}
