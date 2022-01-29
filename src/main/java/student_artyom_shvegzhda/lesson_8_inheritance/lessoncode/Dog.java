package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.Animal;

class Dog extends Animal {
    @Override
    void breath() {
        System.out.println("Lungs");
    }
}
