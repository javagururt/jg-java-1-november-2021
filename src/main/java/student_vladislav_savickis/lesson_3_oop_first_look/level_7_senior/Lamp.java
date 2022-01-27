package student_vladislav_savickis.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Lamp {
    boolean lampPower;
    int lampBrightness;
    String lampManufacturer;

    Lamp(boolean power, int brightness, String manufacturer) {
        this.lampPower = power;
        this.lampBrightness = brightness;
        this.lampManufacturer = manufacturer;
    }

    void switchPower(boolean powerSwitch){
        this.lampPower = powerSwitch;
    }

    String lampInfo(){
        return this.lampManufacturer + " " + this.lampBrightness;
    }
}
