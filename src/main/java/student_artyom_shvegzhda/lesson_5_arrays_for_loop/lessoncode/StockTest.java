package student_artyom_shvegzhda.lesson_5_arrays_for_loop.lessoncode;

import teacher.lesson_5_arrays_for_loop.lessoncode.Stock;

class StockTest {

    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.shouldCreateStockWithCurrentPrice();
        testRunner.shouldCreateStockWithName();
        testRunner.shouldCreateStockWithMaxPrice();
        testRunner.shouldCreateStockWithMinPrice();
        testRunner.shouldUpdateCurrentPrice();
        testRunner.shouldUpdateCurrentPrice2();
        testRunner.shouldUpdateMinPrice();
        testRunner.shouldUpdateMaxPrice();
        testRunner.shouldNotChangeMinPriceAfterUpdate();
        testRunner.shouldNotChangeMaxPriceAfterUpdate();
    }

    void shouldCreateStockWithCurrentPrice() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("APPLE", 100);

        double expectedPrice = 100;
        double actualPrice = stock.currentPrice;

        assertEquals("shouldCreateStockWithCurrentPrice", expectedPrice, actualPrice);
    }

    void shouldCreateStockWithName() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("APPLE", 100);

        String expectedName = "APPLE";
        String actualName = stock.name;

        if (expectedName.equals(actualName)) {
            System.out.println("shouldCreateStockWithName: SUCCESS");
        } else {
            System.out.println("shouldCreateStockWithName: FAILURE");
        }
    }

    void shouldCreateStockWithMaxPrice() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("GOOGLE", 200);

        double expectedMaxPrice = 200;
        double actualMaxPrice = stock.maxPrice;

        assertEquals("shouldCreateStockWithMaxPrice", expectedMaxPrice, actualMaxPrice);
    }

    void shouldCreateStockWithMinPrice() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("GOOGLE", 200);

        double expectedMinPrice = 200;
        double actualMinPrice = stock.minPrice;

        assertEquals("shouldCreateStockWithMinPrice", expectedMinPrice, actualMinPrice);
    }

    void shouldUpdateCurrentPrice() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("GOOGLE", 200);

        stock.update(300);

        double expectedCurrentPrice = 300;
        double actualCurrentPrice = stock.currentPrice;

        assertEquals("shouldUpdateCurrentPrice", expectedCurrentPrice, actualCurrentPrice);
    }

    void shouldUpdateCurrentPrice2() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("GOOGLE", 200);

        stock.update(1);

        double expectedCurrentPrice = 1;
        double actualCurrentPrice = stock.currentPrice;

        assertEquals("shouldUpdateCurrentPrice2", expectedCurrentPrice, actualCurrentPrice);
    }

    void shouldUpdateMinPrice() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("GOOGLE", 200);

        stock.update(100);

        double expected = 100;
        double actual = stock.minPrice;

        assertEquals("shouldUpdateMinPrice", expected, actual);
    }

    void shouldUpdateMaxPrice() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("GOOGLE", 200);

        stock.update(400);

        double expected = 400;
        double actual = stock.maxPrice;

        assertEquals("shouldUpdateMaxPrice", expected, actual);
    }

    void shouldNotChangeMinPriceAfterUpdate() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("GOOGLE", 200);

        stock.update(400);

        double expected = 200;
        double actual = stock.minPrice;

        assertEquals("shouldNotChangeMinPriceAfterUpdate", expected, actual);
    }

    void shouldNotChangeMaxPriceAfterUpdate() {
        teacher.lesson_5_arrays_for_loop.lessoncode.Stock stock = new teacher.lesson_5_arrays_for_loop.lessoncode.Stock("GOOGLE", 200);

        stock.update(100);

        double expected = 200;
        double actual = stock.maxPrice;

        assertEquals("shouldNotChangeMaxPriceAfterUpdate", expected, actual);
    }


    private void assertEquals(String testName, double expected, double actual) {
        if (expected == actual) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAILURE, expected: " + expected + " but actual: " + actual);
        }
    }
}
