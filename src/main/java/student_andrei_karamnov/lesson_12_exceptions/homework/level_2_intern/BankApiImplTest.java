package student_andrei_karamnov.lesson_12_exceptions.homework.level_2_intern;

import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    @CodeReviewComment(comment = "не забывайте указывать generics в arrayList - new ArrayList<>()")
    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<UserCredentials.Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL"); // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch(AccessDeniedException e) {
            System.out.println(e.getMessage());
            System.out.println("TEST OK");
        }

    }
}
