package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_4_junior;

public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {

        int number = 10;
        while (number < 11) {
            number--;
            if (number == -99) {
                break;
            }
            System.out.println(number);
        }

    }
}
