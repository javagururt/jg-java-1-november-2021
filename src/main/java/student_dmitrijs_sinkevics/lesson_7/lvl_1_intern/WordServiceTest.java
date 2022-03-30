package student_dmitrijs_sinkevics.lesson_7.lvl_1_intern;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.testFindMostFrequentWord();
        test.testWordCountCalculator();
    }

    public void testFindMostFrequentWord() {
        WordService testFindMostFrequentWordInString = new WordService();
        String expectedResult = "(coconut) repeated 3 times";
        String realResult = testFindMostFrequentWordInString.findMostFrequentWord("apple banana banana coconut coconut coconut");
        if (realResult.equals(expectedResult)) {
            System.out.println("testFindMostFrequentWord is OK");
        } else {
            System.out.println("testFindMostFrequentWord is FAIL");
        }
    }

    public void testWordCountCalculator() {
        WordService calculator = new WordService();
        String[] testCountArray = {"apple", "banana", "banana", "coconut", "coconut", "coconut"};
        int expectedResult = 3;
        int realResult = calculator.wordCountCalculator(testCountArray, "coconut");
        if (realResult == expectedResult) {
            System.out.println("testWordCountCalculator is OK");
        } else {
            System.out.println("testWordCountCalculator is FAIl");
        }
    }
}
