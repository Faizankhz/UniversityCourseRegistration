public class Main {
    public static void main(String[] args) {

        Student[] students = {

                new Student("Ali Khan", 101, 84.67),

                new Student("Sara Ahmed", 102, 49.00),

                new Student("Usman Raza", 103, 91.00),

                new Student("Hina Noor", 104, 72.50),

                new Student("Bilal Shah", 105, 65.00)
        };

        ResultCalculator calculator =
                new ResultCalculator();

        Student highest = students[0];
        Student lowest = students[0];

        double total = 0;

        int passed = 0;
        int failed = 0;

        

  
        System.out.println();

        for (Student student : students) {

            String grade =
                    calculator.calculateGrade(
                            student.getAverage()
                    );

            boolean isPassed =
                    calculator.isPassed(
                            student.getAverage()
                    );

            System.out.printf(
                    "Roll No: %d | Name: %-12s | Average: %.2f | Grade: %s | Status: %s%n",
                    student.getRollNo(),
                    student.getName(),
                    student.getAverage(),
                    grade,
                    isPassed ? "Pass" : "Fail"
            );

            total += student.getAverage();

            if (isPassed)
                passed++;
            else
                failed++;

            if (student.getAverage() >
                    highest.getAverage()) {

                highest = student;
            }

            if (student.getAverage() <
                    lowest.getAverage()) {

                lowest = student;
            }
        }

        System.out.printf(
                "%nHighest Average: %s (%.2f)%n",
                highest.getName(),
                highest.getAverage()
        );

        System.out.printf(
                "Lowest Average: %s (%.2f)%n",
                lowest.getName(),
                lowest.getAverage()
        );

        System.out.printf(
                "Overall Class Average: %.2f%n",
                total / students.length
        );

        System.out.println(
                "Passed Students: " + passed
        );

        System.out.println(
                "Failed Students: " + failed
        );
    }
}