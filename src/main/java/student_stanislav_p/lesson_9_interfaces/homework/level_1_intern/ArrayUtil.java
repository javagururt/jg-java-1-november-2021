package student_stanislav_p.lesson_9_interfaces.homework.level_1_intern;

/* Дан класс:

Создать для этого класса интерфейс ArrayUtil.
Сделать так, чтобы класс ArrayUtilImpl имплементировал созданный вами интерфейс.
Не забудьте про аннотицию @Override. Её очень желательно "вешать" на методы,
которые вляются реализацией методов объявленных в интерфейсе.
 */



public interface ArrayUtil {

    public int[] createArray(int arrayLength);

    public void fillArrayWithRandomNumbers(int[] array);


    public void printArrayToConsole(int[] array);

    public int findMaxNumber(int[] array);

    public int findMinNumber(int[] array);

}
