package student_mihails_nikolajevs.lesson_12_exceptions_.level_2_intern_;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

    // Метод findByUid() должен возвращать ("кидать") ошибку
    // если в переданных credentials нет роли Role.CAN_SEARCH_CLIENTS.
}
