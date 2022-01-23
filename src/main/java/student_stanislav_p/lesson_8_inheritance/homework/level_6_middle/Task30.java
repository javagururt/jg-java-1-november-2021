package student_stanislav_p.lesson_8_inheritance.homework.level_6_middle;


class NoVararg {

    public int sumNumber(int a, int b){
        return a+b;
    }

    public int sumNumber(int a, int b, int c){
        return a+b+c;
    }

}

class VarargExample {

    public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

}

public class Task30 {
    public static void main(String[] args) {

        NoVararg obj = new NoVararg();
        System.out.println(obj.sumNumber(1, 2));
        System.out.println(obj.sumNumber(1, 2, 3));

        VarargExample ex = new VarargExample();

        int sum2 = ex.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = ex.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);

    }
}
