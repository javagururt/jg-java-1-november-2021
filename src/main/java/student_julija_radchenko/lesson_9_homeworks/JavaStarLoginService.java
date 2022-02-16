package student_julija_radchenko.lesson_9_homeworks;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface JavaStarLoginService {
    boolean canLogin(String login, String password);
}
