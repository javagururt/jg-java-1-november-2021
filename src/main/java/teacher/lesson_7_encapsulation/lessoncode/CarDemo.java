package teacher.lesson_7_encapsulation.lessoncode;

class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        if (car1.equals(car2)) {
            System.out.println("CAR 1 & CAR 2 are equals");
        }

        if (car1.equals(car3)) {
            System.out.println("CAR 1 & CAR 3 are equals");
        }
    }
}
