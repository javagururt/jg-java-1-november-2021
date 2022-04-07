package student_mihails_nikolajevs.lesson_12_exceptions_.level_2_intern_;

import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class UserCredentials {

    private List<Role> roles;

    // создайте конструктор класса, в котором вы получаете список ролей
    // создайте get() метод для свойства

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles(){
        return roles;
    }

    public boolean hasRole(Role role){
        return roles.contains(role);
    }
}
