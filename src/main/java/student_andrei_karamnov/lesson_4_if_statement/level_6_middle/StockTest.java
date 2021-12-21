package student_andrei_karamnov.lesson_4_if_statement.level_6_middle;

class StockTest {
    public static void main(String[] args) {
    Stock stock = new Stock("Yandex", 10);
    stock.getPriceInformation();
    stock.updatePrice(25);
    stock.updatePrice(9);
    stock.updatePrice(16);
    stock.getPriceInformation();
    } //Min price всегда по дефолту 0. Непонятно как решать эту проблему.
}
