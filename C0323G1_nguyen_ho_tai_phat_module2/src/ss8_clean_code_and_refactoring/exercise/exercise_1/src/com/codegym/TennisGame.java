package ss8_clean_code_and_refactoring.exercise.exercise_1.src.com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;

        if (player1Score == player2Score) {
            switch (player1Score) {
                case LOVE:
                    score = new StringBuilder("Love-All");
                    break;
                case FIFTEEN:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case THIRTY:
                    score = new StringBuilder("Thirty-All");
                    break;
                case FORTY:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score.append("-");
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}