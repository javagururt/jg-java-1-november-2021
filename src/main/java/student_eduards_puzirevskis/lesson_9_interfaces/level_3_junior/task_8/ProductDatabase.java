package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_8;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface ProductDatabase {

    void save(Product product);

    //Product findByTitle(String productTitle);
    Product findByTitle(Product[] products, String productTitle);

}
