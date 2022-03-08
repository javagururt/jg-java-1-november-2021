package student_julija_radchenko.lesson_6_homeworks.level_4_junior;

public class ForLoopContinue {
    public static void main(String[]args){
        int []array = {5,15,20,25,30,35};
        for(int i :array){
            if(i ==25){
                continue;
            }
            System.out.println(i);
        }
    }
}
