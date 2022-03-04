package student_valeriia_kulikova.lesson_9_interfaces.homework.level_3_junior;

import java.util.Arrays;

public class ProductDataBaseTest {
    public static void main(String[] args) {
        ProductDataBaseTest test = new ProductDataBaseTest();
        test.saveProductTest();
        test.findProductByTitleTest();
    }
    void saveProductTest(){
        Product product1 = new Product("Alcatel");
        Product product2 = new Product("Apple");
        Product product3 = new Product("Sony");
        Product product4 = new Product("Samsung");
        Product [] base = {product1,product2,product3,product4};
        InMemoryDatabase newBase = new InMemoryDatabase();
        newBase.save(product1);
        newBase.save(product2);
        newBase.save(product3);
        newBase.save(product4);
        Product[] testBase = newBase.getProducts();
        boolean expectedResult = true;
        for (int i = 0; i < base.length; i++) {
            expectedResult=expectedResult && (base[i].equals(testBase[i]));
        }
        if (expectedResult) {
            System.out.println("TEST 1 (SAVE) is OK");
        } else {
            System.out.println("TEST 1 (SAVE) is FAIL");
        }
    }

    void findProductByTitleTest () {
        Product product1 = new Product("Alcatel");
        Product product2 = new Product("Apple");
        Product product3 = new Product("Sony");
        Product product4 = new Product("Samsung");
        Product [] base = {product1,product2,product3,product4};
        InMemoryDatabase newBase = new InMemoryDatabase();
        newBase.save(product1);
        newBase.save(product2);
        newBase.save(product3);
        newBase.save(product4);
        Product[] testBase = newBase.getProducts();

        Product expectedResult1 = product1;
        Product expectedResult2 = product4;

        checkResult("TEST 2 (SEARCH)", newBase.findByTitle("Alcatel"), product1 );
        checkResult("TEST 3 (SEARCH)", newBase.findByTitle("Samsung"), product4 );



    }

    void checkResult (String testName, Product actual, Product expectedResult) {
        if (actual.equals(expectedResult)) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is FAIL");
        }
    }
}

