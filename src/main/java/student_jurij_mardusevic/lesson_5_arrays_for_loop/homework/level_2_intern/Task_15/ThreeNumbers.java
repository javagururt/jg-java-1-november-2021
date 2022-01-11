package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_2_intern.Task_15;

class ThreeNumbers {
    public static void main(String[] args) {

        int[] myArray = new int[3];
        System.out.println("Первый случайный номер массива: ");

        myArray[0] = (int) (Math.random() * 999);
        System.out.println(myArray[0]);
        System.out.println("Второй случайный номер массива: ");

        myArray[1] = (int) (Math.random() * 999);
        System.out.println(myArray[1]);
        System.out.println("Третий случайный номер массива: ");

        myArray[2] = (int) (Math.random() * 999);
        System.out.println(myArray[2]);

        int sum = myArray[0] + 2;
        int sum1 = myArray[1] + 2;
        int sum2 = myArray[2] + 2;
        System.out.println("Результат + 2: " + sum);
        System.out.println("Результат + 2: " + sum1);
        System.out.println("Результат + 2: " + sum2);
    }
}
