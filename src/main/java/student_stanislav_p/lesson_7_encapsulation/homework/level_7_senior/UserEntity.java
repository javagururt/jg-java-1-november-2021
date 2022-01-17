package student_stanislav_p.lesson_7_encapsulation.homework.level_7_senior;

/*
Создать класс UserEntity с учетом, что вы уже знаете, что такое инкапсюляция.
У класса UserEntity должны быть поля:
  - id
  - имя
  - фамилия
  - персональный код


 */

class UserEntity {

    private String  userID = "";
    private String  userName = "";
    private String  userSurname = "";
    private String  userPersonalCode = "";



    public UserEntity(String userID, String userName, String userSurname, String userPersonalCode) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userPersonalCode = userPersonalCode;
    }


    public  String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public   String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public   String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public   String getUserPersonalCode() {
        return userPersonalCode;
    }

    public void setUserPersonalCode(String userPersonalCode) {
        this.userPersonalCode = userPersonalCode;
    }

}
