package teacher.lesson_15.dependency;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class ToDoRepository implements Repository<ToDoEntity> {

    private List<ToDoEntity> database = new ArrayList<>();

    public void save(ToDoEntity entity) {
        database.add(entity);
    }

    @Override
    public List<ToDoEntity> findAll() {
        return null;
    }

    @Override
    public Optional<ToDoEntity> findById() {
        return Optional.empty();
    }
}
