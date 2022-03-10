package student_mihails_nikolajevs.lesson_6.level_3_junior_;
/*
  boolean contains(int[] arr, int numberToSearch)

contains - этот глагол часто применяется для проверки есть ли в массиве
           или коллекции данных указанное значение, поэтому мы выбрали
           именно его;
int[] arr - в метод надо передать сам массив в котором будет
            осуществляться поиск;
int numberToSearch - так же входным параметром будет само число,
                     которое надо найти в массиве;
boolean - тип возвращаемого значения:
          true - когда число найдено в массиве,
          false - когда число не найдено в массиве.


Создайте указанный метод в классе ArrayService и напишите
его реализацию.
 */
import java.util.Arrays;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch)
                return true;
        }
            return false;
    }
    /*
     int countOccurrences(int[] arr, int numberToSearch)

countOccurrences - посчитать вхождения, в названии метода
                   используем глагол для указания того
                   действия, которое выполняет этот метод;
int[] arr - в метод надо передать сам массив в котором будет
            осуществляться поиск;
int numberToSearch - так же входным параметром будет само число,
                     для которого нужно посчитать вхождения;
int - тип возвращаемого значения, потому что количество вхождений
      это целое число.
     */

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == numberToSearch)
                count++;
        }
        return count;
    }

/*
  boolean replaceFirst(int[] arr, int numberToReplace, int newNumber)

replaceFirst - замена первого вхождения, в названии метода
                   используем глагол для указания того
                   действия, которое выполняет этот метод;
int[] arr - в метод надо передать сам массив в котором будет
            осуществляться поиск;
int numberToReplace - так же входным параметром будет само число,
                      первое вхождение которого нужно заменить на другое число;
int newNumber - так же входным параметром будет число,
                на которое надо заменить первое вхождение numberToReplace;
boolean - тип возвращаемого значения
            true - если метод нашёл и заменил numberToReplace на newNumber,
            false - если метод не нашёл и не заменил numberToReplace на newNumber.
 */
      boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
          for (int i = 0; i < arr.length; i++) {
              if (arr[i] == numberToReplace) {
                  arr[i] = newNumber;
                  return true;
              }
          }
                  return false;
      }

/*
 int replaceAll(int[] arr, int numberToReplace, int newNumber)

replaceFirst - замена первого вхождения, в названии метода
                   используем глагол для указания того
                   действия, которое выполняет этот метод;
int[] arr - в метод надо передать сам массив в котором будет осуществляться поиск;
int numberToReplace - так же входным параметром будет само число,
                      первое вхождение которого нужно заменить на другое число;
int newNumber - так же входным параметром будет число,
                на которое надо заменить первое вхождение numberToReplace;
int - тип возвращаемого значения, число произведённых замен в массиве.
 */

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count ++;
            }
        }
            return count;
    }

/*
   void revert(int[] arr)

revert - повернуть назад, в названии метода
                   используем глагол для указания того
                   действия, которое выполняет этот метод;
int[] arr - в метод надо передать сам массив в котором будет осуществляться поиск;
void - тип возвращаемого значения, у данного метода не будет
       возвращаемого значения так как он не создаёт новый массив,
       а меняет местами данные в массиве, который был передан в метод
       в качестве входного параметра. Ссылка на этот массив уже есть
       у того, кто будет вызывать этот метод, поэтому возвращать
       ее из метода не имеет смысла.
 */


    void revert(int[] arr) {
         for (int i = 0; i < arr.length / 2; i++) {
             int reverseNumber = arr[i];
             arr[i] = arr[arr.length - i - 1];
             arr[arr.length - i - 1] = reverseNumber;
         }
    }

 /*
    void sort(int[] arr)

sort - сортировка, в названии метода
                   используем глагол для указания того
                   действия, которое выполняет этот метод;
int[] arr - в метод надо передать сам массив в котором будет осуществляться поиск;
void - тип возвращаемого значения, у данного метода не будет
       возвращаемого значения так как он не создаёт новый массив,
       а меняет местами данные в массиве, который был передан в метод
       в качестве входного параметра. Ссылка на этот массив уже есть
       у того, кто будет вызывать этот метод, поэтому возвращать
       ее из метода не имеет смысла.
  */

    void sort(int[] arr) {
        Arrays.sort(arr);
    }

}