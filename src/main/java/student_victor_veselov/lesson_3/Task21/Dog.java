package student_victor_veselov.lesson_3.Task21;

public class Dog {
    String name;
    String color;
    int age;

    public Dog(String dogName,String dogColor,int dogAge){
        this.name = dogName;
        this.color = dogColor;
        this.age = dogAge;
    }
    public void voice(){
        System.out.println("Dog name:" + this.name +"," + " Dog Color:" + this.color +"," + " Dog age: " + this.age+".");
    }

}
