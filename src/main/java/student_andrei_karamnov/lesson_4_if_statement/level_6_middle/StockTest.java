package student_andrei_karamnov.lesson_4_if_statement.level_6_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
    Stock stock = new Stock("Yandex", 10);
    stock.getPriceInformation();
    stock.updatePrice(25);
    stock.updatePrice(9);
    stock.updatePrice(16);
    stock.getPriceInformation();
        StockTest stockTest = new StockTest();
        stockTest.maxTestOne();
        stockTest.maxTestTwo();
        stockTest.maxTestThree();
        stockTest.maxTestFour();
        stockTest.maxTestFive();
        stockTest.maxTestSix();
            stockTest.minTestOne();
            stockTest.minTestTwo();
            stockTest.minTestThree();
            stockTest.minTestFour();
            stockTest.minTestFive();
            stockTest.minTestSix();
                stockTest.currentTestOne();
                stockTest.currentTestTwo();
                stockTest.currentTestThree();
                stockTest.currentTestFour();
                stockTest.currentTestFive();
                stockTest.currentTestSix();
    }
    public void maxTestOne() {
        int expectedResult = 999;
        Stock stock = new Stock("StockTest",999);
        int realResult = stock.maxPrice;
        if (realResult == expectedResult) {
            System.out.println(" Max test One = OK");
        } else { System.out.println("Max test One = FAIL");
    }
}
    public void maxTestTwo() {
        int expectedResult = 999;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(1);
        int realResult = stock.maxPrice;
        if (realResult == expectedResult) {
            System.out.println(" Max test Two = OK");
        } else { System.out.println("Max test Two = FAIL");
        }
    }
    public void maxTestThree() {
        int expectedResult = 1000;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int realResult = stock.maxPrice;
        if (realResult == expectedResult) {
            System.out.println(" Max test Three = OK");
        } else { System.out.println("Max test Three = FAIL");
        }
    }
    public void maxTestFour() {
        int expectedResult = 1000;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int realResult = stock.maxPrice;
        if (realResult == expectedResult) {
            System.out.println(" Max test Four = OK");
        } else { System.out.println("Max test Four = FAIL");
        }
    }
    public void maxTestFive() {
        int expectedResult = 27;
        Stock stock = new Stock("StockTest",9);
        stock.updatePrice(27);
        int realResult = stock.maxPrice;
        if (realResult == expectedResult) {
            System.out.println(" Max test Five = OK");
        } else { System.out.println("Max test Five = FAIL");
        }
    }
    public void maxTestSix() {
        int expectedResult = 99;
        Stock stock = new Stock("StockTest",10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int realResult = stock.maxPrice;
        if (realResult == expectedResult) {
            System.out.println(" Max test Six = OK");
        } else { System.out.println("Max test Six = FAIL");
        }
    }
    public void minTestOne() {
        int expectedResult = 999;
        Stock stock = new Stock("StockTest",999);
        int realResult = stock.minPrice;
        if (realResult == expectedResult) {
            System.out.println(" Min test One = OK");
        } else { System.out.println("Min test One = FAIL");
        }
    }
    public void minTestTwo() {
        int expectedResult = 1;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(1);
        int realResult = stock.minPrice;
        if (realResult == expectedResult) {
            System.out.println(" Min test Two = OK");
        } else { System.out.println("Min test Two = FAIL");
        }
    }
    public void minTestThree() {
        int expectedResult = 2;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int realResult = stock.minPrice;
        if (realResult == expectedResult) {
            System.out.println(" Min test Three = OK");
        } else { System.out.println("Min test Three = FAIL");
        }
    }
    public void minTestFour() {
        int expectedResult = 2;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int realResult = stock.minPrice;
        if (realResult == expectedResult) {
            System.out.println(" Min test Four = OK");
        } else { System.out.println("Min test Four = FAIL");
        }
    }
    public void minTestFive() {
        int expectedResult = 9;
        Stock stock = new Stock("StockTest",9);
        stock.updatePrice(27);
        int realResult = stock.minPrice;
        if (realResult == expectedResult) {
            System.out.println(" Min test Five = OK");
        } else { System.out.println("Min test Five = FAIL");
        }
    }
    public void minTestSix() {
        int expectedResult = 5;
        Stock stock = new Stock("StockTest",10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int realResult = stock.minPrice;
        if (realResult == expectedResult) {
            System.out.println(" Min test Six = OK");
        } else { System.out.println("Min test Six = FAIL");
        }
    }
    public void currentTestOne() {
        int expectedResult = 999;
        Stock stock = new Stock("StockTest",999);
        int realResult = stock.currentPrice;
        if (realResult == expectedResult) {
            System.out.println("Current test One = OK");
        } else { System.out.println("Current test One = FAIL");
        }
    }
    public void currentTestTwo() {
        int expectedResult = 1;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(1);
        int realResult = stock.currentPrice;
        if (realResult == expectedResult) {
            System.out.println("Current test Two = OK");
        } else { System.out.println("Current test Two = FAIL");
        }
    }
    public void currentTestThree() {
        int expectedResult = 1000;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int realResult = stock.currentPrice;
        if (realResult == expectedResult) {
            System.out.println("Current test Three = OK");
        } else { System.out.println("Current test Three = FAIL");
        }
    }
    public void currentTestFour() {
        int expectedResult = 8;
        Stock stock = new Stock("StockTest",999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int realResult = stock.currentPrice;
        if (realResult == expectedResult) {
            System.out.println("Current test Four = OK");
        } else { System.out.println("Current test Four = FAIL");
        }
    }
    public void currentTestFive() {
        int expectedResult = 27;
        Stock stock = new Stock("StockTest",9);
        stock.updatePrice(27);
        int realResult = stock.currentPrice;
        if (realResult == expectedResult) {
            System.out.println("Current test Five = OK");
        } else { System.out.println("Current test Five = FAIL");
        }
    }
    public void currentTestSix() {
        int expectedResult = 77;
        Stock stock = new Stock("StockTest",10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int realResult = stock.currentPrice;
        if (realResult == expectedResult) {
            System.out.println("Current test Six = OK");
        } else { System.out.println("Current test Six = FAIL");
        }
    }
}
