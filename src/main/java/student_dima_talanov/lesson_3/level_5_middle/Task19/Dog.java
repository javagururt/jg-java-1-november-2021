package student_dima_talanov.lesson_3.level_5_middle.Task19;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

    String dogVoice;
    int dogAge;

    Dog(String dogVoice, int dogAge) {
        this.dogVoice = dogVoice;
        this.dogAge = dogAge;}

    String getDogVoice() {return this.dogVoice;}
    int getDogAge() {return this.dogAge;} {
    }
}