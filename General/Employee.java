import java.util.*;

class Employee_details {
    int employee_ID;
    String name;
    String designation;
    int salary;

    Employee_details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id of Employee :- ");
        employee_ID = sc.nextInt();
        System.out.print("Enter Name of Employee :- ");
        name = sc.next();
        System.out.print("Enter Designation of Employee :- ");
        designation = sc.next();
        System.out.print("Enter Salary of Employee :- ");
        salary = sc.nextInt();
    }

    public void showData() {
        System.out.println("\nEmployee Id is " + employee_ID);
        System.out.println("Employee Name is " + name);
        System.out.println("Employee Designation is " + designation);
        System.out.println("Employee Salary is " + salary);
    }
}

class Employee {
    public static void main(String[] args) {
        Employee_details e1 = new Employee_details();
        // e1.getData();
        e1.showData();
    }
}
