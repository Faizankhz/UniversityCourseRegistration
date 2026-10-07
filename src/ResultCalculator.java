public class ResultCalculator {

    public String calculateGrade(double average) {

        if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "F";
    }

    public boolean isPassed(double average) {
        return average >= 50;
    }
}