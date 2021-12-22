package student_andrei_karamnov.lesson_4_if_statement.level_6_middle;

class Stock {
    String name;
    int currentPrice;
    int maxPrice;
    int minPrice ;

    public Stock(String stockName, int price){
        this.name = "Yandex";
        this.currentPrice = price;
    }
    public int updatePrice(int newPrice){
        currentPrice = newPrice;
        if (newPrice < minPrice) {   /*используя подсказку из домашки непонятно как реализовать этот код,
        если minPrice всегда = 0 */
            minPrice = newPrice;
        }
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        return currentPrice;
    }
    public void getPriceInformation(){
        System.out.println
                ("Company = " + this.name + ", Current price = " +
                        this.currentPrice + ", Min price = " +
                        minPrice + ", Max price = " +
                        maxPrice);
    }
}
