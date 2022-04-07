package student_mihails_nikolajevs.lesson_9.level_4_junior_;

import teacher.annotations.CodeReview;

/*
Сайт прогноза погоды на данный момент показывает
температуру в градусах по цельсию.
Для выхода на международный рынок сайту нужно
уметь конвертировать температуру в кельвины и форенгейты.
Попробуйте самостоятельно спроектировать (придумать)
и реализовать решение для данной задачи.
 */
@CodeReview(approved = true)
class WeatherTemperatureCelsiusConverter implements TemperatureConverter {

      @Override
      public double convert(double celsiusTemperature) {
          return celsiusTemperature;
      }
}
