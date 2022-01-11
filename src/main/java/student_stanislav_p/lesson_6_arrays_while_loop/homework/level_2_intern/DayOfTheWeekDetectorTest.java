package student_stanislav_p.lesson_6_arrays_while_loop.homework.level_2_intern;

public class  DayOfTheWeekDetectorTest {

        public static void main(String[] args) {
            String [] listOfDay= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday","Not correct day number" };
            String [] listOfExpectedDay= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday","Not correct day number"};


            DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

            for (int i = 0; i < 8; i++) {

                test.shouldReturnDayOfWeek(i,listOfDay,listOfExpectedDay);
            }
        }

        public void shouldReturnDayOfWeek(int i, String [] listOfDay, String [] listOfExpectedDay) {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            String dayOfTheWeek = detector.findDayOfTheWeek(i+1);
            checkTestResult(listOfDay[i].equals(dayOfTheWeek), listOfExpectedDay[i]);
        }

        private void checkTestResult(boolean condition, String testName) {
            if (condition) {
                System.out.println(testName + " = OK!");
            } else {
                System.out.println(testName + " = FAIL!");
            }
        }


}
