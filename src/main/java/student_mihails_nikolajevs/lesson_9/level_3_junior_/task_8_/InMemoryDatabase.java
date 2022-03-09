package student_mihails_nikolajevs.lesson_9.level_3_junior_.task_8_;



public class InMemoryDatabase implements ProductDatabase {

    private Product[] data;

    public InMemoryDatabase() {
        data = new Product[0];
    }

    public Product[] getData() {
        return data;
    }

    @Override
    public void save(Product product) {
        Product[] newProductDatabase = new Product[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newProductDatabase[i] = data[i];
        }
        newProductDatabase[data.length] = product;
        data = newProductDatabase;

    }

    @Override
    public Product findByTitle(String productTitle) {
        return null;
    }

    @Override
    public Product findByTitle(Product[] data, String productTitle) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].getTitle().equals(productTitle)) {
                return data[i];
            }
        }
        return null;
    }
}
