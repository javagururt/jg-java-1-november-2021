package student_stanislav_p.lesson_8_inheritance.level_7_senior.library;


class Book {
    private String author;
    private String title;
    private int year;
    private int pages;

    Book(String author, String title, int year, int pages){
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){
        return author + ". \"" + title + "\": " + year + " year, " + pages + " pages.";
    }

}