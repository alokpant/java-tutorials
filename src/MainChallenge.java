public class MainChallenge {
    public static void main(String[] args) {
        int finalScore = calculateScore(true, 800, 5, 100);
        finalScore = calculateScore(true, 10000, 8, finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println(finalScore);
        }

        return finalScore;
    }
}
