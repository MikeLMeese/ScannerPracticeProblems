import java.util.Scanner;

public class HelloThere {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello there! How are you doing today?");
        scanner.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        scanner.nextLine();
        System.out.println("You bore me mortal. Goodbye.");
    }
}