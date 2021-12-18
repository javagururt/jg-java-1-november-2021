package student_valeriia_kulikova.Lesson_3.level_5_middle;

public class DogZZ {
    String dogNameZZ;
    int dogAgeZZ;
    String dogColorZZ;


    public DogZZ(String dogName1, int dogAge1, String dogColor1) {
        this.dogNameZZ = dogName1;
        this.dogAgeZZ = dogAge1;
        this.dogColorZZ = dogColor1;
    }

    public void VoiceZZ () {
        System.out.println(this.dogNameZZ);
        System.out.println(this.dogAgeZZ);
        System.out.println(this.dogColorZZ);
    }
    void changeColor(String newColor) {
        this.dogColorZZ = newColor;
        System.out.println("New color is - " + this.dogColorZZ);

    }
}
