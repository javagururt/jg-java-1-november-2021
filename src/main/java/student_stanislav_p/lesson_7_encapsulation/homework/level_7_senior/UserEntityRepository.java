package student_stanislav_p.lesson_7_encapsulation.homework.level_7_senior;

/*

Создайте класс репозиторий для работы с UserEntity
Функциональные требования:
  - сохранение пользователя
  - получение пользователя по id
  - получение пользователей по имени
  - получение всех пользователей

Дополнительное задание 1:
  - редактирование пользователя
  - удаление пользователя

Примечание:
  Пользователи должны быть уникальными по персональному коду
  У каждого пользователя есть уникальный идентификатор - id
 */


import java.util.Arrays;
import java.util.Scanner;

public class UserEntityRepository {



    public static void main(String[] args) {

        int operationType=0;

        Scanner scanner = new Scanner(System.in);



        UserEntityRepository dataBase = new UserEntityRepository();


        UserEntity currentBase[] = new UserEntity[1];

        currentBase[0]= new UserEntity("ID1", "Name1", "Surname1", "Personal Code1");


        while (operationType!=7){
            operationType= dataBase.operationTypeChoose();
            doOperationType(operationType);

        }

    }

    //----------------------------------------------------------------------------



    int operationTypeChoose () {

        Scanner scanner = new Scanner(System.in);

        int choose;
        System.out.println("Menu for working with data: ");
        System.out.println("1 - adding/saving a user ");
        System.out.println("2 - getting user by id ");
        System.out.println("3 - getting users by name ");
        System.out.println("4 - getting all users ");
        System.out.println("5 - user editing ");
        System.out.println("6 - deleting a user ");
        System.out.println("7 - exit ");

        do {
            System.out.println("Please enter ->");
            while (!scanner.hasNextInt()) {
                System.out.println("That's a wrong number!");
                scanner.next(); // this is important!
            }

            choose = scanner.nextInt();

            if ((choose <=0)||(choose>7)) System.out.println("That's a wrong number!");

        } while ((choose <= 0)||(choose>7));

        System.out.println("Thank you! Your choose is -  " + choose);

        return choose;

    }

    // ------------------------------------------------

    private static void doOperationType(int operationType){

        switch (operationType) {
            case 1: doAddingUser();
            case 2: doGettingUserByID();
            case 3: doGettingUsersByName();
            case 4: doGettingAllUsers();
            case 5: doUserEditing();
            case 6: doDeletingUser();

        }
    }

    private static void doAddingUser(){}

    private static void doGettingUserByID(){}

    private static void doGettingUsersByName(){}

    private static void doGettingAllUsers(){}

    private static void doUserEditing(){}

    private static void doDeletingUser(){}


}
