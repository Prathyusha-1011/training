import java.util.Random;
import java.util.Scanner;

public class SNakeExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int pos = 0;
        System.out.println("===== SIMPLE SNAKE AND LADDER =====");

        while (pos < 100) {
            try {
                System.out.println("Press Enter to roll the dice:");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            int dice = 0;
            try {
                dice = ran.nextInt(6) + 1;
            } catch (Exception e) {
                dice = 1;
            }

            System.out.println("You rolled: " + dice);
            pos += dice;

            if (pos > 100) pos = 100;

            if (pos == 16) pos = 5;
            if (pos == 23) pos = 7;
            if (pos == 33) pos = 20;
            if (pos == 45) pos = 17;
            if (pos == 66) pos = 50;
            if (pos == 78) pos = 55;
            if (pos == 88) pos = 47;
            if (pos == 94) pos = 85;

            if (pos == 10) pos = 30;
            if (pos == 31) pos = 49;
            if (pos == 57) pos = 72;
            if (pos == 69) pos = 78;
            if (pos == 87) pos = 97;

            System.out.println("You are now at: " + pos);
        }

        System.out.println("🎉 YOU WIN! 🎉");
        sc.close();
    }
}
