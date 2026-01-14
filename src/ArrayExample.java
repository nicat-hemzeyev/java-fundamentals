public class ArrayExample {
    public static void main(String[] args) {
        // Bir array yaratmaq
        int[] numbers = {5, 12, -3, 9, 0, 7};

        // Array elementlərini çap etmək
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ən böyük və ən kiçik elementləri tapmaq
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);

        // Mütləq qiymətləri çap etmək
        System.out.println("Absolute values:");
        for (int num : numbers) {
            System.out.print(Math.abs(num) + " ");
        }
        System.out.println();

        // Array elementlərinin kvadratını çap etmək
        System.out.println("Squares:");
        for (int num : numbers) {
            System.out.print(Math.pow(num, 2) + " ");
        }
    }
}

