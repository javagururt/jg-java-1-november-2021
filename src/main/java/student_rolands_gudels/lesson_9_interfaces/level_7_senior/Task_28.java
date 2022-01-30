package student_rolands_gudels.lesson_9_interfaces.level_7_senior;

public class Task_28 {
   /* Сайт прогноза погоды на данный момент показывает
    температуру в градусах по цельсию.
    Для выхода на международный рынок сайту нужно
    уметь конвертировать температуру в кельвины и форенгейты.

    Для описания процесса конвертации
    температуры в градусах по цельсию в кельвины и форенгейты
    были созданы следующий интерфейс:

    interface TemperatureConverter {

        double convert(double celsiusTemperature);

    }

    и его имплементации:

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

    class FahrenheitConverter implements TemperatureConverter {
        @Override
        public double convert(double celsiusTemperature) {
            return 1.8 * celsiusTemperature + 32;
        }
    }

    Ваша задача:
            - придумать и реализовать решение для конвертации температуры
    из любой шкалы измерения в любую другую;
- протестировать ваше решение.

            Полсказка: для обозначения шкалы измерения в которой задана
    теспература (цельсий, кельвин, форенгейт) можно воспользоваться
    enum.

    Возможное решение: 9 реализаций интерфейса TemperatureConverter
    для конвертации любой шкалы в любую другую + реализация
    паттерна стратегия:

    key                  -> value
            (KELVIN->FAHRENHEIT) -> KelvinToFahrenheitConverter

    Протестируйте ваше решение!*/
}
