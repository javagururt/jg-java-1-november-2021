package teacher.lesson_15.dependency;

import java.util.List;
import java.util.Optional;

class UserRepository implements Repository<UserEntity> {
    @Override
    public void save(UserEntity entity) {

    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public Optional<UserEntity> findById() {
        return Optional.empty();
    }
}
