package student_eduards_puzirevskis.lesson_15.level_3_4_junior;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

class TennisGame1 implements TennisGame {

     private int firstPlayerScore = 0;
     private int secondPlayerScore = 0;
     private String player1Name;
     private String player2Name;

     public TennisGame1(String player1Name, String player2Name) {
         this.player1Name = player1Name;
         this.player2Name = player2Name;
     }

     public void wonPoint(String playerName) {
         if (Objects.equals(playerName, "First player"))
             firstPlayerScore++;
         else
             secondPlayerScore++;
     }

     public String score() {
         StringBuilder score = new StringBuilder();
         int tempScore;
         if (firstPlayerScore == secondPlayerScore) {
             score = sameScore();
         }
         else if (firstPlayerScore >=4 || secondPlayerScore >=4) {
             score = oneOfPlayerCanOrHasWin();
         }
         else {
             for (int i=1; i<3; i++) {
                 if (i==1) tempScore = firstPlayerScore;
                 else { score.append(" - "); tempScore = secondPlayerScore;}
                 switch (tempScore) {
                     case 0 -> score.append("Love");
                     case 1 -> score.append("Fifteen");
                     case 2 -> score.append("Thirty");
                     case 3 -> score.append("Forty");
                 }
             }
         }
         return score.toString();
     }

    @NotNull
    private StringBuilder oneOfPlayerCanOrHasWin() {
        StringBuilder score;
        int playerOutrunning = firstPlayerScore - secondPlayerScore;
        if (playerOutrunning==1) score = new StringBuilder("Advantage First player");
        else if (playerOutrunning ==-1) score = new StringBuilder("Advantage Second player");
        else if (playerOutrunning>=2) score = new StringBuilder("Win First player");
        else score = new StringBuilder("Win Second player");
        return score;
    }

    @NotNull
    private StringBuilder sameScore() {
        StringBuilder score;
        score = new StringBuilder(switch (firstPlayerScore) {
            case 0 -> "Love - Love";
            case 1 -> "Fifteen - Fifteen";
            case 2 -> "Thirty - Thirty";
            default -> "Deuce";
        });
        return score;
    }

}
