package student_rolands_gudels.lesson4_if_statement.level_6_middle;

import java.util.Objects;

class StockTest {
     public static void main(String[] args) {
             StockTest stockTest = new StockTest();
             stockTest.maxTestOne();
             stockTest.maxTestTwo();
             stockTest.maxTestThree();
             stockTest.maxTestFour();
             stockTest.maxTestFive();
             stockTest.maxTestSix();

     }


    /*Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27*/
     public void maxTestOne() {
        int expectedResult = 999;
        Stock stock = new Stock("Test1",999);
        if (Objects.equals(expectedResult, stock.maximalPrice)) {
            System.out.println(" Max test One = OK");
        } else { System.out.println("Max test One = FAIL");
        }
    }
    public void maxTestTwo() {
        int expectedResult = 999;
        Stock stock = new Stock("Test1",999);
        stock.updatePrice(1);
        if (Objects.equals(expectedResult, stock.maximalPrice)) {
            System.out.println(" Max test Two = OK");
        } else { System.out.println("Max test Two = FAIL");
        }
    }
    public void maxTestThree() {
        int expectedResult = 1000;
        Stock stock = new Stock("Test1",999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        if (Objects.equals(expectedResult, stock.maximalPrice)) {
            System.out.println(" Max test Three = OK");
        } else { System.out.println("Max test Three = FAIL");
        }
    }
    public void maxTestFour() {
        int expectedResult = 1000;
        Stock stock = new Stock("Test1",999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        if (Objects.equals(expectedResult, stock.maximalPrice)) {
            System.out.println(" Max test four = OK");
        } else { System.out.println("Max four Three = FAIL");
        }
    }
    public void maxTestFive() {
        int expectedResult = 27;
        Stock stock = new Stock("Test1",9);
        stock.updatePrice(27);
        if (Objects.equals(expectedResult, stock.maximalPrice)) {
            System.out.println(" Max test five = OK");
        } else { System.out.println("Max five five = FAIL");
        }
    }
    public void maxTestSix() {
        int expectedResult = 99;
        Stock stock = new Stock("Test1",10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        if (Objects.equals(expectedResult, stock.maximalPrice)) {
            System.out.println(" Max test six = OK");
        } else { System.out.println("Max five six = FAIL");
        }
    }
}

