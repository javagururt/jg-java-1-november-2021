package student_dmitrijs_sinkevics.lesson_3.lvl_4_junior;

import teacher.annotations.CodeReview;

/*Найти ошибку в коде.
    Исправить и запустить программу.
    Менять можно только класс Book.

     */
@CodeReview(approved = true)
    class Book {

        private String title;

        public Book (String title){

            this.title = title;
        }

        public String getTitle () {
            return title;
        }

        public void setModel(String title) {
            this.title = title;
        }

        }

    class BookDemo {

        public static void main(String[] args) {
            Book myBook = new Book("Principles");
            String bookTitle = myBook.getTitle();
            System.out.println("Book title = " + bookTitle);
        }

    }


