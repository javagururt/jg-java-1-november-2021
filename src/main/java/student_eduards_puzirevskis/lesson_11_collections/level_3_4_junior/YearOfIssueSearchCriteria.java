package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior;

 class YearOfIssueSearchCriteria implements SearchCriteria {

  private final int yearOfIssueToSearch;

  public YearOfIssueSearchCriteria(int yearOfIssueToSearch) {
   this.yearOfIssueToSearch = yearOfIssueToSearch;
  }

  @Override
  public boolean match(Book book) {
   return book.getYearOfIssue() == this.yearOfIssueToSearch;
  }

  @Override
  public String searchCriteriaName() {
   return "Year of Issue Criteria";
  }

 }
