package student_valeriia_kulikova.lesson_9_interfaces.homework.level_4_junior;

public class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
