public class Player {
    
    private String name;
    private int score;
    private int number;

    Player(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void upScore() {
        score++;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }
}