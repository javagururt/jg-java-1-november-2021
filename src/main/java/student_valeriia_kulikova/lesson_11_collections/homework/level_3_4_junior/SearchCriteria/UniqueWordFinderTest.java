package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;

import java.util.HashSet;
import java.util.Set;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinder testFinder = new UniqueWordFinder();
        String textForFinder = "one two three two one";
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("one");
        expectedResult.add("two");
        expectedResult.add("three");

        Set<String> realResult = testFinder.find(textForFinder);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test 'Unique word finder' is OK.");
        } else {
            System.out.println("Test 'Unique word finder' is FALSE.");
        }
    }
}
