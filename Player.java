import java.util.Random;

public class Player {
    private int pos = 0;

    public static int RollDice() {
        Random r = new Random();
        int mv = r.nextInt(5) + 1;
        return mv;
    }

    private void move(int x) {
        if (x + pos < 0) {
            pos = 0;
            return;
        }
        if (x + pos >= 100) {
            return;
        }
        pos += x;
    }

    public void check(int mv) {
        Random r = new Random();
        int option = r.nextInt(3);
        switch (option) {
            case 1 -> move(mv);// no snake found
            case 2 -> move(-mv);// snake found
        }
        return;
    }

    public Boolean isAtFinish() {
        return (pos == 100);
    }
}
