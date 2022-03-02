package student_julija_radchenko.lesson_5_homeworks.level_4_junior;

public class Task_28 {
    public static void main (String [] args) {

        int[] arrayLength = new int[10];
        for (int i = 0; i < arrayLength.length; i++) {

            arrayLength[i] = ((int) (Math.random() * 51) - 20);
        }
        for (int array : arrayLength)
            System.out.println(array );
        int min = arrayLength [0];
        for (int i = 0; i < arrayLength.length; i++){
            if (min > arrayLength[i])
                min = arrayLength[i];
        }
        System.out.println( "Array min number is " + min);
    }
}

