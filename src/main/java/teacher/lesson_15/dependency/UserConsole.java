package teacher.lesson_15.dependency;

import java.util.Scanner;

class UserConsole implements UserDataRetrieveService {

    @Override
    public String retrieveTitle() {
        System.out.println("Please enter todo title:");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        return title;
    }
}
