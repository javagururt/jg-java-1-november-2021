package teacher.lesson_5_arrays_for_loop.lessoncode;

class UserLoginDemo {

    public static void main(String[] args) {
        UserLoginInputService inputService = new UserLoginInputService();
        UserLoginService loginService = new UserLoginService();

        String userName = inputService.getUserLogin();
        String expectedUserName = "myUser";

        boolean loginResult = loginService.login(userName, expectedUserName);
    }
}
