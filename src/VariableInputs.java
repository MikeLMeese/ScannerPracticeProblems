import java.util.Scanner;

public class VariableInputs {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a string of text:");
        String text = scanner.nextLine();
        System.out.println("Enter an integer:");
        Integer number = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double:");
        Double dbl = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value:");
        Boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + number);
        System.out.println("Your double is " + dbl);
        System.out.println("Your boolean is " + trueOrFalse);
    }
}