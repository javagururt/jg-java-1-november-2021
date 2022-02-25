package student_artyom_shvegzhda.lesson_3_oop_first_look.homework.level_5_middle;

public class Dog_21 {
    String dogName;
    int dogAge;
    String dogColor;

    public Dog_21(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    public void voice(){
        System.out.println(dogAge + " " + dogName + " " + dogColor);
    }
}
