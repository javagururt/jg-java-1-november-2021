package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface SearchCriteria {

     boolean match(Book book);

     String searchCriteriaName();
}
