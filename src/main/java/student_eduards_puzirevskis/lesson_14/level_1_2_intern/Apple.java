package student_eduards_puzirevskis.lesson_14.level_1_2_intern;

import java.util.Objects;

class Apple {
  private final String color;
  private final int weight;

  public Apple (String color, int weight) {
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
}
