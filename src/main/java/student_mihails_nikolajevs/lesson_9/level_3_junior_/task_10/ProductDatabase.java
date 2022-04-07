package student_mihails_nikolajevs.lesson_9.level_3_junior_.task_10;

import java.util.Optional;

import teacher.annotations.CodeReview;

/*
предыдущем задании вы познакомились с классом Optional и узнали для чего он применяется.

Примените Optional для возвращаемого значения метода findByTitle() интерфейса ProductDatabase.
Реализуйте новую версию интерфейса и протестируйте её
 */
@CodeReview(approved = true)
public interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(Product[] base , String productTitle);

}
