package student_artyom_shvegzhda.lesson_4_if_statement.lessoncode.testapproach;

public class SimpleCalculator {

    public int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

}
