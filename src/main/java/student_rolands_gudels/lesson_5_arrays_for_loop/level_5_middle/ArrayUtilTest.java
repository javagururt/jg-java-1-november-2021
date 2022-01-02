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
            int expected = 666;
            int actual = arrayUtil.array.length;
            if (actual == expected) {
                System.out.println("shouldCreateArray " + "PASSED " + "actual: " + actual + " expected: " + expected);
            } else {
                System.out.println("shouldCreateArray " + "FAILED " + "actual: " + actual + " expected: " + expected);
            }
        }

       void shouldFindMaxNumber() {
          Task_31.ArrayUtil arrayUtil = new Task_31.ArrayUtil();
          arrayUtil.shouldCreateArray();
          int expected = 3;
          int actual = arrayUtil.findMaxNumber(arrayUtil.shouldCreateArray());
          if (actual == expected) {
              System.out.println("shouldFindMaxNumber " + "PASSED " + "actual: " + actual + " expected: " + expected);
          } else {
              System.out.println("shouldFindMaxNumber " + "FAILED " + "actual: " + actual + " expected: " + expected);
          }
      }
      void shouldFindMinNumber() {
          Task_31.ArrayUtil arrayUtil = new Task_31.ArrayUtil();
          arrayUtil.shouldCreateArray();
          int expected = -1;
          int actual = arrayUtil.findMinNumber(arrayUtil.shouldCreateArray());
          if (actual == expected) {
              System.out.println("shouldFindMinNumber " + "PASSED " + "actual: " + actual + " expected: " + expected);
          } else {
              System.out.println("shouldFindMinNumber " + "FAILED " + "actual: " + actual + " expected: " + expected);
          }
      }
    }
