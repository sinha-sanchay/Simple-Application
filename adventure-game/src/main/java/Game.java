public class Game {
    private String state;

    public Game() {
        this.state = "initialized";
    }

    public void start() {
        System.out.println("Game is starting...");
        state = "started";
        play();
    }

    public void play() {
        System.out.println("Playing the game...");
        // Game logic goes here
        end();
    }

    public void end() {
        System.out.println("Game has ended.");
        state = "ended";
    }
}