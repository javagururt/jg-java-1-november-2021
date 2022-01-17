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


        int dataBaseCount =  0;

        UserEntity[] currentBase = new UserEntity[dataBaseCount+1];


        currentBase[dataBaseCount]= new UserEntity(0, "Name", "Surname", "Personal Code");


        while (operationType!=7){
            operationType= dataBase.operationTypeChoose();
            doOperationType(operationType,dataBaseCount, currentBase);

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

    private static void doOperationType(int operationType, int dataBaseCount, UserEntity[] currentBase ){

        switch (operationType) {
            case 1: doAddingUser(dataBaseCount, currentBase);
            case 2: doGettingUserByID(dataBaseCount);
            case 3: doGettingUsersByName(dataBaseCount);
            case 4: doGettingAllUsers(dataBaseCount);
            case 5: doUserEditing(dataBaseCount);
            case 6: doDeletingUser(dataBaseCount);

        }
    }

    private static void doAddingUser(int dataBaseCount, UserEntity[] currentBase ){



        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding/saving a new user.");
        System.out.println("Enter ID ->");
        int newID = scanner.nextInt();

        switch (checkNewID(newID,dataBaseCount, currentBase)) {
            case 0:
                System.out.println("This ID is already exist.");
                break;
            case 1:
                System.out.println("Enter ID ->");
                String  newName = scanner.nextLine();


        }

        System.out.println(newID + "  ");

    }

    private static void doGettingUserByID(int dataBaseCount ){}

    private static void doGettingUsersByName(int dataBaseCount ){}

    private static void doGettingAllUsers(int dataBaseCount ){}

    private static void doUserEditing(int dataBaseCount ){}

    private static void doDeletingUser(int dataBaseCount ){}

    //--------------------------------------------------------

    private static int checkNewID(int newID, int dataBaseCount, UserEntity[] currentBase) {


        for (int i = 0; i < dataBaseCount; i++) {

            System.out.println("count - " + i+ " "+ currentBase[dataBaseCount].getUserID() +
                    currentBase[dataBaseCount].getUserName() +
                    currentBase[dataBaseCount].getUserSurname() +
                    currentBase[dataBaseCount].getUserPersonalCode()
            );

            if (currentBase[dataBaseCount].getUserID() == newID) {

                System.out.println("This ID is already exist.");

                return 0;
            }
        }
        return 1;
    };


}
