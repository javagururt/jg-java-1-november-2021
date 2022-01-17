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


import java.util.Scanner;

public class UserEntityRepository {



    public static void main(String[] args) {

        int operationType=0;

        Scanner scanner = new Scanner(System.in);



        UserEntityRepository dataBase = new UserEntityRepository();


        int dataBaseCount =  0;

        UserEntity[] currentBase = new UserEntity[dataBaseCount+1];


        currentBase[dataBaseCount]= new UserEntity(0, "Name", "Surname", "Personal Code");


        System.out.println("count - " + dataBaseCount+ " "+ currentBase[dataBaseCount].getUserID() +
                currentBase[dataBaseCount].getUserName() +
                currentBase[dataBaseCount].getUserSurname() +
                currentBase[dataBaseCount].getUserPersonalCode()
        );

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
            case 4: doGettingAllUsers(dataBaseCount,currentBase);
            case 5: doUserEditing(dataBaseCount);
            case 6: doDeletingUser(dataBaseCount);

        }
    }

    private static void doAddingUser(int dataBaseCount, UserEntity[] currentBase ){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Adding/saving a new user.");
        int newID = enterIntData("Enter ID ->");

        boolean checkResult = checkNewID(newID,dataBaseCount, currentBase);

        System.out.println("check result - "+ checkResult);

        if (!checkResult) {
            System.out.println("This ID is already exist.");
        }
            else{

                String  newName = enterStringData("Enter User Name ->");
                String  newSurname = enterStringData("Enter User Surname ->");
                String  newPersonalCode = enterStringData("Enter User Personal code ->");

                //addNewUser(currentBase,dataBaseCount,newID,newName,newSurname,newPersonalCode);


        }

        System.out.println(newID + "  ");

    }

    private static void doGettingUserByID(int dataBaseCount ){}

    private static void doGettingUsersByName(int dataBaseCount ){}

    private static void doGettingAllUsers(int dataBaseCount, UserEntity[] currentBase){

        System.out.println("Getting all users.");

        for (int i = 0; i < dataBaseCount; i++) {

            System.out.println("count - " + i+ " "+ currentBase[i].getUserID() +
                    currentBase[i].getUserName() +
                    currentBase[i].getUserSurname() +
                    currentBase[i].getUserPersonalCode()
            );
        }
    }

    private static void doUserEditing(int dataBaseCount ){}

    private static void doDeletingUser(int dataBaseCount ){}



    //----------------------------------------------------------------------------------------



    private static boolean checkNewID(int newID, int dataBaseCount, UserEntity[] currentBase) {


        for (int i = 0; i < dataBaseCount; i++) {

            System.out.println("count - " + i+ " "+ currentBase[i].getUserID() +
                    currentBase[i].getUserName() +
                    currentBase[i].getUserSurname() +
                    currentBase[i].getUserPersonalCode()
            );

            if (currentBase[i].getUserID() == newID) {

                System.out.println("This ID is already exist.");

                return false;
            }
        }
        return true;
    };


    private static int enterIntData(String msgText){

        Scanner scanner = new Scanner(System.in);


        System.out.println(msgText);
        return scanner.nextInt();
    }

    private static String  enterStringData(String msgText){

        Scanner scanner = new Scanner(System.in);
        System.out.println(msgText);
        return scanner.nextLine();
    }

    private static  UserEntity[] addNewUser(UserEntity[] currentBase, int countDataBase, int newID, String newName, String newSurname, String newPCode){

        int dataBaseCount = countDataBase+1;

        UserEntity localBase = currentBase[dataBaseCount+1];

        localBase.setUserID(newID);
        localBase.setUserName(newName);
        localBase.setUserSurname(newSurname);
        localBase.setUserPersonalCode(newPCode);

        return new UserEntity[]{localBase};




    }

}
