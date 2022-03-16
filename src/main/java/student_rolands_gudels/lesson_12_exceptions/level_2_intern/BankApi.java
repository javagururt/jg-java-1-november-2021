package student_rolands_gudels.lesson_12_exceptions.level_2_intern;

import java.util.Optional;

    public interface BankApi {
        Optional<BankClient> findByUid(UserCredentials credentials, String uid)
                throws AccessDeniedException;

    }

