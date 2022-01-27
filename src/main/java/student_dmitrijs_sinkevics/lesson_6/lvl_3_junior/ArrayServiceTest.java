package student_dmitrijs_sinkevics.lesson_6.lvl_3_junior;


import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsNumberTest();
        test.DoesNotContainNumberTest();
        test.containsNumberOccurrencesTest();
        test.doesNotContainsNumberOccurrencesTest();
        test.replaceFirstNumberTest();
        test.doesNotReplaceFirstNumberTest();
        test.replaceAllTest();
        test.doesNotReplaceAllTest();
        test.revertTest();
        test.sortTest();
    }

    public void containsNumberTest() {
        int numberToSearch = 1;
        int[] arr = {1, 2, 3, 4,};
        ArrayService service = new ArrayService();
        boolean realResult = service.contains(arr, numberToSearch);
        if (realResult)
            System.out.println("containsNumberTest is OK");
        else
            System.out.println("containsNumberTest is failed");
    }

    public void DoesNotContainNumberTest() {
        int numberToSearch = -1;
        int[] arr = {1, 2, 3, 4,};
        ArrayService service = new ArrayService();
        boolean realResult = service.contains(arr, numberToSearch);
        if (!realResult)
            System.out.println("DoesNotContainNumberTest is OK");
        else
            System.out.println("DoesNotContainNumberTest is failed");
    }

    public void containsNumberOccurrencesTest() {
        int numberToSearch = 3;
        int[] arr = {1, 2, 3, 3,};
        int expectedResult = 2;
        ArrayService service = new ArrayService();
        int realResult = service.countOccurrences(arr, numberToSearch);
        if (realResult == expectedResult)
            System.out.println("containsNumberOccurrencesTest is OK");
        else
            System.out.println("contannsNumberOccurrencesTest is failed");
    }

    public void doesNotContainsNumberOccurrencesTest() {
        int numberToSearch = 4;
        int[] arr = {1, 2, 3, 3,};
        int expectedResult = 0;
        ArrayService service = new ArrayService();
        int realResult = service.countOccurrences(arr, numberToSearch);
        if (realResult == expectedResult)
            System.out.println("doesNotContainsNumberOccurrencesTest is OK");
        else
            System.out.println("doesNotContainsNumberOccurrencesTest is failed");
    }

    public void replaceFirstNumberTest(){
        int numberToReplace=1;
        int[] arr={2, 3, 4, 5, 1, 1};
        int newNumber=100;
        ArrayService service=new ArrayService();
        boolean realResult=service.replaceFirst(arr, numberToReplace, newNumber);
        if (realResult) {
            System.out.println("replaceFirstNumberTest is OK");
            System.out.println(Arrays.toString(arr));
        }
        else
            System.out.println("replaceFirstNumberTest is failed");
    }


    public void doesNotReplaceFirstNumberTest(){
        int numberToReplace=7;
        int[] arr={2, 3, 4, 5, 1, 1};
        int newNumber=100;
        ArrayService service=new ArrayService();
        boolean realResult=service.replaceFirst(arr, numberToReplace, newNumber);
        if (!realResult) {
            System.out.println("doesNotReplaceFirstNumberTest is OK");
            System.out.println(Arrays.toString(arr));
        }
        else
            System.out.println("doesNotReplaceFirstNumberTest is failed");
    }

    public void replaceAllTest(){
        int numberToReplace=1;
        int[] arr={2, 3, 4, 5, 1, 1};
        int newNumber=100;
        int expectedResult=2;
        ArrayService service=new ArrayService();
        int realResult=service.replaceAll(arr, numberToReplace, newNumber);
        if (expectedResult==realResult) {
            System.out.println("replaceAllTest is OK");
            System.out.println(Arrays.toString(arr));
        }
        else
            System.out.println("replaceAllTest is failed");
    }

    public void doesNotReplaceAllTest(){
        int numberToReplace=7;
        int[] arr={2, 3, 4, 5, 1, 1};
        int newNumber=100;
        int expectedResult=0;
        ArrayService service=new ArrayService();
        int realResult=service.replaceAll(arr, numberToReplace, newNumber);
        if (expectedResult==realResult) {
            System.out.println("doesNotReplaceAllTest is OK");
            System.out.println(Arrays.toString(arr));
        }
        else
            System.out.println("doesNotReplaceAllTest is failed");
    }

    public void revertTest(){
        int[] arr={1,2,3,4,5};
        int[] expectedResult={5,4,3,2,1};
        ArrayService service=new ArrayService();
        service.revert(arr); //realResult
        if (Arrays.equals(expectedResult,arr)) {
            System.out.println("revertTest is OK");
            System.out.println(Arrays.toString(arr));
        }
        else
            System.out.println("revertTest is fail");
    }

    public void sortTest(){
        int[] arr={2,3,5,4,1};
        int[] expectedResult={1,2,3,4,5};
        ArrayService service=new ArrayService();
        service.sort(arr);
        if(Arrays.equals(expectedResult,arr)){
            System.out.println("sortTest is OK");
            System.out.println(Arrays.toString(arr));
        }
        else
            System.out.println("sortTest is fail");
    }


}