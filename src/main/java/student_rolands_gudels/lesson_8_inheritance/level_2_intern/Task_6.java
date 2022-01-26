package student_rolands_gudels.lesson_8_inheritance.level_2_intern;


   // Как вызвать конструктор родительского класса?

   // Дополните пример кода создав конструктор в классе Porsche911:


   class Car {

        protected int releaseYear;

        public Car(int releaseYear) {
            this.releaseYear = releaseYear;
        }

    }

    class Porsche911 extends Car {

        protected int topSpeed;
    public Porsche911(int topSpeed, int releaseYear){
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
        // создайте конструктор

    }
public class Task_6 {

   // class Porsche911Demo {

        public static void main(String[] args) {
            // продемонстрируйте создание инстанции класса Porsche911
            Porsche911 newCar = new Porsche911(266,1998);
            System.out.println("Top speed "+ newCar.topSpeed + "release year " +newCar.releaseYear);
        }

  //  }
}
