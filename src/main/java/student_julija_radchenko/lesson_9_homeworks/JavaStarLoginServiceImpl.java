package student_julija_radchenko.lesson_9_homeworks;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {
    public boolean canLogin(String login, String password) {

        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
