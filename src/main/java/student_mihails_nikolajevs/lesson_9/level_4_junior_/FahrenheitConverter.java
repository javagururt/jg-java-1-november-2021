package student_mihails_nikolajevs.lesson_9.level_4_junior_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return (1.8 * celsiusTemperature + 32);
    }
}
