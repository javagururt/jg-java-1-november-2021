package student_stanislav_p.lesson_15.dependency;



class UIMenu {

    private final UserDataRetrieveService retrieveService; //interface
    private final ToDoUpdateService toDoUpdateService;

    UIMenu(UserConsole userConsole, ToDoUpdateService toDoUpdateService) {
        this.retrieveService = userConsole;
        this.toDoUpdateService = toDoUpdateService;
    }


    void startUI() {
        String title = retrieveService.retrieveTitle();
        ToDoEntity entity = new ToDoEntity(title);

        toDoUpdateService.update(entity);
    }
}
