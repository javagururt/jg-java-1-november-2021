package student_jurij_mardusevic.lesson_3.level_1_intern.Task_16;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
