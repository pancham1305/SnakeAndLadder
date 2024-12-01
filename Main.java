public class Main {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Game game = new Game();
        int winner = game.play(player1, player2);
        int diceRollCounts = game.getDiceRollCounts();
        System.out.println("Total Dice Rounds for the Game: " + diceRollCounts);
        if (winner == 1) {
            System.out.println("Player 1 has won!");
        } else if (winner == 2) {
            System.out.println("Player 2 Has won!");
        }
    }
}