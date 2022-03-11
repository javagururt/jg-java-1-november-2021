package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior;
/*
Создайте класс SearchCriteriaDemo и с помощью
классов OrSearchCriteria и AndSearchCriteria составьте сложные условия:
- автор книги "Kuper" и название "Zveroboi"
- автор книги "Kuper" и год выпуска 1890
- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"


Пример:
SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
 */
 class SearchCriteriaDemo {

     public static void main(String[] args) {

         Book houseOfTheDragon = new Book("House of the dragon", "George Martin", 2021);
         Book it = new Book("It", "Stephen King", 1986);
         SearchCriteria authorCriteria = new AuthorSearchCriteria("Stephen King");
         SearchCriteria titleCriteria = new TitleSearchCriteria("It");
         SearchCriteria yearCriteria = new YearOfIssueSearchCriteria(2021);
         SearchCriteria orCriteria = new OrSearchCriteria(authorCriteria,yearCriteria);
         SearchCriteria andCriteria = new AndSearchCriteria(authorCriteria,titleCriteria);
         SearchCriteriaDemo demo = new SearchCriteriaDemo();
         demo.printResult(it,authorCriteria);
         demo.printResult(it, titleCriteria);
         demo.printResult(it, yearCriteria);
         demo.printResult(houseOfTheDragon,orCriteria);
         demo.printResult(houseOfTheDragon, andCriteria);
     }

     public void printResult(Book book, SearchCriteria searchCriteria) {
         System.out.println("You've been looking for "
                             + book.getAuthor() + " \""
                             + book.getTitle() + "\" by "
                             + searchCriteria.searchCriteriaName());

         if(searchCriteria.match(book)) {
             System.out.println("And result is: Found");
         } else {
             System.out.println("And result is: NOT found");
         }
         System.out.println("=============================");
     }

}
