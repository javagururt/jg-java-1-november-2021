package student_mihails_nikolajevs.lesson_2_var.level_2_intern_;

public class ConditionalOper {
    public static void main(String[] args) {

        int x = 150;

        // (true && false) = false
        if (x > 0 && x <=100) {
            System.out.println("x is between 0 and 100");
            // (true && true)
        } else if (x > 100 && x <= 200){
            System.out.println("x is between 100 and 200");
        }

        boolean rain = false;
        boolean sun = true;

        if (sun) {
                System.out.println("Go to walk without umbrella! ");
            } else {
                System.out.println("Go to walk with umbrella!!! ");
        }
    }
}


