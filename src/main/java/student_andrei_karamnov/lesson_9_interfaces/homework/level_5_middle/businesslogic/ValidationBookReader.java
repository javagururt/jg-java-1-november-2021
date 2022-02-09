package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.businesslogic;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.domain.Book;

import java.util.Arrays;

public class ValidationBookReader {




    public boolean validate(Book book){
       String title = book.getTitle();
       String author = book.getAuthor();
       if (isNotValidTitle(title)){
           return false;
       }
       if (isNotValidAuthor(author)){
           return false;
       }
       return true;
    }

    public boolean validateForDublicate(Book[]array, Book book) {
        for (int i = 0; i < array.length; i++) {
           if (array[i].getTitle().equals(book.getTitle()) &&
                   array[i].getAuthor().equals(book.getAuthor())){
                return false;
           }
        }
        return true;
    }
    public boolean validateForDelete (Book[]array, Book book){
        for (int i = 0; i < array.length; i++) {
            if (array[i].getTitle().equals(book.getTitle()) &&
                    array[i].getAuthor().equals(book.getAuthor())) {
                return true;
            }
        }
        return false;
    }
    private boolean isNotValidTitle(String title){
        if (title == null){
            return  true;
        }
        return  false;
    }
    private boolean isNotValidAuthor(String author){
        if (author == null){
            return true;
        }
        return false;
    }
}

