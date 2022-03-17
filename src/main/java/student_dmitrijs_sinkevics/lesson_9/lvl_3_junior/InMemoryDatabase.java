package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class InMemoryDatabase implements ProductDatabase {

    public Product[] directory;

    public InMemoryDatabase() {
        directory = new Product[0];
    }

    public Product[] getDatabase() {
        return directory;
    }


    @Override
    public void save(Product product) {
        Product[] newDirectory = new Product[directory.length + 1];
        System.arraycopy(directory, 0, newDirectory, 0, directory.length);
        newDirectory[newDirectory.length - 1] = product;
        directory = newDirectory;
    }

    @Override
    public Product findByTitle(Product[] directory, String productTitle) {


        for (int i = 0; i < directory.length; i++) {
            if (directory[i].getTitle().equals(productTitle)) {
                return directory[i];
            }
        }
        return null;
    }
}
