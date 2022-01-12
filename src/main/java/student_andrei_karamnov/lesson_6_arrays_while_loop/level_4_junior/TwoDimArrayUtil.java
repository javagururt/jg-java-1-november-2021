package student_andrei_karamnov.lesson_6_arrays_while_loop.level_4_junior;

class TwoDimArrayUtil {


    public void printTwoDimArrayToConsole(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
                }
                System.out.println();
            }
    }
    public void fillTwoDimArrayWithRandomNumbers(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (int) (Math.random() * 999);
            }
        }
    }
    public int findSumOfElementsInTwoDimArray(int[][] twoDimArray){
        int sum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                sum += twoDimArray[i][j];
            }
        }
        return sum;
    }
}