package student_stanislav_p.lesson_12_exceptions.homework.level_2_intern;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
