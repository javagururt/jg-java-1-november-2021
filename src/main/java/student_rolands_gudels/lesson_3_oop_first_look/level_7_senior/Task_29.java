package student_rolands_gudels.lesson_3_oop_first_look.level_7_senior;

import java.util.Scanner;

class Task_29 {
  /*Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.*/
  static class Computer {
   void turnOn() {
    System.out.println("The computer is turned on");
   }

   void turnOff() {
    System.out.println("The computer is turned off");
   }

   String computerColor = "silver";

   void whatColorIsComputer() {
    System.out.println("The computer color is: " + computerColor);
   }

  }

  static class House {
  void getInfoAboutLocation() {
   String location;
   System.out.println("Enter house location:");
   Scanner scanner = new Scanner(System.in);
   location = scanner.nextLine();
   System.out.println("This house is located in: " +location);

  }
   void getInfoAboutSquare() {
    double square;
    System.out.println("Enter house square in m2:");
    Scanner scanner = new Scanner(System.in);
    square = scanner.nextDouble();
             double x = 80;
    if (square<x) {
        System.out.println("Your house is small: because your house has only "+ square + " m2 small");} else {
        System.out.println("Your house is big: because your house has all " + square + " m2 ");
    }

   }
  }
 }



