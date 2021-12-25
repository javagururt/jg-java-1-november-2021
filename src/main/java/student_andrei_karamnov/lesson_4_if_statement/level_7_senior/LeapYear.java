package student_andrei_karamnov.lesson_4_if_statement.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    public boolean isLeapYear(int year) {
      if (year % 4 != 0){
          return false;
      }
      else if (year % 100 != 0){
          return true;
      }
      else if (year % 100 == 0 && year % 400 == 0){
          return true;
      }
        return false;
    }
}
