package student_julija_radchenko.lesson_6_homeworks.level_4_junior;

public class ForInfiniteLoopBreak {
    public static void main(String []args){
        int i = 0;
        for (; ;){
            i++;
            System.out.println("I'm infinite :) ");

            if (i >25){

                System.out.println("Stop");
                break;
            }
        }
    }
}
