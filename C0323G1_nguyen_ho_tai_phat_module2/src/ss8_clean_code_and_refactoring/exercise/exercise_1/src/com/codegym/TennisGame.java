package ss8_clean_code_and_refactoring.exercise.exercise_1.src.com.codegym;

public class TennisGame {

    public static String equalPoint(int point){
        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        String result = "";
        switch (point) {
            case LOVE:
                result = "Love-All";
                break;
            case FIFTEEN:
                result = "Fifteen-All";
                break;
            case THIRTY:
                result = "Thirty-All";
                break;
            case FORTY:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }

    public static String displayScore(int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        boolean beforeDeuce = firstPlayerScore < 4 && secondPlayerScore < 4;
        boolean equalPoints = firstPlayerScore == secondPlayerScore;
        if (secondPlayerScore < 0 && firstPlayerScore < 0) {
            score = "Invalid score";
        } else if (beforeDeuce && equalPoints) {
            score = equalPoint(firstPlayerScore) + " - All";
        } else if (beforeDeuce) {
            score = equalPoint(firstPlayerScore) + " - " + equalPoint(secondPlayerScore);
        } else if (equalPoints) {
            score = "Deuce";
        } else {
            int minusScore = firstPlayerScore - secondPlayerScore;
            switch (minusScore) {
                case 1:
                    score = "Advantage FirstPlayer";
                    break;
                case -1:
                    score = "Advantage SecondPlayer";
                    break;
                case 2:
                    score = "Win for FirstPlayer";
                    break;
                case -2:
                    score = "Win for SecondPlayer";
                    break;
                default:
                    score = "Invalid score";
            }
        }
        return score;
    }
}