package student_stanislav_p.Lesson_1;

class Lesson1_Ex11_1 {
    public static void main(String args []) {
        int num1; // в этой строке кода объявляется переменная с именем num1
        num1 = 74; // в этой строке кода переменной num1 присваивается значение 74

        int num2; // в этой строке кода объявляется переменная с именем num2
        num2 = 36; // в этой строке кода переменной num2 присваивается значение 36


        System.out.println("Это переменная num1: " + num1);
        System.out.println("Это переменная num2: " + num2);

        int num3; // в этой строке кода объявляется переменная с именем num3

        num3 = num1 + num2;

        System.out.print("Значение суммы равно ");
        System.out.println(num3);
    }
}