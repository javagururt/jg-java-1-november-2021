package student_andrei_karamnov.lesson_12_exceptions.homework.level_2_intern;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role){
        return roles.contains(role);
    }

    enum Role {
        CAN_SEARCH_CLIENTS  // эта роль должна быть у клиента, для того
        // что бы он имел возможность делать поиск клиентов
        // в базе данных банка

    }
}
