package student_dmitrijs_sinkevics.lesson_9.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
