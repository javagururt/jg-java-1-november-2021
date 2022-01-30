package student_artyom_shvegzhda.lesson_5_arrays_for_loop.lessoncode;

import teacher.lesson_5_arrays_for_loop.lessoncode.UserLoginInputService;
import teacher.lesson_5_arrays_for_loop.lessoncode.UserLoginService;

class UserLoginDemo {

    public static void main(String[] args) {
        UserLoginInputService inputService = new UserLoginInputService();
        UserLoginService loginService = new UserLoginService();

        String userName = inputService.getUserLogin();
        String expectedUserName = "myUser";

        boolean loginResult = loginService.login(userName, expectedUserName);
    }
}
