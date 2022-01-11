package teacher.lesson_6_arrays_while_loop.lessoncode;

class StringBuilderExample {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 300_000; i++) {
            sb.append("a");
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println(result + " ms");
    }
}
