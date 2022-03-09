package student_rolands_gudels.lesson_5_arrays_for_loop.lesson_12_exceptions.level_2_intern;

public class Task_13 {
/*    Создайте класс BankApiImpl так, что бы он реализовывал интерфейс BankApi:

    class BankApiImpl implements BankApi {

        private List<BankClient> clients;

        public BankApiImpl(List<BankClient> clients) {
            this.clients = clients;
        }

        public Optional<BankClient> findByUid(UserCredentials credentials,
                                              String uid) throws AccessDeniedException {
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

    Создайте класс BankApiImplTest и напишите тесты для метода findByUid().*/
}
