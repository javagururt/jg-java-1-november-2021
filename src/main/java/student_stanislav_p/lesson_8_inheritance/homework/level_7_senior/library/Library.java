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

Автор - список (индекс, имя автора)  ->

Книга - список (индекс книги, автор (индекс из списка авторов), год издания) ->

Каталог - список (индекс каталога, книга (индекс из списка книг), зарезервирована (да/нет), в наличии (да/нет), дата возврата, индекс читателя)

Список выданных книг - список (индекс книги из каталога, индекс читателя из списка, дата возврата)

-----

Читатели - список (индекс читателя, персональный код, дата последней активности)

-----

Библиотека:

- добавить автора в список (класс Автор)
- добавить книгу в список (класс Книга)
- добавить книгу в каталог (возможно несколько раз поскольку книга может быть не в одном экземплояре) (класс Каталог)
- добавить читателя в список (класс Читатель)
- зарезервировать книгу в катаоге для читателя (класс каталог)
- выдать книгу для читателя и отметить дату возврата (класс каталог, класс читатель, класс список выданных книг)
- выписать штраф читателю (класс список выданных книг, класс спислк читателей)






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



    private void addBook(Book tempBook){}

    private Book AddNewBook(){}


    private void showBooks(){    }


}

class Readers

public class Library {
    private int catalogNumber;
    private int authorIndex;
    private Catalog[] listOfTheBook;

    Catalog mainCatalog = new Catalog();

    private void menu(){}

    private




}

 */


