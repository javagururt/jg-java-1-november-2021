package student_eduards_puzirevskis.lesson_3_oop_first_look.level_5_middle;

import java.util.Scanner;

class Dog {
   public String name;
   public int age;
   public int dogNewAge;
   public String color;
   private String newColor;


    public Dog(String dogName){

        this.name = dogName;

    }

   public Dog(String dogName, int dogAge){

       this.name = dogName;
       this.age = dogAge;

   }

    public Dog(String dogName, int dogAge, String color){

        this.name = dogName;
        this.age = dogAge;
        this.color = color;

    }

 public void voice() {
       System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
   }
    public void voiceWithNameAndAge() {
        System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
        System.out.println("Dog's name is : " + this.name);
        System.out.println("Dog's age is : " + this.age);
    }

    public int happyBirthday() {
       this.dogNewAge = (age + 1);
        System.out.println("Oh, look's like "+ this.name + " had a Birthday!!!");
       return dogNewAge;

    }
    public void voiceWithNameAndNewAge() {
        System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
        System.out.println("Dog's name is : " + this.name);
        System.out.println("Dog's age is : " + this.dogNewAge);
    }
    public void voiceWithNameAgeColor() {
        System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
        System.out.println("Dog's name is : " + this.name);
        System.out.println("Dog's age is : " + this.age);
        System.out.println("Dog's color is : " + this.color);
    }


    public void changeColor() {
        System.out.println("Look's like " + this.name + " is not a dog, but a chameleon");
        System.out.println("What color should he repaint?");
        Scanner scan = new Scanner(System.in);
        String newColor = scan.nextLine();

        this.color = newColor;


    }

}
