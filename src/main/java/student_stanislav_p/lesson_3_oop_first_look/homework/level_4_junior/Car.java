package student_stanislav_p.lesson_3_oop_first_look.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Car {

        String model;

        Car(String newModel) {
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }

    }

    class CarDemo {

        public static void main(String[] args) {
            Car myCar = new Car("Nissan");
            String carModel = myCar.getModel();
            System.out.println("Car model = " + carModel);
        }

    }
