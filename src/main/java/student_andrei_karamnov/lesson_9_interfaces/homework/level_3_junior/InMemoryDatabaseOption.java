package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

import java.util.Optional;

public class InMemoryDatabaseOption implements ProductDatabaseOption{
    private Product[] database;

    public InMemoryDatabaseOption() {
        database = new Product[0];
    }

    public Product[] getDatabase() {
        return database;
    }
    @Override
    public void save2(Product product){
        Product[] newDatabase = new Product[database.length + 1];
        for (int i = 0; i < database.length; i++) {
            newDatabase[i] = database[i];
        }
        newDatabase[database.length] = product;
        database = newDatabase;
    }

    @Override
    public Optional<Product> findByTitle2(Product[]database, String productTitle){
        for (int i = 0; i < database.length; i++) {
            if(database[i].getTitle().equals(productTitle)){

                return Optional.of(database[i]);
            }
        }
        return Optional.ofNullable(null);
    }
    }

