package student_rolands_gudels.lesson_12_exceptions.level_2_intern;

import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}

