package student_stanislav_p.lesson_11_collections.homework.level_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository.Book;

public class InputBook {

    public Book newBook(int i){

        Book newBook = new Book(("Author"+i), ("Book"+i));

        return newBook;
    }
}
