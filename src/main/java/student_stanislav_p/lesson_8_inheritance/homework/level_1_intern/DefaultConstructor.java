package student_stanislav_p.lesson_8_inheritance.homework.level_1_intern;

class DefaultConstructor {
    double width;
    double height;
    double depth;

    DefaultConstructor() {
        System.out.println("Конструирование объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }

    /**
     * Подсчитать объем коробки
     *
     * @return объем
     */
    double getVolume() {
        return width * height * depth;
    }
}

