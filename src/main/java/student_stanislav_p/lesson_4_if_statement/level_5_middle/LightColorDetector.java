package student_stanislav_p.lesson_4_if_statement.level_5_middle;

import teacher.annotations.CodeReview;

/*
Функциональные требования:
Программа должна определять цвет в зависимости
от длины волны в соответствии со следующими правилами:

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")

Логика с определением цвета должна быть реализована
в отдельном классе LightColorDetector:

 */
@CodeReview(approved = true)
class LightColorDetector {

    String detect(int waveLength) {
        if (waveLength>= 380 && waveLength < 450) {
            return "Violet";
        } else if (waveLength >= 450 && waveLength <= 494) {
            return "Blue";
        } else if (waveLength>= 495 && waveLength <= 569) {
            return "Green";
        } else if (waveLength>= 570 && waveLength <= 589) {
            return "Yellow";
        } else if (waveLength >= 590 && waveLength <= 619) {
            return "Orange";
        } else if (waveLength>= 620 && waveLength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}
