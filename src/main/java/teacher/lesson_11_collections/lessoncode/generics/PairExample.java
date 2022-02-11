package teacher.lesson_11_collections.lessoncode.generics;

class PairExample {

    public static void main(String[] args) {
        Pair<String, Integer> firstPair = new Pair<>("Ruslan", 30);

        Pair<User, Double> secondPair = new Pair<>(new User(), 123.31);

        firstPair.setLeft(25);
    }
}
