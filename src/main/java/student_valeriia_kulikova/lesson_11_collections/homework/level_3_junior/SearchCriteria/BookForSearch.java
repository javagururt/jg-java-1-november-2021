package student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria;


import java.util.Objects;

public class BookForSearch {
    private Long id;
    private String title;
    private String author;
    private static long count = 1L;
    private String yearOfIssueToSearch;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        BookForSearch.count = count;
    }

    public String getYearOfIssueToSearch() {
        return yearOfIssueToSearch;
    }

    public void setYearOfIssueToSearch(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public BookForSearch(String author, String title, String year) {
        this.author = author;
        this.title = title;
        this.id = count++;
        this.yearOfIssueToSearch = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookForSearch that = (BookForSearch) o;
        return  Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(yearOfIssueToSearch, that.yearOfIssueToSearch);
    }

    @Override
    public int hashCode() {
        return Objects.hash( title, author, yearOfIssueToSearch);
    }

    @Override
    public String toString() {
        return "BookForSearch{" +

                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssueToSearch='" + yearOfIssueToSearch + '\'' +
                '}';
    }
}
