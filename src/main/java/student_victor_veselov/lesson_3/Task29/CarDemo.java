package student_victor_veselov.lesson_3.Task29;

public class CarDemo {
    public static void main(String[] args) {
        Car lambo = new Car("Lamba","Orange",4,300);
        lambo.carInfo();
        System.out.println("Car speed " + lambo.speed);
        System.out.println("AcceleratedSpeed " + lambo.acceleratedSpeed);
    }
}
