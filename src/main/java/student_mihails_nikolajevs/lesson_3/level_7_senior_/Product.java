package student_mihails_nikolajevs.lesson_3.level_7_senior_;
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

import java.awt.*;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public double actualPrice() {
        double realPrice = regularPrice - regularPrice * discount;
        return realPrice;
    }

    public Product (String name) {
        this.name = name;
    }

    public void setPrice(double regularPrice, double discount) {
       this.regularPrice = regularPrice;
       this.discount = discount;
    }

    void printInformation() {

        System.out.println("Product name: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Actual Price: " + actualPrice());
    }

}







