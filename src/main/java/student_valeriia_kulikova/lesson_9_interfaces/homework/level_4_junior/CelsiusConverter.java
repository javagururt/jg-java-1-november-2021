package student_valeriia_kulikova.lesson_9_interfaces.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CelsiusConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {

        return celsiusTemperature;
    }
}
