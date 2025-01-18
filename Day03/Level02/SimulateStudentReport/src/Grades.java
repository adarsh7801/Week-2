public class Grades {

    //initializing the variables
    String name;
    int rollNo;
    int marks;

    //constructor
    public  Grades(String name, int rollNo, int marks){
        this.name= name;
        this.marks=marks;
        this.rollNo=rollNo;
    }

    //method to calculate grades
    public  void calculateGrade(){
        if (marks>=90){
            System.out.println("A grade");
        } else if (marks>=80) {
            System.out.println("B grade");
        } else if (marks>=70) {
            System.out.println("C grade");
        } else if (marks>=60) {
            System.out.println("D grade");
        } else if (marks>=50) {
            System.out.println("E grade");
        } else {
            System.out.println("F grade");
        }

    }

    //method to print student details
    public void studentDetails(){
        System.out.print("The student name "+name+", roll number "+rollNo+", have got marks "+marks+" have got ");
    }

}
