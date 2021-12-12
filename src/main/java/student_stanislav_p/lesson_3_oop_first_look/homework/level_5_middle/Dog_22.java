package student_stanislav_p.lesson_3_oop_first_look.homework.level_5_middle;

public class Dog_22 {

    String dogColor;

    public void voice() {

        System.out.println("Гав! Гав! Гав! ");
        System.out.println("Dog color - "+ this.dogColor );
    }
    public void changeColor(String newColor){
        this.dogColor = newColor;
        System.out.println("  ");
        System.out.println("New dog color is - " +  newColor + " (don't ask me how i did it) ");
    }

    public Dog_22(String color){

        this.dogColor = color;
    }
}

