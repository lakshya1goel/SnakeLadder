import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player();
        Player p2 = new Player();
        p1.setPlayerDetailsFromUserInput();
        p2.setPlayerDetailsFromUserInput();
        p1.getPlayerDetails();
        p2.getPlayerDetails();
    }
}
