package teacher.lesson_6_arrays_while_loop.lessoncode;

class DogDemo {

    public static void main(String[] args) {
        Dog firstDog = new Dog();
        firstDog.setName("Bobik");
        firstDog.setAge(5);

        Dog secondDog = new Dog();
        secondDog.setName("Tuzik");
        secondDog.setAge(10);

        System.out.println("First dog age: " + firstDog.getAge() + " name: " + firstDog.getName());
        System.out.println("Second dog age: " + secondDog.getAge() + " name: " + secondDog.getName());
    }
}
