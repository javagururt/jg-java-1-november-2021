package student_dmitrijs_sinkevics.lesson_8.lvl_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RedWine extends Wine {
    @Override
    void servingTemperature() {
        System.out.println("15-20 °C");
    }
}