package student_stanislav_p.lesson_12_exceptions.homework.level_3_junior;


// ---- Task_18 ----
public class NullPointerExceptionDemo {


        public static void main(String[] args) {

            int[] data = null;

            int len = data.length; // Cannot read the array length because "data" is null
        }


}
