package teacher.lesson_8_inheritance.lessoncode.students;

class MiddleDeveloper extends JuniorDeveloper {

    void debug() {
        System.out.println("Debugging");
    }

    @Override
    void code() {
        System.out.println("Coding like a middle dev.");
    }

}
