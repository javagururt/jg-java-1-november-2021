package student_artyom_shvegzhda.lesson_3_oop_first_look.lessoncode;

import teacher.lesson_3_oop_first_look.lessoncode.Person;

class PersonDemo {

    public static void main(String[] args) {
        teacher.lesson_3_oop_first_look.lessoncode.Person person = new teacher.lesson_3_oop_first_look.lessoncode.Person();
        person.setAge(20);
        person.setName("Vasja");

        int age = person.getAge();
        String name = person.getName();

        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);

    }
}
