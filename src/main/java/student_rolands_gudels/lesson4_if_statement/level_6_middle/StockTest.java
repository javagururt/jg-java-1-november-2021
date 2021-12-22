package student_rolands_gudels.lesson4_if_statement.level_6_middle;

import java.util.Objects;

class StockTest {
     public static void main(String[] args) {
             StockTest stockTest = new StockTest();
             stockTest.maxTestOne();

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
            System.out.println(" Test One = OK");
        } else { System.out.println("Test One = FAIL");
        }
    }
}

