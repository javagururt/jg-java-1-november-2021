package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode.students;

import teacher.lesson_8_inheritance.lessoncode.students.JuniorDeveloper;

class MiddleDeveloper extends teacher.lesson_8_inheritance.lessoncode.students.JuniorDeveloper {

    void debug() {
        System.out.println("Debugging");
    }

    @Override
    void code() {
        System.out.println("Coding like a middle dev.");
    }

}
