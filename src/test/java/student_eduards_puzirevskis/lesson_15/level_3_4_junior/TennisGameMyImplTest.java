package student_eduards_puzirevskis.lesson_15.level_3_4_junior;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class TennisGameMyImplTest {

    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public TennisGameMyImplTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][]{
                {0, 0, "Love - Love"},
                {1, 1, "Fifteen - Fifteen"},
                {2, 2, "Thirty - Thirty"},
                {3, 3, "Deuce"},
                {4, 4, "Deuce"},

                {1, 0, "Fifteen - Love"},
                {0, 1, "Love - Fifteen"},
                {2, 0, "Thirty - Love"},
                {0, 2, "Love - Thirty"},
                {3, 0, "Forty - Love"},
                {0, 3, "Love - Forty"},
                {4, 0, "Win First player"},
                {0, 4, "Win Second player"},

                {2, 1, "Thirty - Fifteen"},
                {1, 2, "Fifteen - Thirty"},
                {3, 1, "Forty - Fifteen"},
                {1, 3, "Fifteen - Forty"},
                {4, 1, "Win First player"},
                {1, 4, "Win Second player"},

                {3, 2, "Forty - Thirty"},
                {2, 3, "Thirty - Forty"},
                {4, 2, "Win First player"},
                {2, 4, "Win Second player"},

                {4, 3, "Advantage First player"},
                {3, 4, "Advantage Second player"},
                {5, 4, "Advantage First player"},
                {4, 5, "Advantage Second player"},
                {15, 14, "Advantage First player"},
                {14, 15, "Advantage Second player"},

                {6, 4, "Win First player"},
                {4, 6, "Win Second player"},
                {16, 14, "Win First player"},
                {14, 16, "Win Second player"},
        });
    }

    public void checkAllScores(TennisGame game) {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        for (int i = 0; i < highestScore; i++) {
            if (i < this.player1Score)
                game.wonPoint("First player");
            if (i < this.player2Score)
                game.wonPoint("Second player");
        }
        assertEquals(this.expectedScore, game.score());
    }

    @Test
    public void checkAllScoresTennisGameMyImpl() {
        TennisGameMyImpl game = new TennisGameMyImpl("First player", "Second player");
        checkAllScores(game);
    }

    @Test
    public void checkAllScoresTennisGame1() {
        TennisGame1 game = new TennisGame1("First player", "Second player");
        checkAllScores(game);
    }

    @Test
    public void checkAllScoresTennisGame2() {
        TennisGame2 game = new TennisGame2("First player", "Second player");
        checkAllScores(game);
    }

    @Test
    public void checkAllScoresTennisGame3() {
        TennisGame3 game = new TennisGame3("First player", "Second player");
        checkAllScores(game);
    }


    // Дальше идут тесты, которые я писал изначально. Они тоже все проходят.



//    TennisPlayer first = new TennisPlayer("First");
//    TennisPlayer second = new TennisPlayer("Second");
//    TennisGameImpl victim = new TennisGameImpl(first,second);
//
//    @Test
//    public void shouldReturnLoveLove() {
//        String actual = victim.score();
//        String expected = "Love - Love";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnFifteenLove() {
//        victim.wonPoint(player1);
//        String actual = victim.score();
//        String expected = "Fifteen - Love";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnFifteenFifteen() {
//        victim.wonPoint(player1);
//        victim.wonPoint(second);
//        String actual = victim.score();
//        String expected = "Fifteen - Fifteen";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnDeuce() {
//        victim.wonPoint(player1);
//        victim.wonPoint(player1);
//        victim.wonPoint(player1);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        String actual = victim.score();
//        String expected = "Deuce";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnAdvantageFirst() {
//        victim.wonPoint(player1);
//        victim.wonPoint(player1);
//        victim.wonPoint(player1);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(player1);
//        String actual = victim.score();
//        String expected = "Advantage First player";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnAdvantageSecond() {
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        String actual = victim.score();
//        String expected = "Advantage Second player";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnFirstPlayerWin() {
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        String actual = victim.score();
//        String expected = "Win First player";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnSecondPlayerWin() {
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        String actual = victim.score();
//        String expected = "Win Second player";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnFirstPlayerWinAfterAdvantage() {
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        String actual = victim.score();
//        String expected = "Win First player";
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturnSecondPlayerWinAfterAdvantage() {
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        victim.wonPoint(first);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        victim.wonPoint(second);
//        String actual = victim.score();
//        String expected = "Win Second player";
//        assertEquals(actual, expected);
//    }


}