package student_artyom_shvegzhda.lesson_5_arrays_for_loop.lessoncode;

class WhileLoopExample {

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 100) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("After loop:");
        System.out.println(counter);
    }
}
