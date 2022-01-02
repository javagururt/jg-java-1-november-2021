package student_rolands_gudels.lesson_5_arrays_for_loop.level_5_middle;

  class ArrayUtilTest {
     public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }
        private void shouldCreateArray () {
            Task_31.ArrayUtil arrayUtil = new Task_31.ArrayUtil();
            arrayUtil.createArray(666);
           /* int expected = 666;
            int actual = arrayUtil.array.length;
            if (actual == expected) {
                System.out.println("shouldCreateArray " + "PASSED " + "actual: " + actual + " expected: " + expected);
            } else {
                System.out.println("shouldCreateArray " + "FAILED " + "actual: " + actual + " expected: " + expected);
            }*/
            passedOrFailed("shouldCreateArray",arrayUtil.array.length,666);

        }

       void shouldFindMaxNumber() {
          Task_31.ArrayUtil arrayUtil = new Task_31.ArrayUtil();
          arrayUtil.shouldCreateArray();
//          /*int expected = 3;
//          int actual = arrayUtil.findMaxNumber(arrayUtil.shouldCreateArray());
//         *//* if (actual == expected) {
//              System.out.println("shouldFindMaxNumber " + "PASSED " + "actual: " + actual + " expected: " + expected);
//          } else {
//              System.out.println("shouldFindMaxNumber " + "FAILED " + "actual: " + actual + " expected: " + expected);
//          }*/
           passedOrFailed("shouldFindMaxNumber",arrayUtil.findMaxNumber(arrayUtil.shouldCreateArray()),3);
      }
      void shouldFindMinNumber() {
          Task_31.ArrayUtil arrayUtil = new Task_31.ArrayUtil();
          arrayUtil.shouldCreateArray();
//          /*int expected = -1;
//          int actual = arrayUtil.findMinNumber(arrayUtil.shouldCreateArray());
//          *//*if (actual == expected) {
//              System.out.println("shouldFindMinNumber " + "PASSED " + "actual: " + actual + " expected: " + expected);
//          } else {
//              System.out.println("shouldFindMinNumber " + "FAILED " + "actual: " + actual + " expected: " + expected);
//          }*/
          passedOrFailed("shouldFindMinNumber",arrayUtil.findMinNumber(arrayUtil.shouldCreateArray()),-1);
      }

      void passedOrFailed(String testName, int actual,int expected) {
          if (actual == expected) {
              System.out.println(testName + "PASSED " + "actual: " + actual + " expected: " + expected);
          } else {
              System.out.println(testName + "FAILED " + "actual: " + actual + " expected: " + expected);
          }
      }
    }
