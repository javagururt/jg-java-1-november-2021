package student_jurij_mardusevic.lesson_4_if_statement.homework.level_4_junior.Task_11;


import java.util.Scanner;

class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = getInt();
        int secondNumber = getInt();
        char operation = getOperation();
        int result = calc(firstNumber,secondNumber,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int firstNumber, int secondNumber, char operation){
        int result;
        switch (operation){
            case '+':
                result = firstNumber+secondNumber;
                break;
            case '-':
                result = firstNumber-secondNumber;
                break;
            case '*':
                result = firstNumber*secondNumber;
                break;
            case '/':
                result = firstNumber/secondNumber;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(firstNumber, secondNumber, getOperation());
        }
        return result;
    }

}