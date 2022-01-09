package student_stanislav_p.lesson_6_arrays_while_loop.homework.level_4_junior;

import java.util.Random;
import java.util.Scanner;

public class InfiniteBreakContinueLoop {

    public static void main(String[] args) {

        InfiniteBreakContinueLoop testLoop = new InfiniteBreakContinueLoop();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Test number # 1 - While Infinite  Loop");
        System.out.println("Test number # 2 - For   Infinite  Loop");
        System.out.println("Test number # 3 - While Infinite  Loop  Break");
        System.out.println("Test number # 4 - For   Infinite  Loop  Break");
        System.out.println("Test number # 5 - While Continue  Loop");
        System.out.println("Test number # 6 - For   Continue  Loop");

        System.out.println("Input test number between 1 and 6 -> ");



        int choose=scanner.nextInt();

        if (choose==1) {testLoop.WhileInfiniteLoop();}
        if (choose==2) {testLoop.ForInfiniteLoop();}
        if (choose==3) {testLoop.WhileInfiniteLoopBreak();}
        if (choose==4) {testLoop.ForInfiniteLoopBreak();}
        if (choose==5) {testLoop.WhileLoopContinue();}
        if (choose==6) {testLoop.ForLoopContinue();}


    }


//-------------------------------------------------
   /* Создайте класс WhileInfiniteLoop и в нём напишите бесконечный
цикл при помощи цикла while.*/
//-------------------------------------------------

    private void WhileInfiniteLoop() {

        System.out.println("infinite loop type 'while'");
        System.out.println("press ctrl+c to exit -> ");

        System.out.println("");

        //int min = Integer.MAX_VALUE;
        int min=0;

        boolean b=true;
        while (b) {

           min=min+1;
           //System.out.print(min);
           if (min==Integer.MAX_VALUE) {min =0;};
        }

        System.out.println("Stoped loop 1");

    }


//-------------------------------------------------
   /*

Создайте класс ForInfiniteLoop и в нём напишите бесконечный
цикл при помощи цикла for.
        */
//-------------------------------------------------

    private void ForInfiniteLoop() {

        System.out.println("infinite loop type 'for'");
        System.out.println("press ctrl+c to exit -> ");

        boolean done  = false;
        System.out.println("" );

        for (int i = 0; !done; ) {
            if (i==100_000) {done  = true;}
            
        }

    }

//-------------------------------------------------
   /*

        Создайте класс WhileInfiniteLoopBreak и в нём продемонстрируйте
        выход из бесконечного цикла реализованного при помощи цикла while.

    */
//-------------------------------------------------

    private void  WhileInfiniteLoopBreak() {
        Scanner sc = new Scanner(System.in);

        System.out.println("infinite loop type 'while' with brake");
        System.out.println("press 'q' to exit -> ");

                 while(true) {
                    String str = sc.next();
                    // выход при нажатии q
                    if ("q".equals(str)) {break; }
                }

    }

//-------------------------------------------------
   /*

        Создайте класс ForInfiniteLoopBreak и в нём продемонстрируйте
        выход из бесконечного цикла реализованного при помощи цикла for.

    */
//-------------------------------------------------


    private void  ForInfiniteLoopBreak() {

        Scanner sc = new Scanner(System.in);

        System.out.println("infinite loop type 'for' with break");
        System.out.println("press 'q' to exit ->  ");

        boolean done  = false;
        System.out.println("" );

        for (int i = 0; !done; ) {

            String str = sc.next();
            // выход при нажатии q
            if ("q".equals(str)) {break; }
        }

    }



//-------------------------------------------------
   /*

    Создайте класс WhileLoopContinue и в нём продемонстрируйте
как досрочно закончить текущую итерацию цикла while.

    */
//-------------------------------------------------

    private void  WhileLoopContinue() {

        Random random = new Random();

        int applesGood=0;
        int applesBad=0;
        int cake=0;
        int applesForCake = 10000;
        boolean applesChoose = true;

        System.out.println("infinite loop type 'for' with continue ");

        while(applesForCake>0) {

            applesForCake--;

            applesChoose =  (random.nextInt(5) == 0);


            if (applesChoose) {
                // яблоко выкинуть В Мусор;
                applesBad=applesBad+1;

                continue; // продолжим цикл
            }

            applesGood = applesGood +1;

            // положить В Пирог

            if (applesGood ==100) {
                applesGood = 0;
                cake ++;

            }


        }

        System.out.println("Totally "+ cake + " cakes are ready for cooking ");
        System.out.println("Totally used 10 000 apples  ");
        System.out.println((cake*100 + applesGood) + " apples used for cakes cooking ");
        System.out.println(applesBad + " apples used in the trash ");


    }

//-------------------------------------------------
   /*
Создайте класс ForLoopContinue и в нём продемонстрируйте
как досрочно закончить текущую итерацию цикла for.

    */
//-------------------------------------------------

    private void  ForLoopContinue() {


            for (int i = 1; i <= 7; i++){
                System.out.println(i + ": я выполянюсь перед continue!");
                if (i > 2)
                    continue;
                System.out.println("     "+ i + ": я выполянюсь всего два раза ;(");
            }


    }

}