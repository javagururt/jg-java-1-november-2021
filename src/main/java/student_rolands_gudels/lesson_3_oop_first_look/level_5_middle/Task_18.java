package student_rolands_gudels.lesson_3_oop_first_look.level_5_middle;

import java.util.Scanner;

 class Task_18 {
    static class Dog {
        private String dogName;
        private String dogColor;
        private int dogAgeYears;
        public Dog(String dogName,String dogColor, int dogAgeYears) {this.dogName = dogName;this.dogColor = dogColor ;this.dogAgeYears = dogAgeYears; }
                 void voice() {
                     System.out.println(dogName + " "+ dogColor + " " + dogAgeYears);
                     System.out.println(dogName + " "+ dogColor + " " + dogAgeYears);
                     System.out.println(dogName + " "+ dogColor + " " + dogAgeYears);
                 }

                     void happyBirthday(){
                      System.out.println(dogName+" "+(dogAgeYears+1));
                    }

        void changeColor() {
            System.out.println("Please enter dog's colour");
            Scanner scanner = new Scanner(System.in);
            String dogColor =  scanner.nextLine();
            System.out.println(dogName + " "+ dogColor + " " + (dogAgeYears+1));


        }


    }
}
    /*Тема: создание класса Dog.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- У собаки должна быть кличка.
- Кличку собаке дают в момент создания и потом ее изменить нельзя.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки три раза.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).*/


