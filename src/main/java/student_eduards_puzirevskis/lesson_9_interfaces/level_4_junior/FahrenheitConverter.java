package student_eduards_puzirevskis.lesson_9_interfaces.level_4_junior;

 class FahrenheitConverter implements TemperatureConverter {
     @Override
     public double convert(double celsiusTemperature) {
         return 1.8 * celsiusTemperature + 32;
     }
 }
