package student_stanislav_p.lesson_9_interfaces.homework.level_4_junior;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return (1.8 * celsiusTemperature + 32);
    }
}
