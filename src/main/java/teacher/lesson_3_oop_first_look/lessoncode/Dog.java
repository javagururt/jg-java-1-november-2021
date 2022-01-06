package teacher.lesson_3_oop_first_look.lessoncode;

public class Dog {

    String name; // null
    int age; //0
    boolean hungry; // false

    //---------------------------
    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age, boolean hungry) {
        this.name = name;
        this.age = age;
        this.hungry = hungry;
    }

    //---------------------------
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return hungry;
    }

}
