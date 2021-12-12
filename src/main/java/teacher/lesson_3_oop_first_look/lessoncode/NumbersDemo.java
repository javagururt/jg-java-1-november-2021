package teacher.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

class NumbersDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int a = 5;

        System.out.println("My name is - " + name);
        int result = 10 * a;
        System.out.println(result);
    }
}
