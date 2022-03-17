package student_eduards_puzirevskis.lesson_10_junit.level_3_4_junior;



class GameOfLifeNextGenerationCalculator {

    public int[] check(String[][] lifeMap, int[] point) {

        int counter = 0;
        for (int i = 0; i < lifeMap.length; i++) {
            for (int j = 0; j < lifeMap.length; j++) {
                int life = 0;
                if (i + 1 < 4 && lifeMap[i + 1][j].equals("●")) {
                    life++;
                }
                if (i + 1 < 4 && j + 1 < 4 && lifeMap[i + 1][j + 1].equals("●")) {
                    life++;
                }
                if (i + 1 < 4 && j - 1 >= 0 && lifeMap[i + 1][j - 1].equals("●")) {
                    life++;
                }
                if (j + 1 < 4 && lifeMap[i][j + 1].equals("●")) {
                    life++;
                }
                if (j - 1 >= 0 && lifeMap[i][j - 1].equals("●")) {
                    life++;
                }
                if (i - 1 >= 0 && lifeMap[i - 1][j].equals("●")) {
                    life++;
                }
                if (i - 1 >= 0 && j + 1 < 4 && lifeMap[i - 1][j + 1].equals("●")) {
                    life++;
                }
                if (i - 1 >= 0 && j - 1 >= 0 && lifeMap[i - 1][j - 1].equals("●")) {
                    life++;
                }
                if (lifeMap[i][j].equals("●")) {
                    if (life == 1)
                        point[counter] = 1;
                    else if (life == 2 || life == 3)
                        point[counter] = 2;
                    else if (life >= 4)
                        point[counter] = 1;
                } else {
                    if (life == 3)
                        point[counter] = 3;
                }
                counter++;
            }
        }
        return point;
    }

    public String[][] calculate(String[][] lifeMap, int[] point) {
        int counter = 0;
        for (int i = 0; i < lifeMap.length; i++) {
            for (int j = 0; j < lifeMap.length; j++) {
                if (point[counter] == 1)
                    lifeMap[i][j] = "o";
                if (point[counter] == 3)
                {lifeMap[i][j] = "●";
                    counter++;
                }
            }
        }
        return lifeMap;
    }

    public void printLifeMap(String[][] lifeMap){
        for (String[] strings : lifeMap) {
            for (int j = 0; j < lifeMap.length; j++) {
                if (j == lifeMap.length - 1)
                    System.out.println(strings[j] + " ");
                else
                    System.out.print(strings[j] + " ");
            }
        }
    }

//    public void printField(String[][] lifeMap){
//        for (String[] strings : lifeMap) {
//            for (int j = 0; j < lifeMap.length; j++) {
//                if (j == lifeMap.length - 1)
//                    System.out.println(strings[j] + " ");
//                else
//                    System.out.print(strings[j] + " ");
//            }
//        }
//        System.out.println();
//    }
}
