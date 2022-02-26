package teacher.lesson_11_part2.lessoncode;

class Dog implements Animal {

    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void breath() {
        System.out.println("....");
    }

    void bark() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
