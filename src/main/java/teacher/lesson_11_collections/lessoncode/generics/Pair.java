package teacher.lesson_11_collections.lessoncode.generics;

class Pair<R, L> {

    private R right;
    private L left;


    public Pair(R right, L left) {
        this.right = right;
        this.left = left;
    }

    public R getRight() {
        return right;
    }

    public void setRight(R right) {
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }
}
