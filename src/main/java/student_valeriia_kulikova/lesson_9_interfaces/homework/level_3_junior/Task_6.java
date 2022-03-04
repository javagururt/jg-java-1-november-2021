package student_valeriia_kulikova.lesson_9_interfaces.homework.level_3_junior;

public class Task_6 {
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }
}
// функциональный интерфейс - это интерфейс, который содержит только 1 не реализованный метод.
// Функциональный интерфейс можно написать самостоятельно или воспользоваться уже существующей базой функциональных интерфейсов
// не обязательной частью, но желательной является написание аннотации "@FunctionalInterface".
