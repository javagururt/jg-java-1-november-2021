package student_mihails_nikolajevs.lesson_3.level_7_senior_;
/*
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
 */
public class Monitor {

        String brand;
        String specificUses;
        int screenSize;
        int price;

        public Monitor (String brand, String specificUses, int screenSize, int price) {

            this.brand = brand;
            this.specificUses = specificUses;
            this.screenSize = screenSize;
            this.price = price;
        }
        public void printMonitor() {

            System.out.println("Monitor brand: " + this.brand);
            System.out.println("Specific Uses: " + this.specificUses);
            System.out.println("Screen Size: " + this.screenSize);
            System.out.println("Monitor price: " + this.price);
        }

    }


