package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalInMemoryDatabase implements OptionalDatabase {

    private List<OptionalProduct> productList = new ArrayList<>();

    @Override
    public void save(OptionalProduct product) {
        productList.add(product);

    }

    @Override
    public Optional<OptionalProduct> findByTitle(String productTitle) {
        for (OptionalProduct listItem : productList) {
            if (listItem.getTitle().equals(productTitle)) {
            }
        }return Optional.empty();
        }

}
