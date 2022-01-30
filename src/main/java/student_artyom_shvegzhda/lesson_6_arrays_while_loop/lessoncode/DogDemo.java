package student_artyom_shvegzhda.lesson_6_arrays_while_loop.lessoncode;

import teacher.lesson_6_arrays_while_loop.lessoncode.Dog;

class DogDemo {

    public static void main(String[] args) {
        teacher.lesson_6_arrays_while_loop.lessoncode.Dog firstDog = new teacher.lesson_6_arrays_while_loop.lessoncode.Dog();
        firstDog.setName("Bobik");
        firstDog.setAge(5);

        teacher.lesson_6_arrays_while_loop.lessoncode.Dog secondDog = new teacher.lesson_6_arrays_while_loop.lessoncode.Dog();
        secondDog.setName("Tuzik");
        secondDog.setAge(10);

        System.out.println("First dog age: " + firstDog.getAge() + " name: " + firstDog.getName());
        System.out.println("Second dog age: " + secondDog.getAge() + " name: " + secondDog.getName());
    }
}
