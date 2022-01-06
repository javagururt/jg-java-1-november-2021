package student_andrei_karamnov.lesson_4_if_statement.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetector {
    public String detect(int wavelength) {
    if (wavelength >= 360 && wavelength <=449){
        return "Violet";
    }else if (wavelength >= 450 && wavelength <= 494){
        return "Blue";
    }else if (wavelength >= 495 && wavelength <= 569){
        return "Green";
    }else if (wavelength >= 570 && wavelength <= 589){
        return "Yellow";
    }else if (wavelength >= 590 && wavelength <= 619){
        return "Orange";
    }else if (wavelength >= 620 && wavelength <= 750){
        return "Red";
    }
        return "Invisible light";
    }
}
