package student_mihails_nikolajevs.lesson_9.level_3_junior_.task_8_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {

    public static void main(String[] args) {

        InMemoryDatabase memoryDatabase = new InMemoryDatabase();
        Product computer = new Product("Computer");
        memoryDatabase.save(computer);
        Product tableGame = new Product("tableGame");
        memoryDatabase.save(tableGame);
        Product furniture = new Product("Furniture");
        memoryDatabase.save(furniture);

        //      Product findSomeProduct = memoryDatabase.findByTitle("Computer");
        //      System.out.println("Your Product is " + findSomeProduct.getTitle());
        //     System.out.println(memoryDatabase);

    }
}
 //