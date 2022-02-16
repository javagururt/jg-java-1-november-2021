package student_mihails_nikolajevs.lesson_3.level_5_middle;
/*
Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Должна быть возможность указывать возраст собаки.
- Возраст указывается в годах (целым числом).
- Возраст собаке дают в момент создания.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки и ее возраст.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */

public class Dog_2 {

    String name;
    int age;

    public Dog_2(String name, int age) {

        this.name = name;
        this.age = age;
    }
        public void voice() {

            System.out.println("Dog name is " + this.name);
            System.out.println("Dog age  " + this.age);


        }
    }

