package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.UI_my_edition;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;

public class InputBook {

    public Book newBook(int i){

        Book newBook = new Book(("Author"+i), ("Book"+i));

        return newBook;
    }
}
