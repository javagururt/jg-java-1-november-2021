package student_stanislav_p.lesson_8_inheritance.level_7_senior.library.v2;

class Author {

    private int authorIndex;
    private String authorName;

    public Author(int authorIndex, String authorName) {
        this.authorIndex = authorIndex;
        this.authorName = authorName;
    }

    public int getAuthorIndex() {
        return authorIndex;
    }

    public String getAuthorName() {
        return authorName;
    }


    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "Author ID=" + authorIndex +
                ", Author name='" + authorName + '\'' +
                '}';
    }
}
