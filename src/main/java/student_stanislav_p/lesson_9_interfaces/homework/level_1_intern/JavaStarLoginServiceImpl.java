package student_stanislav_p.lesson_9_interfaces.homework.level_1_intern;

/*
Дан класс:

class JavaStarLoginServiceImpl {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}

Создать интерфейс для данного класса под названием JavaStarLoginService.
Сделать так, чтобы класс JavaStarLoginServiceImpl имплементировал созданный вами интерфейс.
 */

    class JavaStarLoginServiceImpl implements JavaStarLoginService {

        public boolean canLogin(String login, String password) {
            return (login != null)
                    && login.equals("javastar")
                    && (password != null)
                    && password.equals("pass");
        }


}
