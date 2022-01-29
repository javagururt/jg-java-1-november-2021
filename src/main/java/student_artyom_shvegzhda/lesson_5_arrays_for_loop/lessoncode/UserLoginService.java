package student_artyom_shvegzhda.lesson_5_arrays_for_loop.lessoncode;

class UserLoginService {

    boolean login(String userName, String expectedUserName) {
        if (userName.equals(expectedUserName)) {
            System.out.println("SUCCESS");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }
}
