package student_mihails_nikolajevs.lesson_3.level_7_senior_;
/*
Дописать код программы, что бы она запускалась
и выводила на консоль производителя и модель компьютера.
Менять можно только класс Computer.

class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

}

class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}

 */
 class Computer {

    String manufacturer;
    String model;

        Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
        String getModel() {
        return this.model;
        }

        String getManufacturer() {
        return this.manufacturer;
        }

}
