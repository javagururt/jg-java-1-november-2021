package student_eduards_puzirevskis.lesson_11_collections.level_1_intern.task_5;

import java.util.Objects;

class Book {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

}
