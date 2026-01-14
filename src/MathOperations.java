public class MathOperations {
    public static void main(String[] args) {
        double number1 = 16;
        double number2 = -7.5;
        double number3 = 5.6;
        // Kvadrat kök alma (sqrt)
        System.out.println("Square root of " + number1 + " = " + Math.sqrt(number1));

        // Kvadrata yüksəltmə (pow və sadə vurma)
        int base = 4;
        int square = base * base;
        System.out.println("Square of " + base + " (using multiplication) = " + square);
        System.out.println("Square of " + base + " (using Math.pow) = " + Math.pow(base, 2));

        // Mütləq qiymət (abs)
        System.out.println("Absolute value of " + number2 + " = " + Math.abs(number2));

        // Yuvarlaqlaşdırma (round)
        System.out.println("Rounded value of " + number3 + " = " + Math.round(number3));

        // Əlavə metodlar: max, min
        int a = 7, b = 3;
        System.out.println("Max of " + a + " and " + b + " = " + Math.max(a, b));
        System.out.println("Min of " + a + " and " + b + " = " + Math.min(a, b));

        // Təsadüfi ədəd (random)
        System.out.println("Random number between 0 and 1 = " + Math.random());
    }
}
