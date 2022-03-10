package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_12;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
