package student_artyom_shvegzhda.lesson_5_arrays_for_loop.lessoncode;

class Stock {

    String name;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;
    }

    public void update(double price) {
        currentPrice = price;
        if (minPrice > price) {
            minPrice = price;
        }
        if (maxPrice < price) {
            maxPrice = price;
        }
    }


}
