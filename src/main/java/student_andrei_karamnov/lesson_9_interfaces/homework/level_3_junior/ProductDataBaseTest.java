package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDataBaseTest {


    public static void main(String[] args) {
        ProductDataBaseTest test = new ProductDataBaseTest();
        test.findProductByTitleInArrayTest();

    }

    void findProductByTitleInArrayTest() {

        Product product1 = new Product("Orange");
        Product product2 = new Product("Apple");
        Product product3 = new Product("Banana");
        Product product4 = new Product("Pineapple");
        Product product5 = new Product("Watermelon");
        Product product6 = new Product("Blackberry");
        Product[]products = {product1, product2, product3, product4, product5, product6};
        InMemoryDatabase data = new InMemoryDatabase();

        Product expectedResult = product2;
        Product expectedResult2 = product5;

        checkResult1("Find by title TEST 1: ", data.findByTitle(products, "Apple"), expectedResult);
        System.out.println();
        checkResult1("Find by title TEST 2: ", data.findByTitle(products, "Watermelon"), expectedResult2);
        System.out.println();
        Product product7 = new Product("Strawberry");

        Product[]expectedProducts = {product7, product1, product3, product2};

        data.save(product7);
        data.save(product1);
        data.save(product3);
        data.save(product2);
        checkResult1("Save product in database TEST 3:", data.findByTitle(data.getDatabase(), "Banana"), product3);
        checkResult1("Save product in database TEST 4:", data.findByTitle(data.getDatabase(), "Apple"), product2);

        InMemoryDatabaseOption option = new InMemoryDatabaseOption();
        Product product8 = new Product(null);
        option.save2(product7);
        option.save2(product1);
        option.save2(product8);
        System.out.println();
        checkResult2("Find by title using /java utill Optional/ TEST 5:", option.findByTitle2(option.getDatabase(), "Orange"), product1);
        System.out.println();
        checkResult2("Find by title using /java utill Optional/ TEST 6:", option.findByTitle2(option.getDatabase(), "Strawberry"), product1);

    }

    void checkResult1(String testName, Product actual, Product expected){
        System.out.println("Actual result: " + actual.getTitle());
        System.out.println("Expected result: " + expected.getTitle());
        if (actual.equals(expected)){
            System.out.println(testName + " is OK");
        }else {
            System.out.println(testName + " FAILED");
        }
    }

    void checkResult2(String testName, Optional<Product> actual, Product expected){
        System.out.println("Actual result: " + actual.get().getTitle());
        System.out.println("Expected result: " + expected.getTitle());
        if (actual.get().getTitle().equals(expected.getTitle())){
            System.out.println(testName + " is OK");
        }else {
            System.out.println(testName + " FAILED");
        }
    }
}