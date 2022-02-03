package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

//Является ли следующий интерфейс функциональным?
//Нет не является.

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(Product[]database, String productTitle);
}
