package student_andrei_karamnov.lesson_4_if_statement.level_7_senior;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.regularYearIfNotDevidedBy4();

    }
    public void regularYearIfNotDevidedBy4(){
        boolean expectedResult = false;
        LeapYear leapYearTest = new LeapYear();
        boolean realResult = leapYearTest.isLeapYear(2);
        if (expectedResult == realResult){System.out.println("Test complited");
        }
        else {System.out.println("Test FAILED");
        }
}}
