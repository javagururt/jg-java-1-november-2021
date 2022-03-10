package student_eduards_puzirevskis.lesson_9_interfaces.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature;
    }
}
