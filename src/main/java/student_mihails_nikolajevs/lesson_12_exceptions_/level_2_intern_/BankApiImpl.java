package student_mihails_nikolajevs.lesson_12_exceptions_.level_2_intern_;

import java.util.List;
import java.util.Optional;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "в случае если роль есть ошибку кидать не нужно.")
class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) throws AccessDeniedException {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws AccessDeniedException {
        {
            if (credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
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
}