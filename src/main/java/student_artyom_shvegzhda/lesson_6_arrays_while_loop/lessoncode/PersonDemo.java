package student_artyom_shvegzhda.lesson_6_arrays_while_loop.lessoncode;

import teacher.lesson_6_arrays_while_loop.lessoncode.Person;

class PersonDemo {


    public static void main(String[] args) {
        teacher.lesson_6_arrays_while_loop.lessoncode.Person person = new teacher.lesson_6_arrays_while_loop.lessoncode.Person();
        System.out.println(person.getName());
        person.setName("Ruslan");
        System.out.println(person.getName());

        changeName(person);

        System.out.println(person.getName());
    }

    public static void changeName(teacher.lesson_6_arrays_while_loop.lessoncode.Person myPerson) {
        myPerson.setName("Viktor");
    }

}
