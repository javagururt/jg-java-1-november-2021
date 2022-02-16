package student_mihails_nikolajevs.lesson_3.level_5_middle;
/*Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Сделайте возможность указывать цвет собаки.
- Пусть цвет задаётся просто строкой: "Red", "Black", etc.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки, ее возраст и цвет.

PS: добавьте свойство color в класс Dog,
добавьте в конструктор класса новое свойство и сохраните его,
дополните метод voice() выводом цвета на консоль.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
*/

public class Dog_4 {

    String name;
    int age;
    String color;

    public Dog_4(String name,String color,int age){

        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void voice() {

        System.out.println("Dog Name is " + this.name);
        System.out.println("Dog Color is " + this.color);
        System.out.println("Dog Age are " + this.age);

    }
}
