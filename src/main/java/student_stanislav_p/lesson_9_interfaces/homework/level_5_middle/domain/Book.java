package student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.domain;

public class Book {

    private String title;
    private String author;


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString(){
        return "Book Title: "
                + title + "\nBook Author: ["
                + author + "]\n";
    }
}
