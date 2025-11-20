import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Board {
    Map<Integer, Integer> snakes = new HashMap<>();
    Map<Integer, Integer> ladders = new HashMap<>();

    public Board() {
        snakes.put(16, 5);
        snakes.put(23, 7);
        snakes.put(33, 20);
        snakes.put(45, 17);
        snakes.put(66, 50);
        snakes.put(78, 55);
        snakes.put(88, 47);
        snakes.put(94, 85);

        ladders.put(10, 30);
        ladders.put(31, 49);
        ladders.put(57, 72);
        ladders.put(69, 78);
        ladders.put(87, 97);
    }

    public int checkPosition(int pos) {
        if (snakes.containsKey(pos)) {
            System.out.println("🐍 Snake! Go down to " + snakes.get(pos));
            return snakes.get(pos);
        }
        if (ladders.containsKey(pos)) {
            System.out.println("🪜 Ladder! Climb up to " + ladders.get(pos));
            return ladders.get(pos);
        }
        return pos;
    }
}

class Player {
    private int position = 0;

    public int getPosition() {
        return position;
    }

    public void setPosition(int pos) {
        position = pos;
    }
}

class Game {
    private Player player = new Player();
    private Board board = new Board();
    private Random rand = new Random();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("====== SNAKE AND LADDER (OOP Version) ======");

        while (player.getPosition() < 100) {
            System.out.println("Press ENTER to roll the dice...");
            sc.nextLine();

            int dice = rand.nextInt(6) + 1;
            System.out.println("YOU ROLLED: " + dice);

            int newPos = player.getPosition() + dice;
            if (newPos > 100) {
                System.out.println("You need exact number to reach 100. Stay at " + player.getPosition());
                continue;
            }

            newPos = board.checkPosition(newPos);
            player.setPosition(newPos);

            System.out.println("YOU ARE NOW AT: " + player.getPosition() + "\n");
        }

        System.out.println("🤩 YOU WIN! 🤩");
    }
}

public class SNakeoops{
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
