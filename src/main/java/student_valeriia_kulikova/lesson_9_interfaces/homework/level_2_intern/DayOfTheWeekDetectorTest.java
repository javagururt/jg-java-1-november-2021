package student_valeriia_kulikova.lesson_9_interfaces.homework.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {


        DayOfTheWeekDetectorTest allTests = new DayOfTheWeekDetectorTest();
        allTests.test1();
        allTests.test2();
        allTests.test3();

    }


    public void test1(){
        DayOfTheWeekDetectorArray dayOfTheWeekDetectorArray = new DayOfTheWeekDetectorArray();
        String result = "Monday";
        boolean testResult1 = (result == dayOfTheWeekDetectorArray.detectDayName(1));
        if (testResult1) {
            System.out.println("Test1 is OK");
        } else {
            System.out.println("Test1 is False");
        }}

    public void test2(){

        DayOfTheWeekDetectorIfVersion day = new DayOfTheWeekDetectorIfVersion();
        String result2 = "Sunday";
        boolean testResult2 = (result2 == day.detectDayName(7));
        if (testResult2) {
            System.out.println("Test2 is OK");
        } else {
            System.out.println("Test2 is False");
        }}

    public void test3(){

        DayOfTheWeekDetectorSwitch day1 = new DayOfTheWeekDetectorSwitch();
        String result3 = "Please input a valid number between 1 and 7";
        boolean testresult3 = (result3 == day1.detectDayName(8));
        if (testresult3) {
            System.out.println("Test3 is OK");
        } else {
            System.out.println("Test3 is False");
        }
    }

}
