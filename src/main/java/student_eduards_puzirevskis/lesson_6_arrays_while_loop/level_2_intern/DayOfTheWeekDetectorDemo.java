package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_2_intern;

 class DayOfTheWeekDetectorDemo {

      public static void main(String[] args) {

       DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          int dayNumber = detector.getDayNumberFromUser();
          String dayOfTheWeek = detector.findDayOfTheWeekNumber(dayNumber);
          System.out.println(dayOfTheWeek);
      }


}
