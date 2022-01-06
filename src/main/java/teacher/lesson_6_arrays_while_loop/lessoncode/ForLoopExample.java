package teacher.lesson_6_arrays_while_loop.lessoncode;

class ForLoopExample {

    public static void main(String[] args) {
        int max = 10;
        for (int i = 0; i < max; i++) {
            String str = i + getDelimiter(i, max);
            System.out.print(str);
        }
    }

    private static String getDelimiter(int i, int max) {
        if (i < max - 1) {
            return ",";
        }
        return ".";
    }
}
