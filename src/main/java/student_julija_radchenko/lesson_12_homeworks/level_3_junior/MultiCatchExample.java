package student_julija_radchenko.lesson_12_homeworks.level_3_junior;
//ArithmeticException  является подклассом RuntimeException,
// который в иерархии классов java.lang стоит ниже, чем Exception.
// Сначала ловим unchecked исключения, потом checked исключения.


public class MultiCatchExample {

    public static void main( String[]args){
        try {
        } catch (ArithmeticException a) {

    } catch (Exception e){

    }

    }
}