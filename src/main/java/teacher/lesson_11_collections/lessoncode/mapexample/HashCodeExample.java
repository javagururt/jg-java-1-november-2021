package teacher.lesson_11_collections.lessoncode.mapexample;

class HashCodeExample {

    public static void main(String[] args) {
        Person firstPerson = new Person("Vasya");
        Person secondPerson = new Person("Petya");

        System.out.println(firstPerson.hashCode());
        System.out.println(firstPerson.hashCode());
        System.out.println(secondPerson.hashCode());
        System.out.println(secondPerson.hashCode());
    }
}
