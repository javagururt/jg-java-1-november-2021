package student_eduards_puzirevskis.lesson_9_interfaces.level_1_intern;

 class JavaStarLoginServiceImpl implements JavaStarLoginService {

  public boolean canLogin(String login, String password) {
   return (login != null)
           && login.equals("javastar")
           && (password != null)
           && password.equals("pass");
  }
 }
