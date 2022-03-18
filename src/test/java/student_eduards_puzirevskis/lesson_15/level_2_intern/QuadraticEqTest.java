package student_eduards_puzirevskis.lesson_15.level_2_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    QuadraticEq victim = new QuadraticEq();


    @Test
    public void shouldNotFindRoots() {
        String actual = victim.calc(-4d,0d,-20d);
        String expected = "Equation has no roots";
        assertEquals(actual, expected);
    }

    @Test
    public void shouldFindOneRoot() {
        String actual = victim.calc(3d,-18d,27d);
        String expected = "x = " + 3d;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldFindTwoRoots() {
        String actual = victim.calc(5d,2d,-7d);
        String expected = "x1 = " + -1.4d + ", x2 = " + 1d;
        assertEquals(actual, expected);
    }
}