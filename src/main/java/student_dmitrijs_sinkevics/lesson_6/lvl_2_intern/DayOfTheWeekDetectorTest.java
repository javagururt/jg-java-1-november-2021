package student_dmitrijs_sinkevics.lesson_6.lvl_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.findDayOfTheWeekTestMonday();
        test.findDayOfTheWeekTestTuesday();
        test.findDayOfTheWeekTestWednesday();
        test.findDayOfTheWeekTestThursday();
        test.findDayOfTheWeekTestFriday();
        test.findDayOfTheWeekTestSaturday();
        test.findDayOfTheWeekTestSunday();
        test.findDayOfTheWeekTestWrongNumber();

    }

    public void findDayOfTheWeekTestMonday(){
        int dayNumber=1;
        String expectedResult="Monday";
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        String realResult=detector.findDayOfTheWeek(dayNumber);
        if (expectedResult.equals(realResult))
            System.out.println("Monday test is OK");
        else
            System.out.println("Monday test is fail");
    }

    public void findDayOfTheWeekTestTuesday(){
        int dayNumber=2;
        String expectedResult="Tuesday";
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        String realResult=detector.findDayOfTheWeek(dayNumber);
        if (expectedResult.equals(realResult))
            System.out.println("Tuesday test is OK");
        else
            System.out.println("Tuesday test is fail");
    }

    public void findDayOfTheWeekTestWednesday(){
        int dayNumber=3;
        String expectedResult="Wednesday";
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        String realResult=detector.findDayOfTheWeek(dayNumber);
        if (expectedResult.equals(realResult))
            System.out.println("Wednesday test is OK");
        else
            System.out.println("Wednesday test is fail");
    }

    public void findDayOfTheWeekTestThursday(){
        int dayNumber=4;
        String expectedResult="Thursday";
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        String realResult=detector.findDayOfTheWeek(dayNumber);
        if (expectedResult.equals(realResult))
            System.out.println("Thursday test is OK");
        else
            System.out.println("Thursday test is fail");
    }

    public void findDayOfTheWeekTestFriday(){
        int dayNumber=5;
        String expectedResult="Friday";
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        String realResult=detector.findDayOfTheWeek(dayNumber);
        if (expectedResult.equals(realResult))
            System.out.println("Friday test is OK");
        else
            System.out.println("Friday test is fail");
    }

    public void findDayOfTheWeekTestSaturday(){
        int dayNumber=6;
        String expectedResult="Saturday";
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        String realResult=detector.findDayOfTheWeek(dayNumber);
        if (expectedResult.equals(realResult))
            System.out.println("Saturday test is OK");
        else
            System.out.println("Saturday test is fail");
    }

    public void findDayOfTheWeekTestSunday(){
        int dayNumber=7;
        String expectedResult="Sunday";
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        String realResult=detector.findDayOfTheWeek(dayNumber);
        if (expectedResult.equals(realResult))
            System.out.println("Sunday test is OK");
        else
            System.out.println("Sunday test is fail");
    }

    public void findDayOfTheWeekTestWrongNumber(){
        int dayNumber=8;
        String expectedResult="Not correct day number";
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        String realResult=detector.findDayOfTheWeek(dayNumber);
        if (expectedResult.equals(realResult))
            System.out.println("WrongNumber test is OK");
        else
            System.out.println("WrongNumber test is fail");
    }


}
