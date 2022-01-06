package teacher.lesson_3_oop_first_look.lessoncode;

class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        Dog testDog = new Dog("Bobik", 10, false); //Ctrl + P
        String dogName = myDog.name;
        int dogAge = myDog.age;
        boolean dogHungry = myDog.hungry;

        System.out.println(dogName);
        System.out.println(dogAge);
        System.out.println(dogHungry);

        //Null Pointer Exception
//        String dogNameAndAge = dogName.concat("dogAge");

        myDog.name = "Tuzik";

        System.out.println(myDog.name);

        Dog secondDog = new Dog();
        secondDog.name = "Sharik";

        System.out.println(secondDog.name);
        System.out.println(myDog.name);

        Dog thirdDog = new Dog("Bobik");
        System.out.println(thirdDog.name);
    }

}
