package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductDataBaseTest {
    public static void main(String[] args) {
        ProductDataBaseTest test = new ProductDataBaseTest();
        test.findByTitleTest();
    }

    void findByTitleTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        Product carOne = new Product("Ford");
        Product carTwo= new Product("Mazda");
        Product carThree= new Product("Lexus");
        Product carFour= new Product("VW");

        Product[] carList= new Product[] {carOne, carTwo, carThree, carFour};

        String expectedResult= carOne.getTitle();
        String realResult= inMemoryDatabase.findByTitle(carList,"Ford").getTitle();

        if (realResult.equals(expectedResult)) {
            System.out.println("findByTitle test = OK");
        } else {
            System.out.println("findByTitle test = FAIL");
        }

    }
}