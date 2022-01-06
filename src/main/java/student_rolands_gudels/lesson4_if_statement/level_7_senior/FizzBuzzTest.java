package student_rolands_gudels.lesson4_if_statement.level_7_senior;
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.ThreeTest();
        fizzBuzzTest.FiveTest();
        fizzBuzzTest.Fizz();
        fizzBuzzTest.Buzz();
        fizzBuzzTest.FizzBuzz();
        fizzBuzzTest.Else();

    }
    void ThreeTest(){
        Task_22.FizzBuzz fizzBuzz = new Task_22.FizzBuzz();
        boolean expected = true;
        boolean actual = fizzBuzz.isDividedByThree(6);
        if (expected==actual) {
            System.out.println("Test Three PASSED");
        } else {
            System.out.println("Test Three FAILED"+ " actual: "+actual+" expected"+expected);
        }
    }


    void Fizz(){
        Task_22.FizzBuzz fizzBuzz = new Task_22.FizzBuzz();
        trueFalse("Fizz","Fizz", fizzBuzz.detect(9));
    }
    void Buzz(){
        Task_22.FizzBuzz fizzBuzz = new Task_22.FizzBuzz();
        trueFalse("Buzz","Buzz", fizzBuzz.detect(10));
    }
    void FizzBuzz(){
        Task_22.FizzBuzz fizzBuzz = new Task_22.FizzBuzz();
        trueFalse("FizzBuzz","FizzBuzz", fizzBuzz.detect(30));
    }

    void Else(){
        Task_22.FizzBuzz fizzBuzz = new Task_22.FizzBuzz();
        if (fizzBuzz.detect(2).equals("2")){
            System.out.println("Test Else Passed");
        } else System.out.println("Test else failed");
    }

    void FiveTest(){
        Task_22.FizzBuzz fizzBuzz = new Task_22.FizzBuzz();
        boolean expected = true;
        boolean actual = fizzBuzz.isDividedByFive(15);
        if (expected==actual) {
            System.out.println("Test Five PASSED");
        } else {
            System.out.println("Test Five FAILED"+ " actual: "+actual+" expected"+expected);
        }
    }


    static void trueFalse(String testName,String expected,String actual){
        if (expected==actual) {
            System.out.println(testName + " PASSED");
        } else {
            System.out.println(testName+ " FAILED"+ " actual: "+actual+" expected"+expected);
        }
    }
}
