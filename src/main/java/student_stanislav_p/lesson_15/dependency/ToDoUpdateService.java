package student_stanislav_p.lesson_15.dependency;



class ToDoUpdateService {

    private final ToDoValidationService validationService;
    private final Repository<ToDoEntity> repository; // interface

    ToDoUpdateService(ToDoValidationService validationService, Repository<ToDoEntity> repository) {
        this.validationService = validationService;
        this.repository = repository;
    }

    void update(ToDoEntity entity) {
        validationService.validate(entity);

        String entityTitle = entity.getTitle();
        String upperCaseTitle = entityTitle.toUpperCase();
        entity.setTitle(upperCaseTitle);

        repository.save(entity);
    }
}
