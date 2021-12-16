package student_dima_talanov.lesson_3.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

    private String dogName;
    String dogVoice;

    Dog(String dogName, String dogVoice) {
    this.dogName = dogName;
    this.dogVoice = dogVoice;}


    String getDogName() {return this.dogName;}
    String getDogVoice() {return this.dogVoice;}{
    }
}