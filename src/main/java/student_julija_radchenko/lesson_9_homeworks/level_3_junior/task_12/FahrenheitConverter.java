package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_12;

public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
