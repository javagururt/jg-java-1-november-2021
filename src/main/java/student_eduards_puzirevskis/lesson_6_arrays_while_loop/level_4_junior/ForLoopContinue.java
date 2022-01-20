package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_4_junior;
/*
Создайте класс ForLoopContinue и в нём продемонстрируйте
как досрочно закончить текущую итерацию цикла for.
 */
public class ForLoopContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Your counter is " + i);
            if (i == 15) {
                System.out.println("Alright, it's enough for now");
                break;
            }
        }
    }
}
