package teacher.lesson_15.generics;

import java.util.List;

class ToStringCollectorDemo {

    public static void main(String[] args) {
        ToStringCollector toStringCollector = new ToStringCollector();
        List<Book> books = List.of(new Book(), new Book(), new Book());
        List<String> toStrings = toStringCollector.toStrings(books);
    }
}
