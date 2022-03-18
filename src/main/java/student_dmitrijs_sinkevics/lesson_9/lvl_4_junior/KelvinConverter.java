package student_dmitrijs_sinkevics.lesson_9.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
