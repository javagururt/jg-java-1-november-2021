package student_andrei_karamnov.lesson_8_inheritance.level_3_junior;

public class Task_13 {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack", 3, "Husky");
        dog.display();
        System.out.println();
        Cat cat = new Cat("Garfield", 5, "Scottish fold");
        cat.display();
    }
}
abstract class Animal{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract void display();
}
class Dog extends Animal{

    private String species;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.species = breed;
    }

    public void display(){
        System.out.println("Dog name: " + super.getName());
        System.out.println("Dog breed: " + species);
        System.out.println("Dog age: " + super.getAge());
    }
}
class Cat extends Animal {

    private String species;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.species = breed;
    }

    public void display() {
        System.out.println("Cat name: " + super.getName());
        System.out.println("Cat breed: " + species);
        System.out.println("Cat age: " + super.getAge());
    }
}