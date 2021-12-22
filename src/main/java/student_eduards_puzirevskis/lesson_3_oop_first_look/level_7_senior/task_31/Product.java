package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.task_31;
/*
Разработать класс - продукт,
у которого должны быть следующие характеристики:

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".
 */
class Product {
    String name;
    double regularPrice;
    double discount;
    double actualPrice;
    double preActualPrice;

    public String getName() {
        System.out.println("Hello! I've heard, that you are going to shopping!");
        System.out.println("What product are you going to buy?");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        System.out.println("Nice! How much euros it costs without discount?");
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        System.out.println("It's Christmas time, so it must be discount for it. How much percent is it?");
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getActualPrice() {
        System.out.println("Alright, now I'll calculate it actual price.");
        double scale = Math.pow(10,2);
        preActualPrice = this.regularPrice - this.regularPrice*(this.discount*0.01);
        actualPrice = Math.ceil(preActualPrice*scale)/scale;
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public void printInformation() {
        System.out.println("So, in total:");
        System.out.println("You are going to by " + this.name + ".");
        System.out.println("Without discount it would cost you " + this.regularPrice + " euros.");
        System.out.println("I'm glad, that we have " + this.discount + "% discount for you.");
        System.out.println("So in total it will cost you only " + this.actualPrice + " euros.");

    }
}
