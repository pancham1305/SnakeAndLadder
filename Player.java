import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private int currentPosition = 0;
    private List<Integer> positions = new ArrayList<>();

    Player() {
        positions.add(0);
    }

    public static int rollDice() {
        Random r = new Random();
        int mv = r.nextInt(5) + 1;
        return mv;
    }

    private void move(int x) {
        if (x + currentPosition < 0) {
            currentPosition = 0;
            positions.add(currentPosition);
            return;
        }
        if (x + currentPosition > 100) {
            positions.add(currentPosition);
            return;
        }
        currentPosition += x;
        positions.add(currentPosition);
    }

    public void isAtSnakeOrLadder(int mv) {
        Random r = new Random();
        int option = r.nextInt(3);
        switch (option) {
            case 1 -> move(mv);// ladder found
            case 2 -> move(-mv);// snake found
        }
        return;
    }

    public Boolean isAtFinish() {
        return (currentPosition == 100);
    }

    public int getPosition() {
        return currentPosition;
    }
}
