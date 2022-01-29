package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode.students;

import teacher.lesson_8_inheritance.lessoncode.students.JuniorDeveloper;
import teacher.lesson_8_inheritance.lessoncode.students.MiddleDeveloper;
import teacher.lesson_8_inheritance.lessoncode.students.SeniorDeveloper;
import teacher.lesson_8_inheritance.lessoncode.students.Student;

class StudentDemo {

    public static void main(String[] args) {
        teacher.lesson_8_inheritance.lessoncode.students.Student student = new teacher.lesson_8_inheritance.lessoncode.students.Student();
        student.learn();
        System.out.println("==== JUNIOR");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.code();
        juniorDeveloper.learn();
        System.out.println(" =====  MIDDLE");
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.code();
        middleDeveloper.learn();
        middleDeveloper.debug();
        System.out.println("==== SENIOR");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.code();
        seniorDeveloper.learn();
        seniorDeveloper.debug();
        seniorDeveloper.mentoring();
        seniorDeveloper.solveProblem();

        teacher.lesson_8_inheritance.lessoncode.students.Student[] students = {
                student,
                juniorDeveloper,
                middleDeveloper,
                seniorDeveloper
        };

        JuniorDeveloper[] juniorDevelopers = {
                juniorDeveloper,
                middleDeveloper,
                seniorDeveloper
        };

        MiddleDeveloper[] middleDevelopers = {
                middleDeveloper,
                seniorDeveloper
        };

        SeniorDeveloper[] seniorDevelopers = {
                seniorDeveloper
        };

    }
}
