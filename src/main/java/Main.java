import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, String> diceMap = new HashMap<Integer, String>() {{
        put(1, """
                -------
                |     |
                |  *  |
                |     |
                -------
                """);
        put(2, """
                -------
                |*    |
                |     |
                |    *|
                -------
                """);
        put(3, """
                -------
                |*    |
                |  *  |
                |    *|
                -------
                """);
        put(4, """
                -------
                |*   *|
                |     |
                |*   *|
                -------
                """);
        put(5, """
                -------
                |*   *|
                |  *  |
                |*   *|
                -------
                """);
        put(6, """
                -------
                |*   *|
                |*   *|
                |*   *|
                -------
                """);
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice < 1) {
            System.out.println("Invalid number of dice. Must be greater than 0.");
            return;
        }
        for (int i = 0; i < numOfDice; i++) {
            int roll = random.nextInt(6) + 1;
            System.out.println("Rolled: " + roll);
            rollDie(roll);
            total += roll;
        }
        System.out.println("Total: " + total);
        scanner.close();
    }

    static void rollDie(int roll) {
        if (!diceMap.containsKey(roll)) {
            System.out.println("Invalid roll");
            return;
        }
        System.out.println(diceMap.get(roll));
    }


}
