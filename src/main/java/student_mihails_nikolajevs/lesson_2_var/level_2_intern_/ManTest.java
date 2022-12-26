package student_mihails_nikolajevs.lesson_2_var.level_2_intern_;

public class ManTest {

    public static void main(String[] args) {

        Man man = new Man();
        man.setName("Mihails Nikolajevs.");
        man.setAge(48);

        String manName = man.getName();
        int manAge = man.getAge();

        System.out.println("His name is " + manName);
        System.out.println("He is " + manAge + " years old. ");

    }
}
