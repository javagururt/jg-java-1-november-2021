package student_stanislav_p.lesson_4_if_statement.level_6_middle;


import teacher.annotations.CodeReview;

/*Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27*/
  /*   private void MaxTestOne() {
        int enteredNumber = 999;
        int expectedResult = 999;
        Stock stock = new Stock("Test",999);
        if (expectedResult == stock.maximalPrice) {
            System.out.println(" Test One = OK");
        } else { System.out.println("Test One = FAIL");
        }
    }
} */
@CodeReview(approved = true)
public class StockTest {

    public static void main(String[] args) {

        int realResult;


        StockTest MaxDetectorTest = new StockTest();

        realResult= MaxDetectorTest.MaxTest( 100,999,1,0,0);

        if (realResult == 999) {
            System.out.println(" Test1 One = OK");
        } else { System.out.println("Test1 One = FAIL");
        }

       realResult=MaxDetectorTest.MaxTest(200,999,2,1000,0);
        if (realResult == 1000) {
            System.out.println(" Test2 One = OK");
        } else { System.out.println("Test2 One = FAIL");
        }

        realResult=MaxDetectorTest.MaxTest(200,999,2,1000,8);

        if (realResult == 1000) {
            System.out.println(" Test3 One = OK");
        } else { System.out.println("Test3 One = FAIL");
        }



        realResult = MaxDetectorTest.MaxTest(19,9,27,0,0);

        if (realResult == 27) {
            System.out.println(" Test4 One = OK");
        } else { System.out.println("Test4 One = FAIL");
        }

    }




   public int MaxTest (int startPrice, int price1, int  price2, int  price3, int  price4){


        int startNPrice = startPrice;

        int priceN1 = price1;
        int priceN2 = price2;
        int priceN3 = price3;
        int priceN4 = price4;


        Stock google = new Stock("Google", startNPrice);

        if (priceN1>0) { google.updatePrice(priceN1);}
       if (priceN2>0) { google.updatePrice(priceN2);}
       if (priceN3>0) { google.updatePrice(priceN3);}
       if (priceN4>0) { google.updatePrice(priceN4);}

       return google.getPriceInformation();


    }
}