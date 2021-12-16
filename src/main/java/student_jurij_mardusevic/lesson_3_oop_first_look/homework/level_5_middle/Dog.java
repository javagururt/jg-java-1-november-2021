package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {

    String dogName;
    String dogVoice;
    String dogColor;
    int dogAge;

    Dog(String dogName, String dogVoice, String dogColor, int dogAge) {
        this.dogName = dogName;
        this.dogVoice = dogVoice;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    String getDogName() {
        return this.dogName;
    }
    String getDogVoice() {
        return this.dogVoice;
    }
    String getDogColor() {
        return this.dogColor;
    }
    int getDogAge() {
        return this.dogAge;
    }

}
