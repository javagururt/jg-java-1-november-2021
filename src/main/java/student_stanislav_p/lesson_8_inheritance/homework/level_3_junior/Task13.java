package student_stanislav_p.lesson_8_inheritance.homework.level_3_junior;

/*
Придумайте и создайте абстрактный класс и его потомков.
 */

class Dog {

    protected String  breed;

    public Dog(String  breed) {
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }
}

class CaneCorso extends Dog {

    protected  int age;
    protected String name;

    // создайте конструктор

    public CaneCorso( String  breed, String name, int age) {
        super(breed);
        this.name=name;
        this.age= age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}


public class Task13{




        public static void main(String[] args) {

            CaneCorso newDog = new CaneCorso("Cane Corso Italiano", "Zeus", 2);
            System.out.println("Breed ->" + newDog.getBreed());
            System.out.println("Name ->" + newDog.getName());
            System.out.println("Age ->" + newDog.getAge());

        }

}
