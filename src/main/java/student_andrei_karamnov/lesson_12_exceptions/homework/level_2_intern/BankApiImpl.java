package student_andrei_karamnov.lesson_12_exceptions.homework.level_2_intern;

import java.util.List;
import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (!credentials.hasRole(UserCredentials.Role.CAN_SEARCH_CLIENTS)){
            throw new AccessDeniedException("Access denied!");
        }
        for (BankClient client : clients){
            if(uid.equals(client.getUid())){
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
