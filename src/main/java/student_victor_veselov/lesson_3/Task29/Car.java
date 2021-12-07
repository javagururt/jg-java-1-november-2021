package student_victor_veselov.lesson_3.Task29;

public class Car {
    String name;
    String color;
    int age;
    int speed;
    double acceleratedSpeed =2.5;

    public Car(String name,String color,int age,int speed){
        this.name = name;
        this.color = color;
        this.age = age;
        this.speed = speed;
    }
    public void carInfo(){
        System.out.println("Car name: " +this.name +", Car color: " +this.color +  ", Car age: " +this.age);
    }
}
