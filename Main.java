public class Main {

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        int Winner = Game(p1, p2);
        if (Winner == 1) {
            System.out.println("Player 1 has won!");
        } else if (Winner == 2) {
            System.out.println("Player 2 Has won!");
        }
    }

    public static int Game(Player p1, Player p2) {
        int winner = -1;
        Boolean end = false;
        while (!p1.isAtFinish() && !p2.isAtFinish()) {
            int mv = Player.RollDice();
            p1.check(mv);
            if (p1.isAtFinish() && !end) {
                winner = 1;
                end = true;
            }
            mv = Player.RollDice();
            p2.check(mv);
            if (p2.isAtFinish() && !end) {
                winner = 2;
                end = true;
            }
        }
        return winner;
    }
}