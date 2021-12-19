package student_valeriia_kulikova.Lesson_3.level_7_senior;

class Computer2 {
    String manufacturer;
    String model;

    Computer2 (String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer() {
        return this.manufacturer;
    }
    String getModel() {
        return this.model;
    }
}

class ComputerDemo2 {

    public static void main(String[] args) {
        Computer2 dell = new Computer2 ("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }


}
