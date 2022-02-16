package student_mihails_nikolajevs.lesson_3.level_5_middle;
/*
Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Должна быть возможность менять цвет собаки на другой.

PS: создайте в классе Dog метод:

    void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство класса
    }

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).

Создайте собаку,
заставьте её подать голос,
заставьте её поменять цвет,
заставьте её подать голос снова и убедитесь в том,
что собака изменила свой цвет.
 */

public class Dog_5 {

    String color;

    public void voice(){

        System.out.println("Woof! Woof!");
        System.out.println("Dog Color is " + this.color);
    }

    public void changeColor(String newColor) {
      this.color = newColor;

      System.out.println("New Dog Color is " + newColor);
    }
       public Dog_5(String color){
       this.color = color;

    }
}
