package student_mihails_nikolajevs.lesson_9.level_1_intern_;
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

// Создал класс JavaStarLoginServiceImp . Так как пересекался с package_student_veselov !!!



class JavaStarLoginServiceImp implements JavaStarLoginServiceI {
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}
