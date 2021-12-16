package student_jurij_mardusevic.lesson_3.level_1_intern.Task_18;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

    String dogName;
    String dogVoice;
    int dogAge;

    Dog(String dogName, String dogVoice, int dogAge) {
        this.dogName = dogName;
        this.dogVoice = dogVoice;
        this.dogAge = dogAge;
    }

    String getDogName() {
        return this.dogName;
    }
    String getDogVoice() {
        return this.dogVoice;
    }
    int getDogAge() {
        return this.dogAge;
    }

}
