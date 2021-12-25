package student_stanislav_p.lesson_4_if_statement.level_7_senior;

/*
class LeapYear {

    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.

        Чтобы определить, является ли год високосным, выполните следующие действия:

    1. Если год делится на 4 без остатка, перейдите на шаг 2. В противном случае перейдите к выполнению действия 5.
    2. Если год делится на 100 без остатка, перейдите на шаг 3. В противном случае перейдите к выполнению действия 4.
    3. Если год делится на 400 без остатка, перейдите на шаг 4. В противном случае перейдите к выполнению действия 5.
    4. Год високосный (366 дней).
    5. Год не високосный год (365 дней).

    }

}

 */
public class LeapYear {

    public boolean LeapYear(int year) {

        if (year % 4 == 0) {return true;}
        if ((year % 100 == 0) &&  (year % 400 == 0)) {return true;}

        else { return false;}
    }


}