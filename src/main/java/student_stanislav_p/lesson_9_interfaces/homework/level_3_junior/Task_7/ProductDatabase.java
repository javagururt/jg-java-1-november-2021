package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_7;

//Является ли следующий интерфейс функциональным? - Нет, не является.

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(Product[] database, String productTitle);
}
