package student_valeriia_kulikova.lesson_9_interfaces.homework.level_4_junior;

public class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
