package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_4_junior.Task_16;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
