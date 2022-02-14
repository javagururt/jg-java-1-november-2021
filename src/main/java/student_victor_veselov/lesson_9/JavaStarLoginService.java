package student_victor_veselov.lesson_9;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface JavaStarLoginService {

    boolean canLogin(String login, String password);
}
