package student_stanislav_p.lesson_8_inheritance.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV2 {
    double width = 5;
    double height = 5;
    double depth = 5;


    /**
     * Подсчитать объем коробки
     *
     * @return объем
     */
    double getVolume() {
        return width * height * depth;
    }
}

