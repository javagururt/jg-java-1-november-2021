//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наибольшее число в массиве и выведети его на консоль.

package student_dima_talanov.lesson_5.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 public class Task27 {

     public static void main(String[] args) {
         int [] myArray = new int[10];
         System.out.println("Array number is: ");
         for (int i = 0; i < myArray.length; i++) {
             myArray[i] = (int) (Math.random() * 30);
             System.out.print(myArray[i] + ", ");
         }
         int maxNumber = 0;
         for (int i = 0; i < myArray.length; i++) {
             if (myArray[i] > maxNumber)
                 maxNumber = myArray[i];
         }
         System.out.println("");
         System.out.println("");
         System.out.print("Max array number is: " + maxNumber);
     }
 }


