public class Player {
    
    private String name;
    private int score;

    Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void upScore() {
        score++;
    }

    public String toString() {
        return name;
    }
}