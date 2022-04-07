package student_stanislav_p.lesson_14.homework.level_1_intern;


import java.util.Objects;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return "Apple {" +
                "color = '" + color + '\'' +
                ", weight = " + weight +
                "}\n";
    }
}
