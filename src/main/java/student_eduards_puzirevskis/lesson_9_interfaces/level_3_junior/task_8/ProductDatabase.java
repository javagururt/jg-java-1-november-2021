package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_8;

 interface ProductDatabase {

    void save(Product product);

    //Product findByTitle(String productTitle);
    Product findByTitle(Product[] products, String productTitle);

}
