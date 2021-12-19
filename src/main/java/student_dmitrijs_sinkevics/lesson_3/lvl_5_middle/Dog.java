package student_dmitrijs_sinkevics.lesson_3.lvl_5_middle;


public class Dog {
     final String dogName = "Skubi";
     int age=3;
     int birthday = 1;
     private String dogColor;

    public void happyBirthday() {
        age=age + birthday;
    }

     public Dog(String dogColor) {
        this.dogColor=dogColor;
     }

    public String getDogColor() {

        return dogColor;
    }

    public void changeColor(String newColor) {
        dogColor=newColor;
    }


    public void voice () {
        System.out.println(dogName +" "+ dogName +" "+ dogName +"duuu!");
        System.out.println("I am "+age+" years old");
        System.out.println("My color is "+getDogColor());
    }
}
