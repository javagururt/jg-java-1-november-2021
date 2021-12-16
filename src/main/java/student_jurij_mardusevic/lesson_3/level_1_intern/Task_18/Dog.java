package student_jurij_mardusevic.lesson_3.level_1_intern.Task_18;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

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
