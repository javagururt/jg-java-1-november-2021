package teacher.lesson_11_collections.lessoncode;

import java.util.Scanner;

class StringApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - array");
        System.out.println("else - array list");

        int userInput = scanner.nextInt();

        StringRepository repository = create(userInput);

        StringService service = new StringService(repository);

        service.saveText("");
    }

    private static StringRepository create(int number) {
        if (number == 1) {
            return new ArrayRepository();
        } else {
            return new ArrayListRepository();
        }
    }
}
