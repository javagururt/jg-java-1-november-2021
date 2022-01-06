package teacher.lesson_6_arrays_while_loop.lessoncode;

class StringConcatExample {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 300_000; i++) {
            str = str + "a";
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println(result + " ms");
    }
}
