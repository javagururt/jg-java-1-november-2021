package student_stanislav_p.lesson_12_exceptions.homework.level_2_intern;

import java.util.Collection;
import java.util.List;

public class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    // создайте конструктор класса, в котором вы получаете список ролей

    // создайте get() метод для свойства

}

enum Role {

    CAN_SEARCH_CLIENTS  // эта роль должна быть у клиента, для того
    // что бы он имел возможность делать поиск клиентов
    // в базе данных банка

}
