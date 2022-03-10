package student_eduards_puzirevskis.lesson_9_interfaces.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
