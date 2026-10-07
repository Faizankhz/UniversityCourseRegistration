public class ResultDemo {
    public static void main(String[] args) {
        String name = "Ali";

        double m1 = 80;
        double m2 = 70;
        double m3 = 90;

        double average = (m1 + m2 + m3) / 3.0;

        System.out.println("Student: " + name);
        System.out.println("Average: " + average);

        if (average >= 80)
            System.out.println("Grade: A");
        else if (average >= 70)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}