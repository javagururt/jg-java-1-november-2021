package student_andrei_karamnov.lesson_7_encapsulation.homework.level_7_senior;

import teacher.annotations.CodeReview;

/*Создать класс UserEntity с учетом, что вы уже знаете, что такое инкапсюляция.
У класса UserEntity должны быть поля:
  - id
  - имя
  - фамилия
  - персональный код*/
@CodeReview(approved = true)
class UserEntity {
    private long userID;
    private String userName;
    private String userSurname;
    private int userPersonalCode;

    public UserEntity(long userID, String userName, String userSurname, int userPersonalCode) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userPersonalCode = userPersonalCode;
    }

    public long getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public int getUserPersonalCode() {
        return userPersonalCode;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setUserPersonalCode(int userPersonalCode) {
        this.userPersonalCode = userPersonalCode;
    }
}
