package student_mihails_nikolajevs.lesson_8.level_2_intern_;
/*
Как вызвать конструктор родительского класса?

Дополните пример кода создав конструктор в классе Porsche911:


class Car {

    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

class Porsche911 extends Car {

    private int topSpeed;

    // создайте конструктор

}

class Porsche911Demo {

    public static void main(String[] args) {
        // продемонстрируйте создание инстанции класса Porsche911
    }

}
 */
public class Car {

    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

