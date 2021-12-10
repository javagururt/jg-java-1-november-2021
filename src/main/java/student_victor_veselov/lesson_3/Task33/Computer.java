package student_victor_veselov.lesson_3.Task33;

public class Computer {
    static String manufacturer;
    static String model;

    Computer(String manufacturer, String model) {
        Computer.manufacturer = manufacturer;
        Computer.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
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
