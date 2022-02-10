package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior;

import teacher.annotations.CodeReview;

//Является ли следующий интерфейс функциональным? - Нет, не является.
@CodeReview(approved = true)
interface ProductDatabase {

    void save(Product product);

    Product findByTitle(Product[] database, String productTitle);
}
