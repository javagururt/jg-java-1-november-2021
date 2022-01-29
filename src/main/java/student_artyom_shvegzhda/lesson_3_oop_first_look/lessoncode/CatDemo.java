package student_artyom_shvegzhda.lesson_3_oop_first_look.lessoncode;

import teacher.lesson_3_oop_first_look.lessoncode.Cat;

import java.util.Scanner;

class CatDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String catName = scanner.nextLine();

        teacher.lesson_3_oop_first_look.lessoncode.Cat myCat = new Cat(catName);
        //Single Responsibility Principle

        int a = 5;
    }
}
