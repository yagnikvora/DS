import java.util.*;

class Student_details {
    int Enrollment_no;
    String name;
    int semester;
    double cpi;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Enrollment_no :- ");
        Enrollment_no = sc.nextInt();
        System.out.print("Enter Name  :- ");
        name = sc.next();
        System.out.print("Enter Semester :- ");
        semester = sc.nextInt();
        System.out.print("Enter CPI :- ");
        cpi = sc.nextDouble();
        System.out.println();
    }

    public void showData() {
        System.out.println("\nEnrollment_No is " + Enrollment_no);
        System.out.println("Name is " + name);
        System.out.println("Semester is " + semester);
        System.out.println("CPI is " + cpi);
        System.out.println();
    }
}

class Student {
    public static void main(String[] args) {
        Student_details s[] = new Student_details[5];
        for(int i = 0; i<5; i++){
            s[i] = new Student_details();
            s[i].getData();
        }
        for(int i = 0; i<5; i++)
            s[i].showData();
    }
}
