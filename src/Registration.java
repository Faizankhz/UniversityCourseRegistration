
public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void displayRegistration() {
        System.out.println("Registration Details");
        System.out.println("====================");

        System.out.println();
        System.out.println("Student Information");
        System.out.println("-------------------");
        student.displayStudent();

        System.out.println();
        System.out.println("Course Information");
        System.out.println("------------------");
        course.displayCourse();
    }
}