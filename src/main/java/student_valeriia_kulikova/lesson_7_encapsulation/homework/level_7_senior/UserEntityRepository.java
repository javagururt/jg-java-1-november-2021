package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_7_senior;

import java.sql.SQLOutput;
import java.util.Arrays;

public class UserEntityRepository {

    public UserEntity [] create () {

        UserEntity[] userArray = new UserEntity[0];

        return userArray;
    }

    public UserEntity [] addPerson (UserEntity [] userArray, String userName, String userSurname, long userPersonalCode) {
        UserEntity [] newArray = new UserEntity[userArray.length+1];

        copyOldArrayToNewArray(userArray,newArray);

        newArray [newArray.length-1] = new UserEntity();

        newArray [newArray.length-1].setName(userName);
        newArray [newArray.length-1].setSurname(userSurname);
        newArray [newArray.length-1].setPersonalID(userPersonalCode);
        newArray [newArray.length-1].setId(newArray.length);

        return newArray;
    }

    public void  copyOldArrayToNewArray(UserEntity[] oldarray,UserEntity [] newarray) {

        for (int i = 0; i < oldarray.length; i++) {
            newarray[i] = oldarray[i];

        }
    }
}
