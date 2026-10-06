import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Management System =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter department: ");
        String department = sc.next();

        System.out.print("Enter email: ");
        String email = sc.next();

        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Marks        : " + marks);
        System.out.println("Department   : " + department);
        System.out.println("Email        : " + email);

        if (marks >= 50) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }

        sc.close();
    }
}
