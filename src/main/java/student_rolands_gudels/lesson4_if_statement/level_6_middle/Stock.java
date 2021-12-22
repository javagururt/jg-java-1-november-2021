package student_rolands_gudels.lesson4_if_statement.level_6_middle;

class Stock {
    public static void main(String[] args) {
        Stock stock = new Stock("Google", 1000);
        stock.updatePrice(99);
        stock.updatePrice(88);
        stock.updatePrice(777);
        stock.getPriceInformation();

    }


    /*Необходимо реализовать класс Stock ("акция") таким образом,
чтобы была возможность узнать текущую цену акции,
а также ее максимальную и минимальную стоимость
за период существования.

Класс Stock должен обладать следующими характеристиками:

Свойства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость

Методы:
- Обновить текущую стоимость акции updatePrice(int newPrice)
- Получить информацию об акции getPriceInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().*/
    //Stock google = new Stock("GOOG", 10);
    //String priceInformation = google.getPriceInformation();
    //System.out.println(priceInformation);
    //​
    //google.updatePrice(15);
    //google.updatePrice(7);
    //google.updatePrice(14);
    //​
    //priceInformation = google.getPriceInformation();
    //System.out.println(priceInformation);
    //
    //После выполнения кода вывод в консоли должет быть следующим:
    //Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
    //Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15*/
    String companyName;
    int currentPrice;
    int minimalPrice;
    int maximalPrice;

    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minimalPrice = currentPrice;
        this.maximalPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;
      /*  minimalPrice = Math.min(minimalPrice,currentPrice);
        maximalPrice = Math.max(maximalPrice,currentPrice); */
        if (this.currentPrice>this.maximalPrice){
            this.maximalPrice=this.currentPrice;
        } else if (this.currentPrice<this.minimalPrice){
            this.minimalPrice=this.currentPrice;
        }
        }

    int testMax() {
        return maximalPrice;
    }

    void getPriceInformation() {
        System.out.println("Company = " + companyName + " , " + "Current price = " + currentPrice + " Min Price = "
                + minimalPrice + ", " + " Max Price = " + maximalPrice);
    }
}


