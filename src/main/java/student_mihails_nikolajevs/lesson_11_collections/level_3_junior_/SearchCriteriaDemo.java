package student_mihails_nikolajevs.lesson_11_collections.level_3_junior_;

import student_mihails_nikolajevs.lesson_11_collections.level_2_intern_.Book;

 public class SearchCriteriaDemo {

     public static void main(String[] args) {

         Book zveroboi = new Book("Fenimor Kuper", "Zveroboi" , 1841);
         Book harryPoter = new Book("Joanne Rowling" , "Harry Potter" , 1997);

         SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Fenimor Kuper");
         SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
         SearchCriteria yearCriteria = new YearOfIssueSearchCriteria( 1841);
         SearchCriteria orCriteria = new OrSearchCriteria(authorSearchCriteria,yearCriteria);
         SearchCriteria andCriteria = new AndSearchCriteria(authorSearchCriteria,titleSearchCriteria);
         SearchCriteriaDemo demo = new SearchCriteriaDemo();
         demo.printResult(zveroboi,authorSearchCriteria);
         demo.printResult(zveroboi, titleSearchCriteria);
         demo.printResult(zveroboi, yearCriteria);
     }

     private void printResult(Book book, SearchCriteria searchCriteria) {
        System.out.println("You have been looking for "
                          + book.getAuthor() + "\""
                          + book.getTitle() + "\" by "
                          + searchCriteria.searchCriteriaName());

        if (searchCriteria.match(book)) {
            System.out.println("And Result is :  Found");
        } else {
            System.out.println("And result is : NOT FOUND");
        }
     }
 }