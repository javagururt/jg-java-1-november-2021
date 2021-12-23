package student_andrei_karamnov.lesson_4_if_statement.level_6_middle;

class Stock {
    String name;
    int currentPrice;
    int maxPrice;
    int minPrice ;

    public Stock(String stockName, int price){
        this.name = stockName;
        this.currentPrice = price;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }
    public int updatePrice(int newPrice){
        currentPrice = newPrice;
        if (newPrice < minPrice) {
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
