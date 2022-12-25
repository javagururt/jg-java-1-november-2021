package student_mihails_nikolajevs.lesson_2_var.level_2_intern_;

public class CatDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        String catName = myCat.name;
        int catAge = myCat.age;
        boolean catHungry = myCat.hungry;

        System.out.println(catName);
        System.out.println(catAge);
        System.out.println(catHungry);

        myCat.name = "Vasja";
        System.out.println(myCat.name);
        Cat secondCat = new Cat();
        secondCat.name = "Barsik";
        System.out.println(secondCat.name);
        Cat thirdCat = new Cat("Bella");
        System.out.println(thirdCat.name);


    }

}
