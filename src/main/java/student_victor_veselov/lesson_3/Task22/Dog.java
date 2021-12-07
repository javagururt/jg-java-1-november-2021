package student_victor_veselov.lesson_3.Task22;


public class Dog {
    String color;

    public void voice() {
        System.out.println("Мой цвет "+" " + this.color );
    }
    public void changeColor(String newColor){
        this.color = newColor;
        System.out.println("Я поменял цвет" +  newColor);
    }

    public Dog(String color){
        this.color = color;
    }
}
