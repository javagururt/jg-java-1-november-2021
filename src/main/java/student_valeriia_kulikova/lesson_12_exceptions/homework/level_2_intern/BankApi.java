package student_valeriia_kulikova.lesson_12_exceptions.homework.level_2_intern;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}
