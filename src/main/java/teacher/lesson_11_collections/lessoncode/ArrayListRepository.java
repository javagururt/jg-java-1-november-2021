package teacher.lesson_11_collections.lessoncode;

import java.util.ArrayList;
import java.util.List;

class ArrayListRepository implements StringRepository {

    private List<String> database = new ArrayList<>();

    @Override
    public void save(String text) {
        database.add(text);
    }
}
