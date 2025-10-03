public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;
    public Game() {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }
    public boolean isBonus() {
        return bonus;
    }
    public void play() {
        System.out.println("Play not yet implemented.");
    }
    public int getScore() {
        return 0;
    }
    public int playManyTimes(int num) {
        int topScore = 0;
        return topScore;
    }
}
