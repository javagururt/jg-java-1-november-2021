package student_andrei_karamnov.lesson_11_collection.homework.level_1_intern;
/*Создайте класс BookListContainsDemo в котором продемонстрируйте как
делают проверку есть ли в списке книга или её нет с помощью метода
contains(). Если для правильной работы метода contains() требуется
внести изменения в класс Book, сделайте это!

Пример:

List<Book> books = new ArrayList<>();

Book book1 = new Book("A1", "B1");
Book book2 = new Book("A2", "B2");

books.add(book1);
books.add(book2);

Book bookInTheList = new Book("A1", "B1");
boolean containsBook = books.contains(bookInTheList); // должно быть true

Book bookNotInTheList = new Book("A3", "B3");
boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false*/
public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object obj) {    //переопределяем метод equals, т.к. он используется в contains()
        Book b = (Book) obj;
        String elementTitle = this.title;
        String targetTitle = b.title;
        String elementAuthor = this.author;
        String targetAuthor = b.author;
        if (elementTitle.equals(targetTitle) && elementAuthor.equals(targetAuthor)) {
            return true;
        } else {
            return false;
        }
    }
}
