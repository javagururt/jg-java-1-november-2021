package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int size = arrayService.getOurArraySize();
        int[] numbers = arrayService.createArray(size);
        arrayService.fillArrayWithRandomNumbers(numbers);
        arrayService.printArrayToConsole(numbers);
        int numberToFind = arrayService.whatNumberWeAreLookingFor();
        int countOccurrences = arrayService.countOccurrences(numbers, numberToFind);
        boolean searchingResult = arrayService.findingMatchInArray(numbers, numberToFind);
        arrayService.printSearchingResult(numberToFind,searchingResult, countOccurrences);
        boolean replacing = arrayService.replaceNumber(numbers, arrayService.getNumberToReplace(), arrayService.getNewNumberToInsert());
        arrayService.printReplacingResults(replacing);
        arrayService.printArrayToConsole(numbers);
    }
}
