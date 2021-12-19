package student_stanislav_p.lesson_3_oop_first_look.homework.level_7_senior;

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

public class ProductDemo {
    public static void main(String[] args) {
        double priceWithoutDiscount = 151.75;
        double discountAmount = 0.20;

        Product tvNew = new Product("Philips");
        tvNew.setRegularPrice(priceWithoutDiscount);
        tvNew.setDiscount(discountAmount);


        tvNew.printInformation();
        System.out.println("Price without discount - " + priceWithoutDiscount);
    }
}
