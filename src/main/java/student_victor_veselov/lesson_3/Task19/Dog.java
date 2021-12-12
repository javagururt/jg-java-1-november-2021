package student_victor_veselov.lesson_3.Task19;

public class Dog {
    String name;
    int age;

    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println(this.name+this.age);
    }
}
