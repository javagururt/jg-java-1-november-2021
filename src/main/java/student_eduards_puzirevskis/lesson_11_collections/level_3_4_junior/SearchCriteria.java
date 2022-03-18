package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface SearchCriteria {

     boolean match(Book book);

     String searchCriteriaName();
}
