package student_dima_talanov.lesson_5.level_2_intern;


public class Task12 {

    public static void main(String[] args) {
        int[] myArray = new int[3];
        for (int i = 0; i < 3; i++) {
            myArray[i] = (int) (Math.random() * 8);
            System.out.println(myArray[i]);
        }
    }
}



