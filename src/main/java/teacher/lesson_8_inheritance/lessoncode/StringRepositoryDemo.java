package teacher.lesson_8_inheritance.lessoncode;

class StringRepositoryDemo {

    public static void main(String[] args) {
        StringRepository repository = new StringRepository();
        repository.add("Hello");
        repository.printInformation();
        System.out.println();
        repository.add("World");
        repository.printInformation();
        System.out.println();
        repository.add("!");
        repository.printInformation();

    }
}
