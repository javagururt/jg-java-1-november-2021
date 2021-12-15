package student_andrei_karamnov.lesson_3_oop_first_look.level_7_senior;

class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer(){
        return this.manufacturer;
    }
    String getModel(){
        return this.model;
    }
}
