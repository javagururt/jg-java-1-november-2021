package student_andrei_karamnov.lesson_6_arrays_while_loop.level_4_junior;
/*Создайте класс WhileLoopContinue и в нём продемонстрируйте
как досрочно закончить текущую итерацию цикла while.*/
class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10){
            i++;
            System.out.println("Я хочу написать это 10 раз, но напишу только 3");
            if (i > 3){
                break;
            }
        }
    }

}
