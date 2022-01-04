package student_rolands_gudels.lesson4_if_statement.level_7_senior;
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.ThreeTest();
        fizzBuzzTest.FiveTest();

    }
    void ThreeTest(){
        Task_22.FizzBuzz fizzBuzz = new Task_22.FizzBuzz();
        boolean expected = true;
        boolean actual = fizzBuzz.isDividedByThree(6);
        if (expected==actual) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED"+ " actual: "+actual+" expected"+expected);
        }
    }

    void FiveTest(){
        Task_22.FizzBuzz fizzBuzz = new Task_22.FizzBuzz();
        boolean expected = true;
        boolean actual = fizzBuzz.isDividedByFive(15);
        if (expected==actual) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED"+ " actual: "+actual+" expected"+expected);
        }
    }


    void trueFalse(String testName,String expected,String actual){
        if (expected==actual) {
            System.out.println(testName + " PASSED");
        } else {
            System.out.println(testName+ " FAILED"+ " actual: "+actual+" expected"+expected);
        }
    }
}
