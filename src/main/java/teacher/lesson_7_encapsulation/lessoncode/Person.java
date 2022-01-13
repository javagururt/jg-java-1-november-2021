package teacher.lesson_7_encapsulation.lessoncode;

class Person {

    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBonusPayment() {
        return salary * Math.random();
    }

    public void birthday() {
        age++;
    }
}
