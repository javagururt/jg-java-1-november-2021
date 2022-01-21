package student_stanislav_p.lesson_8_inheritance.homework.level_2_intern;

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

class Car {

    protected int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

class Porsche911 extends Car {

    protected  int topSpeed;

    // создайте конструктор
    public Porsche911( int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }


}


public class Task6{



   // class Porsche911Demo {

        public static void main(String[] args) {
            // продемонстрируйте создание инстанции класса Porsche911

            Porsche911 newCar = new Porsche911(2018, 320);
            System.out.println("Release Year ->" + newCar.releaseYear);
            System.out.println("Top Speed ->" + newCar.topSpeed);

        }

   // }
}
