package teacher.lesson_11_part2.lessoncode;

import java.util.List;

class PersonCriteriaExample {

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Vasya", 25),
                new Person("Vasya", 27),
                new Person("Vasya", 30),
                new Person("Petya", 27)
        );

        SearchCriteria nameSearchCriteria = new PersonNameSearchCriteria("Vasya");
        SearchCriteria ageSearchCriteria = new PersonAgeSearchCriteria(27);

        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (nameSearchCriteria.match(person)) {
                System.out.println("Match! " + person);
            }
        }

        System.out.println("-----------");


        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (ageSearchCriteria.match(person)) {
                System.out.println("Match! " + person);
            }
        }

        System.out.println("--------");

        SearchCriteria nameAndAgeSearchCriteria = new AndSearchCriteria(nameSearchCriteria, ageSearchCriteria);
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (nameAndAgeSearchCriteria.match(person)) {
                System.out.println("Match! " + person);
            }
        }
    }
}
