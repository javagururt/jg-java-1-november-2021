package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_8;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabase implements ProductDatabase {

    private Product[] database;

    public InMemoryDatabase() {
        database = new Product[0];
    }

    public Product[] getDatabase() {
        return database;
    }

    @Override
    public void save(Product product) {
        Product[] newProductsDatabase = new Product[database.length + 1];
        for (int i = 0; i < database.length; i++) {
            newProductsDatabase[i] = database[i];
        }
        newProductsDatabase[database.length] = product;
        database = newProductsDatabase;
    }

    @Override
    public Product findByTitle(Product[] database, String productTitle) {
//     public Product findByTitle(String productTitle) {
        for (int i = 0; i < database.length; i++) {
            if (database[i].getTitle().equals(productTitle)) {
                return database[i];
            }
        }
        return null;
    }

//    @Override
//    public String toString() {
//        return "InMemoryDatabase{" +
//                "database=" + Arrays.toString(database) +
//                '}';
//    }
}
