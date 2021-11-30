package student_stanislav_p.Lesson_1;

/**
 *
 */
class Lesson1_Ex11_2 {
    public static void main(String args []) {
        int num1; // в этой строке кода объявляется переменная с именем num
        num1 = 50; // в этой строке кода переменной num1 присваивается значение 50

        int num2; // в этой строке кода объявляется переменная с именем num
        num2 = 3; // в этой строке кода переменной num2 присваивается значение 3


        System.out.println("Это переменная num1: " + num1);
        System.out.println("Это переменная num2: " + num2);

        int num3; // в этой строке кода объявляется переменная с именем num3

        num3 = num1 / num2;

        System.out.print("Значение деления  равно ");
        System.out.println(num3);
    }
}