package teacher.lesson_7_encapsulation.lessoncode;

class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person("Ruslan", 28, 1000);
        Person secondPerson = new Person(person.getName(), 30, 1000);

//        secondPerson.getBonusSalary();

        if (person.equals(secondPerson)) {
            System.out.println(" :) ");
        }

    }
}
