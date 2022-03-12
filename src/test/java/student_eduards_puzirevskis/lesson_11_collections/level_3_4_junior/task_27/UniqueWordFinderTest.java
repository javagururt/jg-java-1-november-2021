package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior.task_27;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordFinderTest {
    UniqueWordFinder wordFinder = new UniqueWordFinder();

    @Test
    public void find() {
        String text = "Привет! Как у тебя у тебя у тебя дела?";
        Set<String> actual = wordFinder.find(text);
        Set<String> expected = Set.of("привет","как","у","тебя","дела");
        assertEquals(expected,actual);
    }
}