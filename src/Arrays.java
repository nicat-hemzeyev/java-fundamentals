import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İstifadəçidən array uzunluğunu almaq
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Array elementlərini istifadəçidən almaq
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Array elementlərini çap etmək
        System.out.println("\nArray elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Ən böyük və ən kiçik elementləri tapmaq
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("\n\nMaximum value: " + max);
        System.out.println("Minimum value: " + min);

        // Array elementlərinin cəmini və ortasını tapmaq
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / size;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average value: " + average);
    }
}
