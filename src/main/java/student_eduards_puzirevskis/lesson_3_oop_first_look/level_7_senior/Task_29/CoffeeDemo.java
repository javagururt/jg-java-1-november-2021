package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.Task_29;

/*
хотел сделать, чтобы сканировал Does it give energy по ответу Yes or No.
Закоментил эту часть. Не подскажите, что было не так?
Соответственно в классе Coffee в геттере isDoesItGiveEnergy() был только первый вопрос
 */
import java.util.Scanner;

class CoffeeDemo {
    public static void main(String[] args) {
        Coffee yourCoffee = new Coffee();
        yourCoffee.getKindOfCoffee();
        Scanner scanner = new Scanner(System.in);
        yourCoffee.setKindOfCoffee(scanner.nextLine());
        yourCoffee.getCountOfCups();
        yourCoffee.setCountOfCups(scanner.nextInt());
        yourCoffee.isDoesItGiveEnergy();
        /*
        String satisfaction = "Yes";
        String sostojanie = scanner.nextLine();
        if (sostojanie.equals(satisfaction)) {
        } yourCoffee.setDoesItGiveEnergy(true);
        } else {
            yourCoffee.setDoesItGiveEnergy(false);
        }
         */
        int sostojanie = scanner.nextInt();
        if (sostojanie == 1) {
            yourCoffee.setDoesItGiveEnergy(true);
        } else {
            yourCoffee.setDoesItGiveEnergy(false);
        }
        yourCoffee.soWhatDoWeHave();
    }
}
