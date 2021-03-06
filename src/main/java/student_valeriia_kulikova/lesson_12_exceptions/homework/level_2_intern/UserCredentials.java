package student_valeriia_kulikova.lesson_12_exceptions.homework.level_2_intern;

import java.util.List;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Role можно вынести в отдельный класс-enum")
public class UserCredentials {
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    enum Role {

        CAN_SEARCH_CLIENTS  // эта роль должна быть у клиента, для того
        // что бы он имел возможность делать поиск клиентов
        // в базе данных банка

    }
}
