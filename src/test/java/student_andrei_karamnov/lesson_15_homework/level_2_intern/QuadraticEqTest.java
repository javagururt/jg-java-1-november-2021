package student_andrei_karamnov.lesson_15_homework.level_2_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    QuadraticEq victim = new QuadraticEq();

    @Test
    public void shouldNotFindRoots(){
        String actual = victim.calc(2,-3,4);
        String expected = "Equation has no roots";
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindOneRoot(){
        String actual = victim.calc(9,6,1);
        String expected = "x = " + -6/(2*9d);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindTwoRoots(){
        String actual = victim.calc(2,-3,1);
        String expected = "x1 = " + 0.5 + ", x2 = " + 1d;
        assertEquals(expected, actual);
    }


}