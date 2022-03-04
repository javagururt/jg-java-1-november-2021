package student_mihails_nikolajevs.lesson_6.level_4_junior_;

public class ForLoopContinue {

    public static void main(String[] args) {

        for (int i = 20; i > 0; i--) {
            if (i == 10) {
                continue;
            }
                System.out.println(i);
        }
    }
}