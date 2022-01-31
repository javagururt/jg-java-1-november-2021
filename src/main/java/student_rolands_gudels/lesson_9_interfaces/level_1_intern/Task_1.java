package student_rolands_gudels.lesson_9_interfaces.level_1_intern;

public class Task_1 {

    class JavaStarLoginServiceImpl implements JavaStarLoginService {

        public boolean canLogin(String login, String password) {
            return (login != null)
                    && login.equals("javastar")
                    && (password != null)
                    && password.equals("pass");
        }

    }

 /*    Создать интерфейс для данного класса под названием JavaStarLoginService.
    Сделать так, чтобы класс JavaStarLoginServiceImpl имплементировал созданный вами интерфейс.*/
}
