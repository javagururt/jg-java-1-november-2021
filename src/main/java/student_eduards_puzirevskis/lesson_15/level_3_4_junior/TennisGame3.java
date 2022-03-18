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
         String actualScore;
         if (firstPlayerScore < 4 && secondPlayerScore < 4 && !(firstPlayerScore + secondPlayerScore == 6)) {
             String[] playerResult = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
             actualScore = playerResult[firstPlayerScore];
             return actualScore + " - " + playerResult[secondPlayerScore];
         } else {
             if (firstPlayerScore == secondPlayerScore)
                 return "Deuce";
             actualScore = firstPlayerScore > secondPlayerScore ? firstPlayerName : secondPlayerName;
             return ((firstPlayerScore-secondPlayerScore)*(firstPlayerScore-secondPlayerScore) == 1) ? "Advantage " + actualScore : "Win " + actualScore;
         }
     }

     public void wonPoint(String playerName) {
         if (Objects.equals(playerName, "First player"))
             this.firstPlayerScore++;
         if (Objects.equals(playerName, "Second player"))
             this.secondPlayerScore++;
     }

}
