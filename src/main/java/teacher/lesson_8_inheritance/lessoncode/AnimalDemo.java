package teacher.lesson_8_inheritance.lessoncode;

class AnimalDemo {

    public static void main(String[] args) {
        Fish firstAnimal = new Fish();
        Dog secondAnimal = new Dog();
        Worm thirdAnimal = new Worm();

        firstAnimal.breath();
        secondAnimal.breath();
        thirdAnimal.breath();

        Animal[] animals = {
                firstAnimal,
                secondAnimal,
                thirdAnimal
        };

        System.out.println(" === ");
        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.breath();
        }
    }
}
