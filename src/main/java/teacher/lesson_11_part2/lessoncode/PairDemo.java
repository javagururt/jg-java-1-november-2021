package teacher.lesson_11_part2.lessoncode;

import java.math.BigDecimal;

class PairDemo {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setLeft("A");
        pair.setRight(123);

        Pair<BigDecimal, Boolean> pair1 = new Pair<>();
        pair1.setLeft(BigDecimal.ONE);
        pair1.setRight(true);
    }
}
