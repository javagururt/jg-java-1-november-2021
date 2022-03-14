package student_eduards_puzirevskis.lesson_12_exeptions.level_2_intern;

import java.util.Optional;

interface BankApi {

  Optional<BankClient> findByUid(UserCredentials credentials, String uid)
          throws AccessDeniedException;

}
