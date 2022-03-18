package student_eduards_puzirevskis.lesson_15.level_2_intern;

import java.util.Objects;

class Trader {

     private String fullName;
     private String city;

     public Trader(String name, String city) {
         this.fullName = name;
         this.city = city;
     }

     public String getFullName() {
         return this.fullName;
     }

     public String getCity() {
         return this.city;
     }

     public String toString() {
         return "Trader:"+this.fullName + " in " + this.city;
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
