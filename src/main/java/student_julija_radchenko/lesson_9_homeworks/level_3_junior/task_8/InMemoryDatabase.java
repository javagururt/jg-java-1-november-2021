package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_8;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase implements ProductDatabase {

    private List<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);

    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product listItem : productList) {
            if (listItem.getTitle().equals(productTitle)) {
                return listItem;
            }
            }return null;
        }
    }


