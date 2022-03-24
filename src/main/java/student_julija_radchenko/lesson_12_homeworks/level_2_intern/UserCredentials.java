package student_julija_radchenko.lesson_12_homeworks.level_2_intern;

import java.util.List;

public class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles){

        this.roles = roles;
    }
    public List<Role>getRoles(){
        return roles;
    }
    public boolean hasRole(Role role) {
        return roles.contains(role);}
    }
