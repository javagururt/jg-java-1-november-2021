package student_andrei_karamnov.lesson_12_exceptions.homework.level_2_intern;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
