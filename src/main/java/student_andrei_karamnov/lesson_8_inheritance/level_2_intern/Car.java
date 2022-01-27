package student_andrei_karamnov.lesson_8_inheritance.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {

    protected int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}

class Porsche911 extends Car {

    protected int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}

class Task_6 {

        public static void main(String[] args) {
            Porsche911 porsche911 = new Porsche911(2021, 330);
            System.out.println("Release year: " + porsche911.releaseYear);
            System.out.println("Top speed: " + porsche911.topSpeed);
        }

    }

