package teacher.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

class CatDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String catName = scanner.nextLine();

        Cat myCat = new Cat(catName);
        //Single Responsibility Principle

        int a = 5;
    }
}
