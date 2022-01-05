package student_stanislav_p.lesson_5_arrays_for_loop.homework.level_5_middle;

/*
Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Напишите реализацию !!!
    }

}

----------------------
Task 33

Создайте в классе ArrayUtil метод для
заполнения массива случайными целыми числами.

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
        // Напишите реализацию !!!
    }

}
-------------------------------
Task 34
Создайте в классе ArrayUtil метод для
распечатки массива целых чисел на консоль.

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        // Напишите реализацию !!!
    }

}
----------------------
Task 35

Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMaxNumber(int[] array) {
        // Напишите реализацию !!!
    }

}
------------------------
Task 37

Создайте в классе ArrayUtil метод для
нахождения минимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMinNumber(int[] array) {
        // Напишите реализацию !!!
    }

}
------------------------------


 */



import java.util.Random;

class ArrayUtil {

    int arrayLength;
    int bound;


    public int[] createNewArray(int arrayLength, int bound) {
        this.arrayLength = arrayLength;
        this.bound = bound;

        int[] newArray = new int[arrayLength];

        fillArrayWithRandomNumbers(newArray, bound);
        printArrayToConsole(newArray);

        return newArray;
    }


    public void fillArrayWithRandomNumbers(int[] newArray, int bound) {


        Random random = new Random();
        for (int i = 0; i < arrayLength; i++){
            newArray[i] = random.nextInt(bound);
        }


    }
    public void printArrayToConsole(int[] newArray) {
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Array number № "+ (i+1) + " -> "+newArray[i]);
        }

    }
    public int findMaxNumber(int[] newArray) {
        int maximumOfArray = 0;

        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] > maximumOfArray){
                maximumOfArray = newArray[i];

            }
        }
        return maximumOfArray;
    }
    public int findMinNumber(int[] newArray) {
        int minimumOfArray = 100;
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] < minimumOfArray){
                minimumOfArray = newArray[i];

            }
        }
        return minimumOfArray;
    }



}
