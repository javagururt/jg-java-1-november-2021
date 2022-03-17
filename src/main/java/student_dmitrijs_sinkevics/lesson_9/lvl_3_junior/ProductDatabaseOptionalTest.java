package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductDatabaseOptionalTest {
    public static void main(String[] args) {
        ProductDatabaseOptionalTest test = new ProductDatabaseOptionalTest();
        test.findByTitleOptionalTest();
    }

    void findByTitleOptionalTest() {
        InMemoryDatabaseOptional inMemoryDatabaseOptional=new InMemoryDatabaseOptional();

        Product carOne= new Product("Ford");
        Product carTwo= new Product("Mazda");
        Product carThree= new Product("Lexus");
        Product carFour= new Product("VW");

        Product[] carList= new Product[] {carOne, carTwo, carThree, carFour};

        String expectedResult= carOne.getTitle();
        String realResult= inMemoryDatabaseOptional.findByTitleOptional(carList,"Ford").get().getTitle();

        if (realResult.equals(expectedResult)) {
            System.out.println("findByTitleOptional test = OK");
        } else {
            System.out.println("findByTitleOptional test = FAIL");
        }

    }
}

