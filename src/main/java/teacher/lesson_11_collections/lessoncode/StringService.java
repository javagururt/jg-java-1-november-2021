package teacher.lesson_11_collections.lessoncode;

class StringService {

    private final StringRepository repository;

    StringService(StringRepository repository) {
        this.repository = repository;
    }

    void saveText(String text) {
        if (text == null) {
            return;
        }
        repository.save(text);
    }


}
