public class Player {
    
    private String name;
    private int score;
    private int guessNumber;

    Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void upScore() {
        score++;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String toString() {
        return name;
    }
}