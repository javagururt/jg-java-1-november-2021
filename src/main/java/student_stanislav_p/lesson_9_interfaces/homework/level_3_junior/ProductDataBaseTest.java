package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDataBaseTest {


    public static void main(String[] args) {
        ProductDataBaseTest test = new ProductDataBaseTest();
        test.findProductByTitleInArrayTest1();
        test.findProductByTitleInArrayTest2();
        test.findProductByTitleInArrayTest3();
    }

    //-----------------------------------------------------
    void findProductByTitleInArrayTest1(){

        Product productType1 = new Product("BMW");
        Product productType2 = new Product("MERCEDES");
        Product productType3 = new Product("JAGUAR");
        Product productType4 = new Product("FIAT");


        Product[] products = {productType1, productType2, productType3, productType4};
        InMemoryDatabase data = new InMemoryDatabase();

        Product expectedResult = productType1;
        Product expectedResult2 = productType4;

        checkResult("TEST 1 (find title): ", data.findByTitle(products, "BMW"), expectedResult);

        checkResult("TEST 2 (find title): ", data.findByTitle(products, "FIAT"), expectedResult2);

    }

    //-----------------------------------------------------
    void findProductByTitleInArrayTest2(){

        Product productType1 = new Product("BMW");
        Product productType2 = new Product("MERCEDES");
        Product productType3 = new Product("JAGUAR");
        Product productType7 = new Product("VOLVO");

        InMemoryDatabase data = new InMemoryDatabase();

        data.save(productType7);
        data.save(productType1);
        data.save(productType3);
        data.save(productType2);

        checkResult("TEST 3 (save product in database ): ", data.findByTitle(data.getDatabase(), "VOLVO"), productType7);
        checkResult("TEST 4 (save product in database ): ", data.findByTitle(data.getDatabase(), "BMW"), productType1);


    }

    //-----------------------------------------------------
    void findProductByTitleInArrayTest3(){

        Product productType1 = new Product("BMW");
        Product productType7 = new Product("VOLVO");
        Product productType8 = new Product(null);


        Option_InMemoryDatabaseProductDatabase option = new Option_InMemoryDatabaseProductDatabase();

        option.save2(productType7);
        option.save2(productType1);
        option.save2(productType8);

        checkResultOptional("TEST 5 (find by title with  Optional-util): ", option.findByTitle2(option.getDatabase(), "BMW"), productType1);

        checkResultOptional("TEST 6 (find by title with  Optional-util): ", option.findByTitle2(option.getDatabase(), "BMW"), productType1);

    }

    //-----------------------------------------------------

    void checkResult(String testName, Product actual, Product expected){

        if (actual.equals(expected)){
            System.out.println(testName + " is OK");
        }else {
            System.out.println(testName + " FAILED");
            System.out.println("Actual result: " + actual.getTitle());
            System.out.println("Expected result: " + expected.getTitle());
        }
        System.out.println("===============================");
    }

    void checkResultOptional(String testName, Optional<Product> actual, Product expected){

        if (actual.get().getTitle().equals(expected.getTitle())){
            System.out.println(testName + " is OK");
        }else {
            System.out.println(testName + " FAILED");
            System.out.println("Actual result: " + actual.get().getTitle());
            System.out.println("Expected result: " + expected.getTitle());
        }
        System.out.println("===============================");
    }
}