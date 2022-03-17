package student_stanislav_p.lesson_15.inheritance;


class EntityDemo {

    public static void main(String[] args) {
        BookEntity book = new BookEntity();
        book.setId(10L);
        TransactionEntity transaction = new TransactionEntity();
        transaction.setId(20L);
    }
}
