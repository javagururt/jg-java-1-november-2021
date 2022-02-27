package teacher.lesson_12_exceptions.lessoncode;

import java.util.HashSet;
import java.util.Set;

class HashCodeExamples {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person(1, "Vasja", 30));
        personSet.add(new Person(2, "Petya", 30));
        personSet.add(new Person(3, "Vasja", 30));
        personSet.add(new Person(4, "Vasja", 30));
        personSet.add(new Person(5, "Vasja", 30));

        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
