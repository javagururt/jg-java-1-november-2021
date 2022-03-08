package student_julija_radchenko.lesson_9_homeworks.level_3_junior;

//Является ли следующий интерфейс функциональным?
//Нет, потому что содержит более одного абстрактного метода.

public class Task_7 {



    interface ProductDatabase {

        void save(Product product);

        Product findByTitle(String productTitle);

    }


    class Product {

        private String title;

        public Product(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

    }
}
