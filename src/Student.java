public class Student {

    private String name;
    private int rollNo;
    private double average;

    public Student(
            String name,
            int rollNo,
            double average) {

        this.name = name;
        this.rollNo = rollNo;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getAverage() {
        return average;
    }
}