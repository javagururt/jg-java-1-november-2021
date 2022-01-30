package student_artyom_shvegzhda.lesson_3_oop_first_look.lessoncode;

import teacher.lesson_3_oop_first_look.lessoncode.Dog;

class DogDemo {

    public static void main(String[] args) {
        teacher.lesson_3_oop_first_look.lessoncode.Dog myDog = new teacher.lesson_3_oop_first_look.lessoncode.Dog();
        teacher.lesson_3_oop_first_look.lessoncode.Dog testDog = new teacher.lesson_3_oop_first_look.lessoncode.Dog("Bobik", 10, false); //Ctrl + P
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

        teacher.lesson_3_oop_first_look.lessoncode.Dog secondDog = new teacher.lesson_3_oop_first_look.lessoncode.Dog();
        secondDog.name = "Sharik";

        System.out.println(secondDog.name);
        System.out.println(myDog.name);

        teacher.lesson_3_oop_first_look.lessoncode.Dog thirdDog = new Dog("Bobik");
        System.out.println(thirdDog.name);
    }

}
