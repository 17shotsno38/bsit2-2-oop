import java.util.Scanner;

class DurandalUniversity {
        String studentID;
        String firstName;
        String lastName;
        String course;
        String section;

        int attendance, finals, project, midterms;
        double overall;
        double imoaverage;


        void add(String id, String fn, String ln, String crs, String sec,
                 int mid,int finale, int proj, int atnds ){
            this.studentID = id;
            this.firstName = fn;
            this.lastName = ln;
            this.course = crs;
            this.section = sec;

            this.midterms = mid;
            this.finals = finale;
            this.project = proj;
            this.attendance = atnds;

            this.overall = atnds + mid + proj + finale;
            this.imoaverage = (overall / 400.0) * 100;
        }

        void show() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);
        System.out.println("Score: " + attendance + ", " + midterms + ", " + project + ", " + finals );
        System.out.println("Average Score: " + imoaverage);

        if(imoaverage <= 75){
            System.out.println("You Failed! Study Harder");
        } else {
            System.out.println("Yay! You passed!");
        }
    }
    public static void main(String[] args) {
            DurandalUniversity enrollee = new DurandalUniversity();
            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String fn = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String ln = scanner.nextLine();
        System.out.print("Enter Course: ");
        String crs = scanner.nextLine();
        System.out.print("Enter Section: ");
        String sec = scanner.nextLine();

        System.out.print("Midterms: ");
        int mid = scanner.nextInt();

        System.out.print("Finals: ");
        int finale = scanner.nextInt();

        System.out.print("Attendance Tally: ");
        int atnds = scanner.nextInt();

        System.out.print("Projects submitted: ");
        int proj = scanner.nextInt();

        enrollee.add(id,fn,ln,crs,sec,atnds,mid,proj,finale);
        System.out.println("Durandal University Log Records: ");
        enrollee.show();


        scanner.close();
    }
}
