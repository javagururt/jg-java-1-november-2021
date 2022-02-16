package student_eduards_puzirevskis.lesson_4_if_statement.level_6_middle;

import java.util.Objects;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.stockTestOne();
        test.stockTestTwo();
        test.stockTestThree();
        test.stockTestFour();
        test.stockTestFive();
        test.stockTestSix();

    }


    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASSED!");
        } else {
            System.out.println(testName + " = FAILURE!");
        }
    }


    public void stockTestOne() {
        Stock victim = new Stock("victim", 10);
        String expectedName = "victim";
        int expectedCurrentPrice = 10;
        int expectedMinPrice = 10;
        int expectedMaxPrice = 10;
        int realCurrentPrice = victim.currentPrice;
        int realMinPrice = victim.minPrice;
        int realMaxPrice = victim.maxPrice;
        String realName = victim.name;
        checkTestResult((Objects.equals(expectedName, realName)
                && expectedCurrentPrice == realCurrentPrice
                && expectedMinPrice == realMinPrice
                && expectedMaxPrice == realMaxPrice), "Stock Test One");
    }

    public void stockTestTwo() {
        Stock victim = new Stock("victim", 10);
        victim.updatePrice(12);
        String expectedName = "victim";
        int expectedCurrentPrice = 12;
        int expectedMinPrice = 10;
        int expectedMaxPrice = 12;
        int realCurrentPrice = victim.currentPrice;
        int realMinPrice = victim.minPrice;
        int realMaxPrice = victim.maxPrice;
        String realName = victim.name;
        checkTestResult((Objects.equals(expectedName, realName)
                && expectedCurrentPrice == realCurrentPrice
                && expectedMinPrice == realMinPrice
                && expectedMaxPrice == realMaxPrice), "Stock Test Two");
    }

    public void stockTestThree() {
        Stock victim = new Stock("victim", 10);
        victim.updatePrice(12);
        victim.updatePrice(5);
        String expectedName = "victim";
        int expectedCurrentPrice = 5;
        int expectedMinPrice = 5;
        int expectedMaxPrice = 12;
        int realCurrentPrice = victim.currentPrice;
        int realMinPrice = victim.minPrice;
        int realMaxPrice = victim.maxPrice;
        String realName = victim.name;
        checkTestResult((Objects.equals(expectedName, realName)
                && expectedCurrentPrice == realCurrentPrice
                && expectedMinPrice == realMinPrice
                && expectedMaxPrice == realMaxPrice), "Stock Test Three");
    }

    public void stockTestFour() {
        Stock victim = new Stock("victim", 10);
        victim.updatePrice(12);
        victim.updatePrice(5);
        victim.updatePrice(7);
        String expectedName = "victim";
        int expectedCurrentPrice = 7;
        int expectedMinPrice = 5;
        int expectedMaxPrice = 12;
        int realCurrentPrice = victim.currentPrice;
        int realMinPrice = victim.minPrice;
        int realMaxPrice = victim.maxPrice;
        String realName = victim.name;
        checkTestResult((Objects.equals(expectedName, realName)
                && expectedCurrentPrice == realCurrentPrice
                && expectedMinPrice == realMinPrice
                && expectedMaxPrice == realMaxPrice), "Stock Test Four");
    }

    public void stockTestFive() {
        Stock victim = new Stock("victim", 10);
        victim.updatePrice(12);
        victim.updatePrice(5);
        victim.updatePrice(7);
        victim.updatePrice(99);
        String expectedName = "victim";
        int expectedCurrentPrice = 99;
        int expectedMinPrice = 5;
        int expectedMaxPrice = 99;
        int realCurrentPrice = victim.currentPrice;
        int realMinPrice = victim.minPrice;
        int realMaxPrice = victim.maxPrice;
        String realName = victim.name;
        checkTestResult((Objects.equals(expectedName, realName)
                && expectedCurrentPrice == realCurrentPrice
                && expectedMinPrice == realMinPrice
                && expectedMaxPrice == realMaxPrice), "Stock Test Five");
    }

    public void stockTestSix() {
        Stock victim = new Stock("victim", 10);
        victim.updatePrice(12);
        victim.updatePrice(5);
        victim.updatePrice(7);
        victim.updatePrice(99);
        victim.updatePrice(77);
        String expectedName = "victim";
        int expectedCurrentPrice = 77;
        int expectedMinPrice = 5;
        int expectedMaxPrice = 99;
        int realCurrentPrice = victim.currentPrice;
        int realMinPrice = victim.minPrice;
        int realMaxPrice = victim.maxPrice;
        String realName = victim.name;
        checkTestResult((Objects.equals(expectedName, realName)
                && expectedCurrentPrice == realCurrentPrice
                && expectedMinPrice == realMinPrice
                && expectedMaxPrice == realMaxPrice), "Stock Test Six");
    }


}
