package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.UserEntity;

import java.util.Arrays;

class UserRepository {

    private teacher.lesson_8_inheritance.lessoncode.UserEntity[] database = new teacher.lesson_8_inheritance.lessoncode.UserEntity[0];

    public void add(teacher.lesson_8_inheritance.lessoncode.UserEntity str) {
        // database.length == 0  create new DB min size 1
        teacher.lesson_8_inheritance.lessoncode.UserEntity[] newDatabase = new teacher.lesson_8_inheritance.lessoncode.UserEntity[database.length + 1];
        for (int i = 0; i < database.length; i++) {
            newDatabase[i] = database[i];
        }
        newDatabase[database.length] = str;

        database = newDatabase;
    }

    public void printInformation() {
        for (int i = 0; i < database.length; i++) {
            System.out.println(database[i]);
        }
//        System.out.println(Arrays.toString(database));
    }

    public void changeName(int userId, String name) {
        for (int i = 0; i < database.length; i++) {
            if (database[i].getUserID() == userId) {
                teacher.lesson_8_inheritance.lessoncode.UserEntity userEntity = database[i];
                userEntity.setUserName(name);
                return;
            }
        }
    }

    public teacher.lesson_8_inheritance.lessoncode.UserEntity[] getDatabase() {
        return Arrays.copyOf(database, database.length);
    }
}
