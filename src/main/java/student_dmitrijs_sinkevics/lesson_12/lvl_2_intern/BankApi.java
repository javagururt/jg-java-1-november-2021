package student_dmitrijs_sinkevics.lesson_12.lvl_2_intern;

import java.util.Optional;

 interface BankApi {

     Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
