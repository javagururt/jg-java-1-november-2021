package student_mihails_nikolajevs.lesson_9.level_3_junior_.task_7_;

import teacher.annotations.CodeReview;

// interface ProductDatabase Не ЯВЛЯЕТСЯ ФУНКЦИОНАЛЬНЫМ!
@CodeReview(approved = true)
public interface ProductDatabase {
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
