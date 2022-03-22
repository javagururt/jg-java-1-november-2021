package student_andrei_karamnov.lesson_15_homework.level_2_intern;

import java.util.Objects;

class Trader {

    String fullName;
    String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(fullName, trader.fullName) && Objects.equals(city, trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, city);
    }
}
