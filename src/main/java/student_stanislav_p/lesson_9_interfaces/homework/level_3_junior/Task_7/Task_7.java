package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_7;

//Является ли следующий интерфейс функциональным?

/**
 НЕ ЯВЛЯЕТСЯ


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

interface Task_7 {

    void save(Product product);

    Product findByTitle(Product[]database, String productTitle);
}
**/