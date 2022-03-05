package student_andrei_karamnov.lesson_12_exceptions.homework.level_2_intern;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
