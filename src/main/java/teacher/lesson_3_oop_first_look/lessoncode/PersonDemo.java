package teacher.lesson_3_oop_first_look.lessoncode;

class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        person.setName("Vasja");

        int age = person.getAge();
        String name = person.getName();

        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);

    }
}
