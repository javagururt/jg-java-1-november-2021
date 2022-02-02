package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.UserEntity;
import teacher.lesson_8_inheritance.lessoncode.UserRepository;

class UserRepositoryDemo {

    public static void main(String[] args) {
        teacher.lesson_8_inheritance.lessoncode.UserRepository repository = new teacher.lesson_8_inheritance.lessoncode.UserRepository();
        repository.add(new teacher.lesson_8_inheritance.lessoncode.UserEntity(1, "Ruslan", "ruslan", "11"));
        repository.add(new teacher.lesson_8_inheritance.lessoncode.UserEntity(2, "Ruslan", "ruslan", "11"));
        repository.add(new teacher.lesson_8_inheritance.lessoncode.UserEntity(3, "Ruslan", "ruslan", "11"));
        repository.add(new teacher.lesson_8_inheritance.lessoncode.UserEntity(4, "Ruslan", "ruslan", "11"));
        repository.add(new teacher.lesson_8_inheritance.lessoncode.UserEntity(5, "Ruslan", "ruslan", "11"));
        repository.printInformation();
        repository.changeName(2, "Petr");
        System.out.println("=====");
        repository.printInformation();
        teacher.lesson_8_inheritance.lessoncode.UserEntity[] database = repository.getDatabase();
        for (int i = 0; i < database.length; i++) {
            database[i] = null;
        }
        repository.printInformation();
    }

}
