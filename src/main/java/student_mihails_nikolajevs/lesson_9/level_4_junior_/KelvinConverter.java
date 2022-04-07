package student_mihails_nikolajevs.lesson_9.level_4_junior_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature + 273.15);
    }
}
