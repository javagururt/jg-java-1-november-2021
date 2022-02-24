package student_dmitrijs_sinkevics.lesson_9.lvl_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.ifTest();
        test.switchTest();
        test.arrayTest();
    }

    public void ifTest() {
        int number = 5;
        String expectedResult="Friday";
        DayOfTheWeekDetectorIfVersion ifVersion=new DayOfTheWeekDetectorIfVersion();
        String realResult=ifVersion.detectDayName(5);
        if (realResult.equals(expectedResult))
            System.out.println("ifTest is OK");
        else
            System.out.println("ifTest is FAIL");
    }

    public void switchTest(){
        int number=5;
        String expectedResult="Friday";
        DayOfTheWeekDetectorSwitchVersion switchVersion=new DayOfTheWeekDetectorSwitchVersion();
        String realResult=switchVersion.detectDayName(5);
        if (realResult.equals(expectedResult))
            System.out.println("switchTest is OK");
        else
            System.out.println("switchTest is FAIL");
    }

    public void arrayTest(){
        int number=5;
        String expectedResult="Friday";
        DayOfTheWeekDetectorArrayVersion arrayVersion=new DayOfTheWeekDetectorArrayVersion();
        String realResult=arrayVersion.detectDayName(5);
        if (realResult.equals(expectedResult))
            System.out.println("arrayTest is OK");
        else
            System.out.println("arrayTest is FAIL");
    }

}
