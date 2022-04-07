package student_eduards_puzirevskis.lesson_12_exeptions.level_2_intern;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws AccessDeniedException;

}
