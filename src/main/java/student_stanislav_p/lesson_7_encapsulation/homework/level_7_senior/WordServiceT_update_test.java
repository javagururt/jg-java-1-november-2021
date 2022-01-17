package student_stanislav_p.lesson_7_encapsulation.homework.level_7_senior;


class WordServiceT_update_test {

    public static void main(String[] args) {

                WordServiceT_update_test Test1New = new WordServiceT_update_test();

                Test1New.getTextTest();

            }

            //-----------------------------------------

            void getTextTest() {

               WordServiceT newService1 =   new WordServiceT();

                String testText = "aaa1 world aaa3 aaa4 aaa3 world aaa7 aaa8 aaa8 world aaa11 world aaa11 aaa14 ";

                String expectedArray = "world";

                String realArray = newService1.findMostFrequentWord(testText);

                boolean expectedResult = true;

                boolean realResult = realArray.equals(expectedArray);

                checkTestResult("Test 1. 'createField'",realResult, expectedResult);

                //System.out.println(realArray);

                System.out.println("-------------------------------------------------------");

            }


           
            //--------------------------

            void checkTestResult(String nameTest, boolean realResult,  boolean expectedResult){

                if (realResult == expectedResult) {
                    System.out.println(nameTest + " Control is OK");
                } else {
                    System.out.println(nameTest + " Control is FAIL");
                }
            }
        }