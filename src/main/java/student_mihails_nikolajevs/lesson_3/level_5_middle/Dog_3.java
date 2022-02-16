package student_mihails_nikolajevs.lesson_3.level_5_middle;
/*
Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Должна быть возможность увеличивать возраст собаки на один.

PS: научите собаку праздновать свой день рождения,
создайте в классе Dog метод:

    void happyBirthday() {
        // напишите тут команду увеличения возраста на 1
    }

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).

Создайте собаку,
заставьте её подать голос,
заставте её отпраздновать день рождение,
заставьте её подать голос снова и убедитесь в том,
что её возраст увеличился на 1.
 */
public class Dog_3 {

    int age = 3;
    int ageIncrease = 0;
    int ageNow = age;

    public Dog_3(){
    }

    void voice(){
        System.out.println("Dog Age are " + ageNow + " !");
        System.out.println("Woof!!! Woof!!!");

        ageIncrease++;
        ageNow = age + ageIncrease;
    }

    void happyBirthday() {
     System.out.println("Happy Birthday, Teddy !!!");
     System.out.println("Today's Age are " + ageNow + " !!!");
    }

}
