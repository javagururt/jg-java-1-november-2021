package student_dmitrijs_sinkevics.lesson_3.lvl_4_junior;

import teacher.annotations.CodeReview;

/*Найти ошибку в коде.
        Исправить и запустить программу.
        Менять можно только класс Car.

 */
@CodeReview(approved = true)
class Car {

    private String model;

    Car(String model) {
        this.model = model;
    }

    public String getModel () {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
