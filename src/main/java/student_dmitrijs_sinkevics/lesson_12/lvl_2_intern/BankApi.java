package student_dmitrijs_sinkevics.lesson_12.lvl_2_intern;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
