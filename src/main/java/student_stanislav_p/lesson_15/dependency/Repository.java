package student_stanislav_p.lesson_15.dependency;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    void save(T entity);

    List<T> findAll();

    Optional<T> findById();

}
