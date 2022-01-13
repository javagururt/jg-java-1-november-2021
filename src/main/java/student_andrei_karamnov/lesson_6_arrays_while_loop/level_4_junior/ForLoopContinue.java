package student_andrei_karamnov.lesson_6_arrays_while_loop.level_4_junior;

import teacher.annotations.CodeReview;

/*Создайте класс ForLoopContinue и в нём продемонстрируйте
как досрочно закончить текущую итерацию цикла for.*/
@CodeReview(approved = true)
class ForLoopContinue {
    public static void main(String[] args) {
        String searchCharacter = "В этом примере реализован поиск символа в строке";
        char symbol = 'н';
        boolean find = false;
        for (int i = 0; i < searchCharacter.length(); i++) {
                if (searchCharacter.charAt(i) == symbol){
                    find = true;
                    break;
                }
            }
            if (find)
                System.out.println("Символ '" + symbol + "' найден в строке");
            else
                System.out.println("Символ '" + symbol + "' не найден в строке");
        }
    }

