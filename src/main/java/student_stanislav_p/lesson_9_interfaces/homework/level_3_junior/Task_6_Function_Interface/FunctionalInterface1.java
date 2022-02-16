package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_6_Function_Interface;


import teacher.annotations.CodeReview;

@CodeReview(approved = true)
@FunctionalInterface
public interface FunctionalInterface1<A, B> {
    /**
     * Applies this function to the given arguments.
     *
     * @param a the first function argument
     * @param b the second function argument
     * @return the function result
     */
    int calculate(int a, int b);
}
