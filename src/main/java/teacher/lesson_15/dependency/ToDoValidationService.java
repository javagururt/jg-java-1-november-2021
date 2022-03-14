package teacher.lesson_15.dependency;

class ToDoValidationService {

    void validate(ToDoEntity toDoEntity) {
        if (toDoEntity.getTitle().isBlank()) {
            throw new IllegalArgumentException("Incorrect title");
        }
    }
}
