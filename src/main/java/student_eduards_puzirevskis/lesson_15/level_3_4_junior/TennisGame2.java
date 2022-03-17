package student_eduards_puzirevskis.lesson_15.level_3_4_junior;

import java.util.Objects;

class TennisGame2 implements TennisGame {

     public int firstPlayerPoints = 0;
     public int secondPlayerPoints = 0;

     public String firstPlayerResult = "";
     public String secondPlayerResult = "";
     private String player1Name;
     private String player2Name;
     private String[] playerActualResult = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
     private String actualScore = "";


    public TennisGame2(String player1Name, String player2Name) {
         this.player1Name = player1Name;
         this.player2Name = player2Name;
     }

     public String score() {
         if (firstPlayerPoints == secondPlayerPoints && firstPlayerPoints < 4) {
             if (firstPlayerPoints ==0)
                 actualScore = playerActualResult[0];
             if (firstPlayerPoints ==1)
                 actualScore = playerActualResult[1];
             if (firstPlayerPoints ==2)
                 actualScore = playerActualResult[2];
             actualScore = actualScore + " - " + actualScore;
         }
         if (firstPlayerPoints == secondPlayerPoints && firstPlayerPoints >=3)
             actualScore = "Deuce";

         if (firstPlayerPoints > 0 && secondPlayerPoints ==0) {
             if (firstPlayerPoints ==1)
                 firstPlayerResult = playerActualResult[1];
             if (firstPlayerPoints ==2)
                 firstPlayerResult = playerActualResult[2];
             if (firstPlayerPoints ==3)
                 firstPlayerResult = playerActualResult[3];

             secondPlayerResult = "Love";
             actualScore = firstPlayerResult + " - " + secondPlayerResult;
         }
         if (secondPlayerPoints > 0 && firstPlayerPoints ==0) {
             if (secondPlayerPoints ==1)
                 secondPlayerResult = playerActualResult[1];
             if (secondPlayerPoints ==2)
                 secondPlayerResult = playerActualResult[2];
             if (secondPlayerPoints ==3)
                 secondPlayerResult = playerActualResult[3];

             firstPlayerResult = "Love";
             actualScore = firstPlayerResult + " - " + secondPlayerResult;
         }

         if (firstPlayerPoints > secondPlayerPoints && firstPlayerPoints < 4) {
             if (firstPlayerPoints ==2)
                 firstPlayerResult = playerActualResult[2];
             if (firstPlayerPoints ==3)
                 firstPlayerResult = playerActualResult[3];
             if (secondPlayerPoints ==1)
                 secondPlayerResult = playerActualResult[1];
             if (secondPlayerPoints ==2)
                 secondPlayerResult = playerActualResult[2];
             actualScore = firstPlayerResult + " - " + secondPlayerResult;
         }
         if (secondPlayerPoints > firstPlayerPoints && secondPlayerPoints < 4) {
             if (secondPlayerPoints ==2)
                 secondPlayerResult = playerActualResult[2];
             if (secondPlayerPoints ==3)
                 secondPlayerResult = playerActualResult[3];
             if (firstPlayerPoints ==1)
                 firstPlayerResult = playerActualResult[1];
             if (firstPlayerPoints ==2)
                 firstPlayerResult = playerActualResult[2];
             actualScore = firstPlayerResult + " - " + secondPlayerResult;
         }

         if (firstPlayerPoints > secondPlayerPoints && secondPlayerPoints >= 3) {
             actualScore = "Advantage First player";
         }

         if (secondPlayerPoints > firstPlayerPoints && firstPlayerPoints >= 3) {
             actualScore = "Advantage Second player";
         }

         if (playerWinCondition(firstPlayerPoints, secondPlayerPoints)) {
             actualScore = "Win First player";
         }
         if (playerWinCondition(secondPlayerPoints, firstPlayerPoints)) {
             actualScore = "Win Second player";
         }
         return actualScore;
     }

    private boolean playerWinCondition(int firstPlayerPoints, int secondPlayerPoints) {
        return firstPlayerPoints >= 4 && secondPlayerPoints >= 0 && (firstPlayerPoints - secondPlayerPoints) >= 2;
    }

    public void wonPoint(String player) {
         if (Objects.equals(player, "First player"))
             firstPlayerPoints++;
         if (Objects.equals(player, "Second player"))
             secondPlayerPoints++;
     }

}
