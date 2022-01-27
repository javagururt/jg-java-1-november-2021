package student_vladislav_savickis.lesson_3_oop_first_look.level_5_middle;

class Dog {
    String name;
    int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor){
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    String voice(){
        return this.name/* + " " + this.age + " " + this.color*/;
    }

    void happyBirthday() {
        System.out.println("Happy Birthday!");
        age = age + 1;
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
}
