package student_stanislav_p.lesson_8_inheritance.homework.level_7_senior.library;
/*

Разработать доменную модель для электронной системы управления библиотекой.
Доменная модель должна в будущем давать возможность поддерживать следующие операции:
- взять книгу из библиотеки;
- вернуть книгу в библиотеку;
- поиск нужной книги;
- резервация книги;
- рассылка оповещений читателям о сроке сдачи книги в библиотеку;
- выписывание штрафов за вовремя не сданные книги;
- добавление новой книги в библиотеку.

В рамках данной задачи нужно только попробовать разработать модель
данных (pojo Plain Old Java Object классы), которые будут описывать данные, которые нужны для
реализации указанных выше операций. Можно создать модель, которая будет
поддерживать только часть указанных выше операций.


Структура классов:
========================================================



class Author {
    int authorID;
    String  Author;

}


 class Book {
    private Author author;
    private String title;
    private int year;
    private int pages;
}

 class Catalog (Book[] catalog){



    private void addBook(Book tempBook){

    }

    private Book AddNewBook(){

        // checkAuthor();
        // inputNewBook();


        Author tempAuthor = author(0,"");
        String tempTitle="";
        int tempYear=0;
        int tempPages=0;


        return new Book(tempAuthor, tempTitle, tempYear, tempPages);
    }

    private void showBooks(){
    }
}

public class Library {
    private int catalogNumber;
    private int authorIndex;
    private Catalog[] listOfTheBook;

    Catalog mainCatalog = new Catalog();




}

 */


