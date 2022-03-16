package student_eduards_puzirevskis.lesson_15.level_3_4_junior;

import java.util.Objects;

class TennisGame3 implements TennisGame {

     private int secondPlayerScore;
     private int firstPlayerScore;
     private String firstPlayerName;
     private String secondPlayerName;

     public TennisGame3(String firstPlayerName, String secondPlayerName) {
         this.firstPlayerName = firstPlayerName;
         this.secondPlayerName = secondPlayerName;
     }

     public String score() {
         String s;
         if (firstPlayerScore < 4 && secondPlayerScore < 4 && !(firstPlayerScore + secondPlayerScore == 6)) {
             String[] playerResult = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
             s = playerResult[firstPlayerScore];
             return s + " - " + playerResult[secondPlayerScore];
         } else {
             if (firstPlayerScore == secondPlayerScore)
                 return "Deuce";
             s = firstPlayerScore > secondPlayerScore ? firstPlayerName : secondPlayerName;
             return ((firstPlayerScore-secondPlayerScore)*(firstPlayerScore-secondPlayerScore) == 1) ? "Advantage " + s : "Win " + s;
         }
     }

     public void wonPoint(String playerName) {
         if (Objects.equals(playerName, "First player"))
             this.firstPlayerScore += 1;
         else
             this.secondPlayerScore += 1;

     }

}
