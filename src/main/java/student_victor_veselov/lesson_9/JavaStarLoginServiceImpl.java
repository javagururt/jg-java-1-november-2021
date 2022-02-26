package student_victor_veselov.lesson_9;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}
