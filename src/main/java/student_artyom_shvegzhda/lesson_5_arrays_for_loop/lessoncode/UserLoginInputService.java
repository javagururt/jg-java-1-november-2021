package student_artyom_shvegzhda.lesson_5_arrays_for_loop.lessoncode;

import java.util.Scanner;

class UserLoginInputService {

    String getUserLogin() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
