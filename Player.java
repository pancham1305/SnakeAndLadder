import java.util.Random;

public class Player {
    int pos = 0;

    public static int Dice() {
        Random r = new Random();
        int mv = r.nextInt(5) + 1;
        return mv;
    }

    public void move(int x) {
        if (x + pos < 0) {
            pos = 0;
            return;
        }
        pos += x;
    }
}
