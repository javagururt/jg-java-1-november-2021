package student_julija_radchenko.lesson_9_homeworks.level_3_junior.task_12;

public class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
