package student_victor_veselov.lesson_4.Task17;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.mustCreateWithName();
        System.out.println();
        stockTest.mustCreateWithPrice();
        System.out.println();
        stockTest.mustCreatewithMaxPrice();
        System.out.println();
        stockTest.mustCreatewithMinPrice();
        System.out.println();
        stockTest.mustUpdatePrice();

    }

    void mustCreateWithName(){
        Stock stock = new Stock("HBO",500);
        String name = "HBO ";
        String actualName = stock.name;

        if (name.equals(actualName)) {
            System.out.println("Create with name SUCCESS");
        }else {
            System.out.println("Name FAILED");
        }
    }

    void mustCreateWithPrice(){
        Stock stock = new Stock("HBO",300);
        double price = 300;
        double actualprice = stock.price;

        if (price == actualprice){
            System.out.println("Create with Price SUCCESS");
        }else {
            System.out.println("Price FAILED");
        }

    }

    void mustCreatewithMaxPrice(){
        Stock stock = new Stock("HBO",150);
        double price = 150;
        double actualMaxPrice = stock.maxPrice;

        if (price == actualMaxPrice){
            System.out.println("Crate withMaxPrice SUCCESS");
        }else {
            System.out.println("MaxPrice FAILED");
        }
    }

    void mustCreatewithMinPrice(){
        Stock stock = new Stock("HBO",50);
        double price = 50;
        double actualMinPrice = stock.minPrice;

        if (price == actualMinPrice){
            System.out.println("Crate withMinPrice SUCCESS");
        }else {
            System.out.println("MinPrice FAILED ");
        }
    }

    void mustUpdatePrice(){
        Stock stock = new Stock("HBO",300);

        stock.updatePrice(500);

        double price = 500;
        double actualPrice = stock.price;

        if (price == actualPrice){
            System.out.println("UPDATE Price SUCCESS");
        }else {
            System.out.println("UPDATE Price FAILED");
        }
    }
}
