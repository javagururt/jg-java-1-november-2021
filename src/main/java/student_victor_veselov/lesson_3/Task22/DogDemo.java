package student_victor_veselov.lesson_3.Task22;

public class DogDemo {
    public static void main(String[] args) {
        Dog tom = new Dog("Серый");
        tom.voice();
        tom.changeColor("Черный");
        System.out.println();
        tom.voice();
        tom.changeColor("Белый");

    }
}
