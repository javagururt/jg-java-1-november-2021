package student_jurij_mardusevic.lesson_9_interfaces.homework.level_1_intern.Task_1;

class JavaStarLoginServiceImpl {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}
