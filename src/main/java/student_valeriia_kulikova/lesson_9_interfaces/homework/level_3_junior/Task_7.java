package student_valeriia_kulikova.lesson_9_interfaces.homework.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
// Данный интерфейс НЕ является функциональным
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
