package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_7_senior;

import java.util.Arrays;

public class UserEntityTest {
    public static void main(String[] args) {

        UserEntityRepository user = new UserEntityRepository();
        UserEntity [] userArray = user.create();

        userArray = user.addPerson(userArray,"Valeriia","Kulikova",3338901827L);
        userArray = user.addPerson(userArray,"UserName2","UserUser2",3336253631827L);
        userArray = user.addPerson(userArray,"UserName3","UserUser3",8245634564567L);
        userArray = user.addPerson(userArray,"UserName4","UserUser4",4576237631827L);
        userArray = user.addPerson(userArray,"UserName5","UserUser5",54845683631827L);
        userArray = user.addPerson(userArray,"UserName6","UserUser6",14534531631827L);


        System.out.println(Arrays.toString(userArray));

    }
}
