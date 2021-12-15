package student_andrei_karamnov.lesson_3_oop_first_look.level_5_middle;

class Dog {
    String name;
    int age;
    int birthday;
    String color;

    public Dog(String dogName, String dogColor){
    this.name = dogName;
    this.age = 4;
    this.color = dogColor;

    }
    void dogVoice(){
        System.out.println(this.name + this.name + this.name);}
    void dogVoice2(){
        System.out.println(this.name + this.age);
    }
    void happyBirthday(){
        this.birthday = this.age + 1;
    }
    void dogVoice3(){
        System.out.println(this.name + this.age + this.color);
    }
    void changeColor(String newColor){
        this.color = newColor;
        System.out.println(this.name + this.color);
    }
}
