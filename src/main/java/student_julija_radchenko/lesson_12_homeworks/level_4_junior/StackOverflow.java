package student_julija_radchenko.lesson_12_homeworks.level_4_junior;

public class StackOverflow {
    public static void main (String []args){
    StackOverflow over = new StackOverflow();
    over.overFlow();
    }
    public void overFlow(){
        System.out.println("So close to Stack Overflow ");
        overFlow();
    }
}

