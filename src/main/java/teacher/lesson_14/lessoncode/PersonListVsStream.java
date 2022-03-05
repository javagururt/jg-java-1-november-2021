package teacher.lesson_14.lessoncode;

import java.util.List;
import java.util.Optional;

class PersonListVsStream {

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Ruslan", 25),
                new Person("Viktor", 25),
                new Person("Dmitrij", 20),
                new Person("Vasilij", 30),
                new Person("Ruslan", 25),
                new Person("Viktor", 25),
                new Person("Petr", 27)
        );

        personList.stream()
                .map(person -> person.getName())
                //String (name)
                .distinct()
                //uq string
                .map(name -> name.toUpperCase())
                //UPPER CASE
                .forEach(name -> System.out.println(name));

        personList.stream()
                .distinct()
                .forEach(person -> System.out.println(person));

        Optional<Person> optionalPerson = personList.stream()
                .filter(person -> person.getAge().equals(45))
                .findFirst();

        optionalPerson.ifPresent(person -> {
            System.out.println("Person found!");
            System.out.println(person);
        });
    }

}
