package student_rolands_gudels.lesson_5_arrays_for_loop.lesson_12_exceptions.level_2_intern;

public class Task_16 {
/*    Маленькое улучшение кода (рефакторинг).

    Как можно упростить это условие?

            credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)

    Данные для этой проверки - это список ролей, который находится
    в классе UserCredentials:

    class UserCredentials {

        private List<Role> roles;  // вот этот список

        // поэтому можно создать в этом классе простой метод
        public boolean hasRole(Role role) {
            return roles.contains(role);
        }

    }

    После этого код

credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)

    можно заменить на

credentials.hasRole(Role.CAN_SEARCH_CLIENTS)

    Маленькое улучшение, но согласитесь, что читать такой код намного приятнее и проще.*/
}
