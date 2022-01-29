package student_artyom_shvegzhda.lesson_7_encapsulation.lessoncode;

import teacher.lesson_7_encapsulation.lessoncode.Person;

class PersonDemo {

    public static void main(String[] args) {
        teacher.lesson_7_encapsulation.lessoncode.Person person = new teacher.lesson_7_encapsulation.lessoncode.Person("Ruslan", 28, 1000);
        teacher.lesson_7_encapsulation.lessoncode.Person secondPerson = new teacher.lesson_7_encapsulation.lessoncode.Person(person.getName(), 30, 1000);

//        secondPerson.getBonusSalary();

        if (person.equals(secondPerson)) {
            System.out.println(" :) ");
        }

    }
}
