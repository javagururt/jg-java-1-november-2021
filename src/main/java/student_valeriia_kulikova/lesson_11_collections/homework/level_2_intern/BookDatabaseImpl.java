package student_valeriia_kulikova.lesson_11_collections.homework.level_2_intern;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDatabaseImpl implements  BookDatabase {

    List<BookWithID> list = new ArrayList<>();

    @Override
    public Long save(BookWithID book) {
        list.add(book);
        return book.getId();
    }

}
