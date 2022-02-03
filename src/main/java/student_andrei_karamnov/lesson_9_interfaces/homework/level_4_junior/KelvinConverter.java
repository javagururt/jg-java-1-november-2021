package student_andrei_karamnov.lesson_9_interfaces.homework.level_4_junior;

class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
