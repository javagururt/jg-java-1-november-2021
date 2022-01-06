package student_andrei_karamnov.lesson_5_arrays_for_loop.level_5_middle;
/*Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.*/
class ArrayUtil {
   int arrayLength;

   public int[] createArray(int arrayLength) {
       this.arrayLength = arrayLength;
       int[] array = new int[arrayLength];
       return array;
   }
    public void fillArrayWithRandomNumbers(int[] array) {
       for (int i = 0; i < array.length; i++){
           array[i] = (int)(Math.random() * 999);
       }
        // Напишите реализацию !!!
    }
    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // Напишите реализацию !!!
    }
    public int findMaxNumber(int[] array) {
        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximum){
                maximum = array[i];
        // Напишите реализацию !!!
    }
        }
        return maximum;
    }
    public int findMinNumber(int[] array) {
        int minimum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minimum){
                minimum = array[i];
                // Напишите реализацию !!!
            }
        }
        return minimum;
    }
        // Напишите реализацию !!!

    int[] demoArray() {
        int[] array = new int[]{-4, 2, 7, -6, 9};

        return array;
    }
}
