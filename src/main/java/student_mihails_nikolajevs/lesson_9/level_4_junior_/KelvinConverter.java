package student_mihails_nikolajevs.lesson_9.level_4_junior_;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature + 273.15);
    }
}
