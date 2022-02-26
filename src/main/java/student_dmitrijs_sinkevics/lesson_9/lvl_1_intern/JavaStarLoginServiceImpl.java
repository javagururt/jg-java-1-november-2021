package student_dmitrijs_sinkevics.lesson_9.lvl_1_intern;

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
