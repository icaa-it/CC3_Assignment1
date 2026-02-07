import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MDAS Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose (1-4): ");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
