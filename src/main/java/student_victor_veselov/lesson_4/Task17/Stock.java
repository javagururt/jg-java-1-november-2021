package student_victor_veselov.lesson_4.Task17;

public class Stock {

    String name;
    double price;
    double minPrice;
    double maxPrice;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        minPrice = price;
        maxPrice = price;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;

    }

    public void getPriceInformation() {
        System.out.println("Company name: " + name + " Company Price: " + price + " " + "MinPrice " + minPrice + " " + "MaxPrice " + maxPrice);
    }

}
