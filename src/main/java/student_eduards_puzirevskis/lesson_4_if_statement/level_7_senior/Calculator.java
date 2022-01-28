package student_eduards_puzirevskis.lesson_4_if_statement.level_7_senior;


     class Calculator {
         public int firstNumber;
         public int secondNumber;
         public int number;
         public int thirdNumber;

         public int sum(int firstNumber, int secondNumber) {
             return firstNumber + secondNumber;
         }
         public int subtraction(int firstNumber, int secondNumber) {
             return firstNumber - secondNumber;
         }
         public int reverseSubtraction(int firstNumber, int secondNumber) {
             return secondNumber - firstNumber;
         }
         public int division(int firstNumber, int secondNumber) {
             return (firstNumber/secondNumber);
         }
         public int reverseDivision( int firstNumber, int secondNumber) {
             return (secondNumber/firstNumber);
         }
         public int multiplication( int firstNumber, int secondNumber) {
             return (firstNumber*secondNumber);
         }
         public boolean isEven(int number) {
             return number % 2 != 1;
         }
         public String maxOfTwoNumbers(int firstNumber, int secondNumber) {
             if (firstNumber>secondNumber) {
                 return "firstNumber";
             } else if (firstNumber<secondNumber) {
                 return "secondNumber";
             } else {
                 return "Numbers are equal";
             }
         }

         public String maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
             if (firstNumber>secondNumber && firstNumber>thirdNumber) {
                 return "firstNumber";
             } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
                 return "secondNumber";
             } else if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
                 return "ThirdNumber";
             } else if (firstNumber==secondNumber && firstNumber>thirdNumber){
                 return "FirstEqualsSecondAndBiggerThanThird";
             } else if (firstNumber==thirdNumber && firstNumber>secondNumber) {
                 return "FirstEqualsThirdAndBiggerThanSecond";
             } else if (secondNumber==thirdNumber && secondNumber>firstNumber) {
                 return "SecondEqualsThirdAndBiggerThanFirst";
             } else {
                 return "AllAreEqual";
             }

         }
     }
