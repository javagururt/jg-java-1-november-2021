package student_rolands_gudels.lesson_5_arrays_for_loop.lesson_12_exceptions.level_2_intern;

public class Task_14 {
/*    Как правильно тестировать код, который может выкинуть ошибку?

    class BankApiImplTest {

        public static void main(String[] args) {
            BankApiImplTest test = new BankApiImplTest();
            test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
        }

        public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
            List<BankClient> clients = new ArrayList();
            BankApi api = new BankApi(clients);

            List<Role> roles = new ArrayList();
            UserCredentials credentials = new UserCredentials(roles);

            try {
                api.findByUid(credentials, "1234");
                System.out.println("TEST FAIL"); // потому что если мы дошли до этой строки,
                // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
                // так как в credentials нет нужной роли
            } catch(AccessDeniedException e) {
                System.out.println("TEST OK");
            }

        }

    }*/
}
