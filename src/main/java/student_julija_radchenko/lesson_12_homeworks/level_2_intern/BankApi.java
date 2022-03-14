package student_julija_radchenko.lesson_12_homeworks.level_2_intern;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
