package student_andrei_karamnov.lesson_2_variables.level_2_intern;

import java.util.Scanner;

/*Дан код, нужно сделать этот код запускаемым.
Для сдачи работы создайте исправленный класс.

class LoginService {

	public void main(String[] args) {
		System.out.println("You can login!");
	}


}*/
public class LoginService {
    public static void main(String[] args) {
        System.out.println("You can login!");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
    }
}
