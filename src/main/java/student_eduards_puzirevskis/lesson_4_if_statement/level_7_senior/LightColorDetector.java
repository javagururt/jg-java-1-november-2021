package student_eduards_puzirevskis.lesson_4_if_statement.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetector {
    public int wavelength;

    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength < 450) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength < 495) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength < 570) {
            return "Green";
        } else if (wavelength >= 570 && wavelength < 590) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength < 620) {
            return "Orange";
        } else if (wavelength>= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}
