package student_eduards_puzirevskis.lesson_3_oop_first_look.level_5_middle;

class Dog {
   public String name;
   public int age;
   public int dogNewAge;
   public String color;

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

 public void voice1() {
       System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
   }
    public void voice2() {
        System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
        System.out.println("Dog's name is : " + this.name);
        System.out.println("Dog's age is : " + this.age);
    }

    public int happyBirthday() {
       this.dogNewAge = (age + 1);
       return dogNewAge;

    }
    public void voice3() {
        System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
        System.out.println("Dog's name is : " + this.name);
        System.out.println("Dog's age is : " + this.dogNewAge);
    }
    public void voice4() {
        System.out.println(this.name+ " ! " + this.name + " ! " + this.name + " ! ");
        System.out.println("Dog's name is : " + this.name);
        System.out.println("Dog's age is : " + this.age);
        System.out.println("Dog's color is : " + this.color);
    }


    public void changeColor(String newColor) {
        this.color = newColor;
    }

}
