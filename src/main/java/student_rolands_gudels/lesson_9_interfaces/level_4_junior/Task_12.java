package student_rolands_gudels.lesson_9_interfaces.level_4_junior;

public class Task_12 {
/*    Сайт прогноза погоды на данный момент показывает
    температуру в градусах по цельсию.
    Для выхода на международный рынок сайту нужно
    уметь конвертировать температуру в кельвины и форенгейты.

    Ведущий программист для описания процесса конвертации
    температуры в градусах по цельсию в кельвины и форенгейты
    создал следующий интерфейс:

    interface TemperatureConverter {

        double convert(double celsiusTemperature);

    }

    И две имплементации данного интерфейса:

    class CelsiusConverter implements TemperatureConverter {

        @Override
        public double convert(double celsiusTemperature) {
            return celsiusTemperature;
        }

    }

    class KelvinConverter implements TemperatureConverter {

        @Override
        public double convert(double celsiusTemperature) {
            return celsiusTemperature + 273.15;
        }
    }

    Ваша задача:
            - по аналогии с классом KelvinConverter создать класс FahrenheitConverter
            (формула: 1.8 * celsiusTemperature + 32);
- написать юнит тесты для классов KelvinConverter и FahrenheitConverter.*/
}
