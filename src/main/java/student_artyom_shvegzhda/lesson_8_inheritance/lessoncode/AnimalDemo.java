package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.Animal;
import teacher.lesson_8_inheritance.lessoncode.Dog;
import teacher.lesson_8_inheritance.lessoncode.Fish;
import teacher.lesson_8_inheritance.lessoncode.Worm;

class AnimalDemo {

    public static void main(String[] args) {
        teacher.lesson_8_inheritance.lessoncode.Fish firstAnimal = new teacher.lesson_8_inheritance.lessoncode.Fish();
        teacher.lesson_8_inheritance.lessoncode.Dog secondAnimal = new teacher.lesson_8_inheritance.lessoncode.Dog();
        teacher.lesson_8_inheritance.lessoncode.Worm thirdAnimal = new teacher.lesson_8_inheritance.lessoncode.Worm();

        firstAnimal.breath();
        secondAnimal.breath();
        thirdAnimal.breath();

        teacher.lesson_8_inheritance.lessoncode.Animal[] animals = {
                firstAnimal,
                secondAnimal,
                thirdAnimal
        };

        System.out.println(" === ");
        for (int i = 0; i < animals.length; i++) {
            teacher.lesson_8_inheritance.lessoncode.Animal currentAnimal = animals[i];
            currentAnimal.breath();
        }
    }
}
