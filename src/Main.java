

public class Main {
    public static void main(String[] args) {

        Student student = new Student(
                "F24-BSSE-5C-127",
                "Faizan Khan",
                "Software Engineering"
        );

        Course course = new Course(
                "SE-301",
                "Software Engineering",
                3
        );

        Registration registration = new Registration(student, course);

        registration.displayRegistration();
    }
}