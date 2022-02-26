package teacher.lesson_11_part2.lessoncode;

import java.util.HashMap;
import java.util.Map;

class PersonMapDemo {

    public static void main(String[] args) {
        Map<Person, Dog> personDogMap = new HashMap<>();
        personDogMap.put(new Person("Ruslan"), new Dog("Bobik"));
        personDogMap.put(new Person("Ruslan"), new Dog("Bobik"));
        personDogMap.put(new Person("Ruslan"), new Dog("Bobik"));
        personDogMap.put(new Person("Ruslan"), new Dog("Bobik"));
        personDogMap.put(new Person("Ruslan"), new Dog("Bobik"));

        System.out.println(personDogMap);

        Dog dog = personDogMap.get(new Person("Ruslan"));
        System.out.println(dog);
    }
}
