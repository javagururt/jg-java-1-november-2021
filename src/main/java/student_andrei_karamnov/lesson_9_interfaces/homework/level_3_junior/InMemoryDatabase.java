package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

import java.util.Arrays;

class InMemoryDatabase implements ProductDatabase{
    private Product[] database;

    public InMemoryDatabase() {
        database = new Product[0];
    }

    public Product[] getDatabase() {
        return database;
    }

    @Override
    public void save(Product product) {

        Product[] newDatabase = new Product[database.length + 1];
        for (int i = 0; i < database.length; i++) {
            newDatabase[i] = database[i];
        }
        newDatabase[database.length] = product;
        database = newDatabase;
    }

    @Override
    public Product findByTitle(Product[]database, String productTitle) {
        for (int i = 0; i < database.length; i++) {
            if(database[i].getTitle().equals(productTitle)){

                return database[i];
            }
        }
        return null;
    }
}
