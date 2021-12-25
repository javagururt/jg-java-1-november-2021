package student_rolands_gudels.lesson_3_oop_first_look.level_7_senior;

class Task_31 {
    /*Разработать класс - продукт,
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
Класс с демонстрацией работы должен называться "ProductDemo".*/
    static class Product{
        double regularPrice;
        double discount;
        String name;

        public double actualPrice(){
            double x = (regularPrice/100)*discount;
            return regularPrice - x;
        }
        void printInformation(){
            System.out.println("This product price is "+regularPrice+"  product discount is: "+discount+"  product price including discount is:  "+actualPrice());
        }
        public Product(String name) {this.name = name;}

        public void setRegularPrice(double regularPrice){this.regularPrice = regularPrice;
        }
        public  void setDiscount(double discount){this.discount = discount;}
    }
}
