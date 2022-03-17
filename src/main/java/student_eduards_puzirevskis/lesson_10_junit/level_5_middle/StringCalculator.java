package student_eduards_puzirevskis.lesson_10_junit.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StringCalculator {

 int add(String numbers) {
  String[] integersInArray = numbers.split(",|\n");
  int sumOfNumbers = 0;
  if (numbers.isBlank()) {
   return 0;
  }
  for (String valueInArray : integersInArray) {
   sumOfNumbers += Integer.parseInt(valueInArray);
  }
  return sumOfNumbers;
 }

}
