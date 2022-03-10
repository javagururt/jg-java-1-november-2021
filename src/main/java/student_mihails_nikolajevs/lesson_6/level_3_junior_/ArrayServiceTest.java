package student_mihails_nikolajevs.lesson_6.level_3_junior_;

import java.util.Arrays;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.containsNumberTest();
        test.doesNotContainsNumberTest();
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
        int[] arr = {1, 2, 3, 4, 5};
        ArrayService service = new ArrayService();
        boolean realResult = service.contains(arr, numberToSearch);
        if (realResult) {
            System.out.println("ContainsNumberTest is SUCCESS");
        } else {
            System.out.println("ContainsNumberTest is FAILED");
        }
    }

    public void doesNotContainsNumberTest() {
        int numberToSearch = -1;
        int[] arr = {1, 2, 3, 4, 5};
        ArrayService service = new ArrayService();
        boolean realResult = service.contains(arr, numberToSearch);
        if (!realResult) {
            System.out.println("DoesNotContainsNumberTest is SUCCESS");
        } else {
            System.out.println("DoesNotContainsNumberTest is FAILED");
        }
    }

    public void containsNumberOccurrencesTest() {
        int numberToSearch = 4;
        int[] arr = {1, 2, 4, 4};
        int expectedResult = 2;
        ArrayService service = new ArrayService();
        int realResult = service.countOccurrences(arr, numberToSearch);
        if (realResult == expectedResult) {
            System.out.println("ContainsNumberOccurrencesTest is SUCCESS");
        } else {
            System.out.println("ContainsNumberOccurrencesTest is FAILED");
        }

    }

    public void doesNotContainsNumberOccurrencesTest() {
        int numberToSearch = 4;
        int[] arr = {1, 2, 3, 4};
        int expectedResult = 1;
        ArrayService service = new ArrayService();
        int realResult = service.countOccurrences(arr, numberToSearch);
        if (realResult == expectedResult) {
            System.out.println("DoesNotContainsNumbersOccurrencesTest is SUCCESS");
        } else {
            System.out.println("DoesNotContainsNumbersOccurrencesTest is FAILED");

        }
    }

    public void replaceFirstNumberTest() {
        int numberToReplace = 1;
        int[] arr = {2, 1, 4, 4, 1};
        int newNumber = 50;
        ArrayService service = new ArrayService();
        boolean realResult = service.replaceFirst(arr, numberToReplace, newNumber);
        if (realResult) {
            System.out.println("ReplaceFirstNumberTest is SUCCESS");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("ReplaceFirstNumberTest is FAILED");
        }
    }
    public void doesNotReplaceFirstNumberTest() {
        int numberToReplace = 5;
        int[] arr = {2, 1, 4, 4, 1};
        int newNumber = 50;
        ArrayService service = new ArrayService();
        boolean realResult = service.replaceFirst(arr, numberToReplace, newNumber);
        if (!realResult) {
            System.out.println("DoesNotReplaceFirstNumberTest is SUCCESS");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("DoesNotReplaceFirstNumberTest is FAILED");
        }
    }
    public void replaceAllTest() {
        int numberToReplace = 1;
        int[] arr ={2, 3, 5, 1, 1};
        int newNumber = 50;
        int expectedResult = 2;
        ArrayService service = new ArrayService();
        int realResult = service.replaceAll(arr, numberToReplace, newNumber);
        if (expectedResult==realResult) {
            System.out.println("ReplaceAllTest is SUCCESS");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("ReplaceAllTest is FAILED");
        }

    }
    public void doesNotReplaceAllTest() {
        int numberToReplace = 5;
        int[] arr ={2, 3, 5, 5, 1};
        int newNumber = 50;
        int expectedResult = 2;
        ArrayService service = new ArrayService();
        int realResult = service.replaceAll(arr, numberToReplace, newNumber);
        if (expectedResult==realResult) {
            System.out.println("DoesNotReplaceAllTest is SUCCESS");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("DoesNotReplaceAllTest is FAILED");
        }
    }
    public void revertTest() {
        int[] arr ={1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        ArrayService service = new ArrayService();
        service.revert(arr);
        if (Arrays.equals(expectedResult,arr)) {
            System.out.println("RevertTest is SUCCESS");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("RevertTest is FAILED");
        }
    }
    public void sortTest() {
        int[] arr = {4, 2, 3, 5, 1};
        int[] expectedResult = {1, 2, 3, 4, 5};
        ArrayService service = new ArrayService();
        service.sort(arr);
        if (Arrays.equals(expectedResult, arr)) {
            System.out.println("SortTest is SUCCESS");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("SortTest is FAILED");
        }
    }
}