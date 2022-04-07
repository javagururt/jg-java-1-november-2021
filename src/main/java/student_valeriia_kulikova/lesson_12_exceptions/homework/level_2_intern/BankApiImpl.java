package student_valeriia_kulikova.lesson_12_exceptions.homework.level_2_intern;

import java.util.List;
import java.util.Optional;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Обратите внимание, что в логике метода `findByUid` вы указали, что в случает если" +
        "роль CAN_SEARCH_CLIENTS есть, то кидаете ошибку. Это баг. Нужно кидать ошибку в случае, если такой роли у клиента нет. ")
public class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (credentials.getRoles().contains(UserCredentials.Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
