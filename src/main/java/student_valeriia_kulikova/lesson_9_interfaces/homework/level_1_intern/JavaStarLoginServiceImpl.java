package student_valeriia_kulikova.lesson_9_interfaces.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class JavaStarLoginServiceImpl implements JavaStarLoginService {
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
