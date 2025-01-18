import java.util.Scanner;

//creating the main class
public class Student {
    public static void main(String[] args) {

        //creating object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking the input
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();

        System.out.println("Enter the roll number of the student");
        int rollNo= sc.nextInt();

        System.out.println("Enter the marks of the student out of 100");
        int marks = sc.nextInt();

        //creating the object of the Grades class
        Grades grade = new Grades(name, rollNo, marks);

        //calling the methods
        grade.studentDetails();
        grade.calculateGrade();

        //closing the scanner
        sc.close();
    }
}
