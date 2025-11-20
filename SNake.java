import java.util.Scanner;
import java.util.Random;

public class SNake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int position = 0;
        System.out.println("====== SNAKE AND LADDER ======");

        // Loop until player reaches 100
        while (position < 100) {
            System.out.println("PRESS ENTER TO ROLL THE DICE :");
            sc.nextLine();

            int dice = ran.nextInt(6) + 1;
            System.out.println("YOU ROLLED: " + dice);
            position += dice;

            if (position > 100) {
                position = 100; // stay at max 100
            }

            // Snakes
            if (position == 16) {
                System.out.println(" Snake  Go down to 5");
                position = 5;
            }
            if (position == 23) {
                System.out.println("Snake  Go down to 7");
                position = 7;
            }
            if (position == 33) {
                System.out.println(" Snake  Go down to 20");
                position = 20;
            }
            if (position == 45) {
                System.out.println(" Snake  Go down to 17");
                position = 17;
            }
            if (position == 66) {
                System.out.println("Snake  Go down to 50");
                position = 50;
            }
            if (position == 78) {
                System.out.println(" Snake  Go down to 55");
                position = 55;
            }
            if (position == 88) {
                System.out.println(" Snake  Go down to 47");
                position = 47;
            }
            if (position == 94) {
                System.out.println(" Snake  Go down to 85");
                position = 85;
            }

            // Ladders
            if (position == 10) {
                System.out.println(" Ladder  Climb up to 30");
                position = 30;
            }
            if (position == 31) {
                System.out.println(" Ladder  Climb up to 49");
                position = 49;
            }
            if (position == 57) {
                System.out.println(" Ladder  Climb up to 72");
                position = 72;
            }
            if (position == 69) {
                System.out.println(" Ladder Climb up to 78");
                position = 78;
            }
            if (position == 87) {
                System.out.println(" Ladder  Climb up to 97");
                position = 97;
            }

            System.out.println("YOU ARE NOW AT : " + position);
        }

        System.out.println("🤩 YOU WIN 🤩");
        sc.close();
    }
}
