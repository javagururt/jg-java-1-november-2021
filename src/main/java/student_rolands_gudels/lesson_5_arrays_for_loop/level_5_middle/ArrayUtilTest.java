package student_rolands_gudels.lesson_5_arrays_for_loop.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
            passedOrFailed("shouldCreateArray",arrayUtil.array.length,666);
        }
       void shouldFindMaxNumber() {
          Task_31.ArrayUtil arrayUtil = new Task_31.ArrayUtil();
          arrayUtil.shouldCreateArray();
           passedOrFailed("shouldFindMaxNumber",arrayUtil.findMaxNumber(arrayUtil.shouldCreateArray()),3);
      }
      void shouldFindMinNumber() {
          Task_31.ArrayUtil arrayUtil = new Task_31.ArrayUtil();
          arrayUtil.shouldCreateArray();
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
