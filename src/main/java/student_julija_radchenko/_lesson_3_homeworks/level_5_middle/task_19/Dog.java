package student_julija_radchenko._lesson_3_homeworks.level_5_middle.task_19;

public class Dog {
    private String dogName;
    private int dogAge;

    public Dog (String dogName, int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }
    public void voice(){
        System.out.println(dogName + ", " + dogAge + " years");
    }
}
