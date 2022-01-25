package student_stanislav_p.lesson_3_oop_first_look.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task10 {


        public static void main(String[] args) {

            String s1_1 = "Hello Java";
            System.out.println(s1_1);



            String s1_2 = new String("Hello Java");
            System.out.println(s1_2);


            String s3 = "Hello";
            String str3 = "Java";
            String str3_1 = s3.concat(str3);
            System.out.println(str3_1);


            String s4 = "Hello";
            String str4 = "Java";
            String str4_1 = s4+str4;
            String str4_2 = "Java"+11;
            System.out.println(str4_1);
            System.out.println(str4_2);


            String s5 = "Hell";
            String s5_1 = "Hello";
            String s5_2 = "Hello";
            boolean b5 = s5_1.equals(s5_2);    //true

            System.out.println(s5);
            System.out.println(s5_1);
            System.out.println(s5_2);

            System.out.println(b5);

            b5 =	s5.equals(s5_1) ;   //false
            System.out.println(b5);


            String s6_1 = "Java";
            String s6_2 = "Java";
            String s6_3 = new String ("Java"); // ??? почему значения переменных разное???

            boolean b6 = (s6_1 == s6_2);     //true
            System.out.println(b6);

            b6 =	(s6_1 == s6_3);      //false // ??? почему значения переменных разное???

            System.out.println(s6_1);
            System.out.println(s6_2);
            System.out.println(s6_3);
            System.out.println(b6);
        }

}
