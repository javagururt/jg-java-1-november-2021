package student_eduards_puzirevskis.lesson_12_exeptions.level_2_intern;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BankApiImplTest {

    @Test
    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

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
}