package student_eduards_puzirevskis.lesson_15.level_3_4_junior;

import java.util.Map;

class TennisGameMyImpl implements TennisGame {

    public TennisGameMyImpl(String firstPlayerName, String secondPlayerName) {
         this.firstPlayerName = firstPlayerName;
         this.secondPlayerName = secondPlayerName;
     }

    private String firstPlayerName;
    private String secondPlayerName;
    private int firstPlayerScore = 0;
    private int secondPlayerScore = 0;

    private final Map<Integer,String> scoreStrings = Map.of(
            0,"Love",
            1, "Fifteen",
            2,"Thirty",
            3,"Forty",
            4,"Deuce",
            5,"Advantage First player",
            6,"Advantage Second player",
            7, "Win First player",
            8,"Win Second player"
    );

     @Override
     public void wonPoint(String tennisPlayer) {
         if (tennisPlayer.equals(firstPlayerName)) {
             firstPlayerScore++;
         }
         if (tennisPlayer.equals(secondPlayerName)) {
             secondPlayerScore++;
         }
     }

     @Override
     public String score() {
         if (firstPlayerScore == 4 && secondPlayerScore < 3) {
             return scoreStrings.get(7);
         }
         if (secondPlayerScore == 4 && firstPlayerScore < 3) {
             return scoreStrings.get(8);
         }
         if (winOrAdvantageBySeparation(firstPlayerScore, secondPlayerScore, 0)) {
             return scoreStrings.get(4);
         }
         if (winOrAdvantageBySeparation(firstPlayerScore, secondPlayerScore, 1)) {
             return scoreStrings.get(5);
         }
         if (winOrAdvantageBySeparation(secondPlayerScore, firstPlayerScore, 1)) {
             return scoreStrings.get(6);
         }
         if (winOrAdvantageBySeparation(firstPlayerScore, secondPlayerScore, 2)) {
             return scoreStrings.get(7);
         }
         if (winOrAdvantageBySeparation(secondPlayerScore, firstPlayerScore, 2)) {
             return scoreStrings.get(8);
         }
         return scoreStrings.get(firstPlayerScore) + " - " + scoreStrings.get(secondPlayerScore);
     }

    private boolean winOrAdvantageBySeparation(int firstPlayerScore, int secondPlayerScore, int separation) {
        return firstPlayerScore >= 3 && secondPlayerScore >= 3 && firstPlayerScore - secondPlayerScore == separation;
    }


}
