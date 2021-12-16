package teacher.lesson_3_oop_first_look.lessoncode;

class Person {

    private String name;
    private int age;

    public void printInformation() {
        System.out.println("Person info: ");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
