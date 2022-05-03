import java.util.Scanner;

public class Greeting {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("What's your name?");
        String reply = scanner.nextLine();
        System.out.println("Hi " + reply);
    }
}