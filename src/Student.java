
public class Student {
    private String studentID;
    private String studentName;
    private String department;

    public Student(String studentID, String studentName, String department) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
    }
}