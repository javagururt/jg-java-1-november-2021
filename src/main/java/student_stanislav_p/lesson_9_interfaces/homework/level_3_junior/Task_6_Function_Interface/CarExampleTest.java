package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_6_Function_Interface;


/**
 *
 *      * Applies this function to the given arguments.
 *      *
 *      * @param t the first function argument
 *      * @param u the second function argument
 *      * @return the function result

 *
 *  Функциональный интерфейс — это интерфейс,
 *  который содержит ровно один абстрактный метод,
 *  то есть описание метода без тела.
 *  Статические методы и методы по умолчанию при этом не в счёт,
 *  их в функциональном интерфейсе может быть сколько угодно.
 *
 * Когда параметром метода является функциональный интерфейс,
 * при вызове этого метода одним из аргументов должен быть блок кода.
 **/

public class CarExampleTest {

        private static void printTest(Car car, CheckCar check){
            if(check.test(car)){
                System.out.println(car);
            }
        }

        public static void main(String[] args) {
            Car audiA3 = new Car("AudiA3", true, true);
            Car audiA6 = new Car("AudiA6", true, false);
            printTest(audiA3, c -> c.isFullDrive());
            printTest(audiA3, c -> c.isGasEngine());
            printTest(audiA6, c -> c.isFullDrive());
            printTest(audiA6, c -> c.isGasEngine());
        }

}
