package student_andrei_karamnov.lesson_9_interfaces.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CelsiusConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature;
    }
}
