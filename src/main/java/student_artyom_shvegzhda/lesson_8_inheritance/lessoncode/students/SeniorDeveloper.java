package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode.students;

import teacher.lesson_8_inheritance.lessoncode.students.MiddleDeveloper;

class SeniorDeveloper extends teacher.lesson_8_inheritance.lessoncode.students.MiddleDeveloper {

    void mentoring() {
        System.out.println("Mentoring");
    }

    void solveProblem() {
        System.out.println("Problem solver");
    }

    @Override
    void code() {
        System.out.println("Simple coding");
    }

    @Override
    void learn() {
        System.out.println("Fast learning");
    }
}
