package student_eduards_puzirevskis.lesson_15.level_3_4_junior;

import java.util.Objects;

class TennisGame2 implements TennisGame {

     public int firstPlayerPoints = 0;
     public int secondPlayerPoints = 0;

     public String firstPlayerResult = "";
     public String secondPlayerResult = "";
     private String player1Name;
     private String player2Name;

     public TennisGame2(String player1Name, String player2Name) {
         this.player1Name = player1Name;
         this.player2Name = player2Name;
     }

     public String score() {
         String score = "";
         if (firstPlayerPoints == secondPlayerPoints && firstPlayerPoints < 4) {
             if (firstPlayerPoints ==0)
                 score = "Love";
             if (firstPlayerPoints ==1)
                 score = "Fifteen";
             if (firstPlayerPoints ==2)
                 score = "Thirty";
             score = score + " - " + score;
         }
         if (firstPlayerPoints == secondPlayerPoints && firstPlayerPoints >=3)
             score = "Deuce";

         if (firstPlayerPoints > 0 && secondPlayerPoints ==0) {
             if (firstPlayerPoints ==1)
                 firstPlayerResult = "Fifteen";
             if (firstPlayerPoints ==2)
                 firstPlayerResult = "Thirty";
             if (firstPlayerPoints ==3)
                 firstPlayerResult = "Forty";

             secondPlayerResult = "Love";
             score = firstPlayerResult + " - " + secondPlayerResult;
         }
         if (secondPlayerPoints > 0 && firstPlayerPoints ==0) {
             if (secondPlayerPoints ==1)
                 secondPlayerResult = "Fifteen";
             if (secondPlayerPoints ==2)
                 secondPlayerResult = "Thirty";
             if (secondPlayerPoints ==3)
                 secondPlayerResult = "Forty";

             firstPlayerResult = "Love";
             score = firstPlayerResult + " - " + secondPlayerResult;
         }

         if (firstPlayerPoints > secondPlayerPoints && firstPlayerPoints < 4) {
             if (firstPlayerPoints ==2)
                 firstPlayerResult ="Thirty";
             if (firstPlayerPoints ==3)
                 firstPlayerResult ="Forty";
             if (secondPlayerPoints ==1)
                 secondPlayerResult ="Fifteen";
             if (secondPlayerPoints ==2)
                 secondPlayerResult ="Thirty";
             score = firstPlayerResult + " - " + secondPlayerResult;
         }
         if (secondPlayerPoints > firstPlayerPoints && secondPlayerPoints < 4) {
             if (secondPlayerPoints ==2)
                 secondPlayerResult ="Thirty";
             if (secondPlayerPoints ==3)
                 secondPlayerResult ="Forty";
             if (firstPlayerPoints ==1)
                 firstPlayerResult ="Fifteen";
             if (firstPlayerPoints ==2)
                 firstPlayerResult ="Thirty";
             score = firstPlayerResult + " - " + secondPlayerResult;
         }

         if (firstPlayerPoints > secondPlayerPoints && secondPlayerPoints >= 3) {
             score = "Advantage First player";
         }

         if (secondPlayerPoints > firstPlayerPoints && firstPlayerPoints >= 3) {
             score = "Advantage Second player";
         }

         if (firstPlayerPoints >=4 && secondPlayerPoints >=0 && (firstPlayerPoints - secondPlayerPoints)>=2) {
             score = "Win First player";
         }
         if (secondPlayerPoints >=4 && firstPlayerPoints >=0 && (secondPlayerPoints - firstPlayerPoints)>=2) {
             score = "Win Second player";
         }
         return score;
     }

     public void P1Score() {
         firstPlayerPoints++;
     }

     public void P2Score() {
         secondPlayerPoints++;
     }

     public void wonPoint(String player) {
         if (Objects.equals(player, "First player"))
             P1Score();
         else
             P2Score();
     }

}
