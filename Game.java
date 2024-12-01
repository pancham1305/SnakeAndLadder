public class Game {
    private int diceRollCounts = 0;

    public int play(Player p1, Player p2) {
        while (true) {
            int mv = Player.rollDice();
            diceRollCounts++;
            p1.isAtSnakeOrLadder(mv);
            System.out.println("Current Position of Player 1: " + p1.getPosition());
            if (p1.isAtFinish()) {
                return 1;
            }
            mv = Player.rollDice();
            diceRollCounts++;
            p2.isAtSnakeOrLadder(mv);
            System.out.println("Current Position of Player 2: " + p2.getPosition());
            if (p2.isAtFinish()) {
                return 2;
            }
        }
    }

    public int getDiceRollCounts() {
        return diceRollCounts;
    }

}
