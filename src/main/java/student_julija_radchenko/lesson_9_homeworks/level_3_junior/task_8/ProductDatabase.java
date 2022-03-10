package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_8;

public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
