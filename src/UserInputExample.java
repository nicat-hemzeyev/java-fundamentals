import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // İstifadəçidən ad almaq
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // İstifadəçidən ədəd almaq
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Square of " + number + " = " + (number * number));

        // Onluq ədəd almaq
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.println("Rounded value = " + Math.round(decimal));

        scanner.close();
    }
}

