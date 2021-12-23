package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.task_33;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
