package student_artyom_shvegzhda.lesson_7_encapsulation.lessoncode;

import java.util.Objects;

class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}
