package student_valeriia_kulikova.Lesson_3.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogZ {
    String dogNameZ;
    int dogAgeZ;

    public DogZ (String dogName1, int dogAge1) {
        this.dogNameZ = dogName1;
        this.dogAgeZ = dogAge1;
    }

    public void VoiceZ () {
        System.out.println(this.dogNameZ);
        System.out.println(this.dogAgeZ);
    }

    public void HappyBirthday () {
        System.out.println("Dog's age - " + this.dogAgeZ);
        System.out.println("Happy Birthday, " + this.dogNameZ +"!");
        this.dogAgeZ++;
        System.out.println("Now age is - " + this.dogAgeZ);
    }
}
