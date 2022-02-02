package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.StringRepository;

class StringRepositoryDemo {

    public static void main(String[] args) {
        teacher.lesson_8_inheritance.lessoncode.StringRepository repository = new teacher.lesson_8_inheritance.lessoncode.StringRepository();
        repository.add("Hello");
        repository.printInformation();
        System.out.println();
        repository.add("World");
        repository.printInformation();
        System.out.println();
        repository.add("!");
        repository.printInformation();

    }
}
