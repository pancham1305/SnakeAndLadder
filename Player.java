import java.util.Random;

public class Player {
    private int pos = 0;

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
        if (x + pos >= 100) {
            pos = 100;
            return;
        }
        pos += x;
    }

    public void check(int pos) {
        Random r = new Random();
        int option = r.nextInt(3);
        switch (option) {
            case 1 -> move(pos);// no snake found
            case 2 -> move(-pos);// snake found
        }
        return;
    }

    public int getPos() {
        return pos;
    }
}
