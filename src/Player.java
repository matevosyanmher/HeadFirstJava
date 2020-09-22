public class Player {
    public static int playerCount;
    public static String name;

    public Player(String name) {
        this.name = name;

        playerCount++;
    }
}

class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        System.out.println(Player.name);
        Player p = new Player("Martin");
        System.out.println(Player.playerCount);
        System.out.println(p.name);
    }
}