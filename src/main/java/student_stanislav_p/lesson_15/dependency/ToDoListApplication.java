package student_stanislav_p.lesson_15.dependency;


class ToDoListApplication {

    public static void main(String[] args) {
        ToDoValidationService validationService = new ToDoValidationService();
        UserConsole userConsole = new UserConsole();
        ToDoRepository toDoRepository = new ToDoRepository();
        ToDoUpdateService toDoUpdateService = new ToDoUpdateService(validationService, toDoRepository);

        UIMenu uiMenu = new UIMenu(userConsole, toDoUpdateService);
        uiMenu.startUI();
    }
}
