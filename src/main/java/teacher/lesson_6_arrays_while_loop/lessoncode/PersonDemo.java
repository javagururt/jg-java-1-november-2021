package teacher.lesson_6_arrays_while_loop.lessoncode;

class PersonDemo {


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName());
        person.setName("Ruslan");
        System.out.println(person.getName());

        changeName(person);

        System.out.println(person.getName());
    }

    public static void changeName(Person myPerson) {
        myPerson.setName("Viktor");
    }

}
