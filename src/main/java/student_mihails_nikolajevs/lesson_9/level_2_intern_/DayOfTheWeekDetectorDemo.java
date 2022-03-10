package student_mihails_nikolajevs.lesson_9.level_2_intern_;
/*
Создайте класс DayOfTheWeekDetectorDemo.

Цель этой программы:
- запросить у пользователя число;
- с помощью одной из имплементаций интерфейса DayOfTheWeekDetector найти название дня недели;
- вывести на консоль найденное название.

В классе DayOfTheWeekDetectorDemo создайте конструктор класса, который принимает один параметр
типа DayOfTheWeekDetector (интерфейс). Через этот конструктор в класс будет подаваться
имплементация интерфейса, которую программа должна использовать для нахождения названия
дня недели. Сохраните переданную инстанцию DayOfTheWeekDetector в свойство класса для того,
чтобы использовать её в дальнейшем.

В классе DayOfTheWeekDetectorDemo создайте метод void run() в котором реализуйте саму программу.

Теперь при создании экземпляра класса DayOfTheWeekDetectorDemo ему в конструктор можно подать любую
из трёх имплементаций интерфейса.

Создайте в классе DayOfTheWeekDetectorDemo метод main() в котором продемонстрируйте создание и использование
экземпляра класса DayOfTheWeekDetectorDemo с разными алгоритмами нахождения названия дня недели.

Убедитесь, что в не зависимости от того, какая реализация алгоритма используется для определения
названия дня недели, программа DayOfTheWeekDetectorDemo работает одинаково.
 */

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {

        this.detector = detector;
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo detector1;
        detector1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        detector1.run();
        detector1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        detector1.run();
        detector1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArray());
        detector1.run();
    }

    public void run () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Day Number : ");
        int dayNumber = scanner.nextInt();
        String nameOfDay = detector.detectDayName(dayNumber);
        System.out.println("Today is : " + nameOfDay);

    }
}

