package student_andrei_karamnov.lesson_7_encapsulation.homework.level_5_middle;

class PowerCalculator {
    double power(double number, double powNumber){
        double result = 1;
        if (powNumber >= 0) {
        for (double i = 1; i <= powNumber; i++){
            result = result * number;
        }
        }else{
            result = 1 / number;
            number = result;
            powNumber = powNumber * -1;
            for (double i = 1; i < powNumber ; i++) {
                result = result * number;
            }
        }
        result = Math.round(result * 1000.0) / 1000.0; // округляю до 3 цифр после запятой
        return result;
    }
    }



