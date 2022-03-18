package student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria;



import java.util.ArrayList;
import java.util.List;



public class BookForSearchDatabaseImpl implements BookForSearchDatabase {

    List<BookForSearch> list = new ArrayList<>();

    @Override
    public Long save(BookForSearch book) {
        list.add(book);
        return book.getId();
    }



    @Override
    public int countAllBooks() {
        int count = list.size();
        return count;
    }

    @Override
    public List<BookForSearch> find(SearchCriteria searchCriteria) {
        List<BookForSearch> newCollection = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (searchCriteria.equals(list.get(i).getAuthor()) ||
                    searchCriteria.equals(list.get(i).getTitle()) ||
                    searchCriteria.equals(list.get(i).getYearOfIssueToSearch())) {
                    newCollection.add(list.get(i));
                System.out.println(list.get(i));
            }
        }
        return newCollection;
    }
}
